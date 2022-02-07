package Pages;

import Basepackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest
{
    //page factory or object repo
    @FindBy(id = "txtUsername")
    WebElement uname;
    @FindBy(id = "txtPassword")
    WebElement upass;
    @FindBy(id = "btnLogin")
    WebElement loginbtn;
    @FindBy(partialLinkText = "Forgot your password?")
    WebElement forgotpassbtn;
    //initializing page objects
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    //Actions
    public String Validateloginpagetitle()
    {
        return driver.getTitle();
    }
    public void userlogin()
    {
        uname.sendKeys(prop.getProperty("username"));
        upass.sendKeys(prop.getProperty("password"));
        loginbtn.click();
//        return new HomePage();
    }
    public void forgotpass()
    {
        forgotpassbtn.click();
        driver.navigate().back();

    }
}
