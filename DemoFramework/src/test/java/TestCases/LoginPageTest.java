package TestCases;

import Basepackage.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends BaseTest
{
    LoginPage obj;

    public LoginPageTest() {super();}

    @BeforeSuite
    public void setup()
    {
        initialization();
        obj= new LoginPage();
    }

    @Test(priority = 0)
    public void loginpagetitletest()
    {
       String logintitle= obj.Validateloginpagetitle();
        Assert.assertEquals(logintitle,"OrangeHRM");
    }

    @Test(priority = 2)
    public void userlogintest()
    {
        obj.userlogin();
    }

    @Test(priority = 1)
    public void forgotPasswrdButton()
    {
        obj.forgotpass();
    }

    @AfterSuite
    public void teardown()
    {
        driver.quit();
    }

}
