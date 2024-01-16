package Seleniumjava.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePOM {

    WebDriver driver;
    @FindBy(name = "username")
    private WebElement userNameInputField;
    @FindBy(name = "password")
    private WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(className = "orangehrm-login-forgot")
    private WebElement forgotPasswordLink;
    @FindBy(xpath = "//button[@type='button']")
    private WebElement cancelButton;
    @FindBy(xpath = "//a[@role='menuitem' and  (text()='Logout')]")
    private WebElement logoutButton;
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']//i")
    private WebElement userButton;

    public LoginPagePOM(WebDriver driver) {
        this.driver = driver;
// Call initElements() method by using PageFactory reference and pass driver and this as parameters.
        PageFactory.initElements(driver, this);
    }

    public void passwordInputEnter() {
        passwordInputField.sendKeys("Admin");
    }

    public void usernameInput() {
        userNameInputField.sendKeys("admin123");

    }

    public void submitButtonClick() {
        submitButton.click();
    }

    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
////        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userNameInputField));
        userNameInputField.sendKeys("Admin");
        passwordInputField.sendKeys("admin123");
        submitButton.click();

    }

    public void forgotPasswordPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink));
        forgotPasswordLink.click();

    }

    public void forgotPassword() {
        submitButton.click();

    }

    public void backToLoginPage() {
        cancelButton.click();

    }

    public void logout() {
        userButton.click();
        logoutButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}
