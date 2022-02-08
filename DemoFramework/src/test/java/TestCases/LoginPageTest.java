package TestCases;

import Basepackage.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

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

    @BeforeTest
    public void forgotPasswrdButton()
    {
        obj.forgotpass();
    }

    @BeforeClass
    public void userlogintest() throws IOException {
        obj.userlogin();
    }

    @Test
    public void loginpagetitletest()
    {
       String logintitle= obj.Validateloginpagetitle();
        Assert.assertEquals(logintitle,"OrangeHRM");
    }


    @AfterSuite
    public void teardown()
    {
        driver.quit();
    }

}
