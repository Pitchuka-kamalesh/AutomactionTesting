package TestCases;

import Seleniumjava.Pages.LoginPagePOM;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {


    @Test
    public void appTest(){
        System.out.println("Hello world");
    }

    @Test
    public void appSupport(){
        System.out.println("App Support");
    }

    @Test
    public void loginPage(){
        System.out.println(" We are in the login page");
        LoginPagePOM loginPom = new LoginPagePOM(driver);
        loginPom.login();
    }
    @Test
    public void forgotPasswordPage(){
        System.out.println(" we are in the Password reset page");
    }

    @Test
    public void homePageLinks(){
        System.out.println("Checking all the links in the Login page");
    }
}
