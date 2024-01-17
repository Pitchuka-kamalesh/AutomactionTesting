package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void driverSetup() {
        System.out.println("Intiating the webdrivermanager");
        WebDriverManager.firefoxdriver().setup();

    }

    @BeforeClass(alwaysRun = true)
    public void driverStartUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    @AfterTest(alwaysRun = true)
//    public void tearDown() {
//        System.out.println("closing the browser");
//        driver.close();
//    }
    @AfterSuite(alwaysRun = true)
    public void driverClosing() {
        System.out.println("quicting the driver");
        driver.quit();
    }
}
