package TestCases;

import Basepackage.BaseTest;
import PageFactory.ObjectFactory;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginPageTest extends BaseTest
{
//    ObjectFactory obj;

    public LoginPageTest() {super();}

    @BeforeSuite
    public void setup()
    {
        initialization();
//        obj= new LoginPage();
    }

    @BeforeTest
    public void forgotPasswrdButton()
    {
        obj.getlogin().forgotpass();
    }

    @BeforeClass
    public void userlogintest() throws IOException {
        obj.getlogin().userlogin();
    }

    @Test
    public void loginpagetitletest()
    {
       String logintitle= obj.getlogin().Validateloginpagetitle();
        Assert.assertEquals(logintitle,"OrangeHRM");
    }


    @AfterSuite
    public void teardown()
    {
        driver.quit();
    }

}
