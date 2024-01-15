package Seleniumjava.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
    WebDriver driver;
    @FindBy(name="username") private WebElement userNameInputField;
    @FindBy(name="password") private WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']")private WebElement submitButton;
    @FindBy(className = "orangehrm-login-forgot")private WebElement forgotPasswordLink;
    @FindBy(xpath = "//button[@type='button']")private WebElement cancelButton;

    public LoginPagePOM( WebDriver driver ) {
        this.driver = driver;
// Call initElements() method by using PageFactory reference and pass driver and this as parameters.
        PageFactory.initElements( driver, this);
    }

    public void passwordInputEnter(){
        passwordInputField.sendKeys("Admin");
    }

    public void usernameInput(){
        userNameInputField.sendKeys("admin123");

    }
    public void submitButtonClick(){
        submitButton.click();
    }

    public void login(){
        WebDriverWait wait = new WebDriverWait(driver, 20);

//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(userNameInputField.isDisplayed());
        userNameInputField.sendKeys("Admin");
        passwordInputField.sendKeys("admin123");
        submitButton.click();

    }

    public void forgotPasswordPage(){
        forgotPasswordLink.click();

    }

    public void forgotPassword(){
        userNameInputField.sendKeys();
        submitButton.click();

    }
    public void backToLoginPage(){
        cancelButton.click();

    }



}
