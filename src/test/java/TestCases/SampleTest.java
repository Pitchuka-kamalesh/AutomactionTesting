package TestCases;

import Seleniumjava.Pages.LoginPagePOM;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

    @Test(priority = 0)
    public void loginPage() {
        System.out.println(" We are in the login page");
        LoginPagePOM loginPom = new LoginPagePOM(driver);
        loginPom.login();
        loginPom.logout();
    }

    @Test(dependsOnMethods = {"loginPage"})
    public void forgotPasswordPage() {
        LoginPagePOM loginPom = new LoginPagePOM(driver);
        loginPom.forgotPasswordPage();
        loginPom.usernameInput();
        loginPom.forgotPassword();
        System.out.println("Reset password page exit");

    }

//    @Test
//    public void homePageLinks(){
//        System.out.println("Checking all the links in the Login page");
//    }
}
