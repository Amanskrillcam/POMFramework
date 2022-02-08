package Pages;

import Basepackage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtilClass;

import java.time.Duration;

public class HomePage extends BaseTest
{
    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement admin;
    @FindBy(id = "menu_pim_viewPimModule")
    WebElement pim;
    @FindBy(id = "menu_leave_viewLeaveModule")
    WebElement leave;
    @FindBy(id = "menu_time_viewTimeModule")
    WebElement time;
    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    WebElement recruitment;
    @FindBy(id = "menu_pim_viewMyDetails")
    WebElement myinfo;
    @FindBy(id = "menu__Performance")
    WebElement performance;
    @FindBy(id = "menu_dashboard_index")
    WebElement dashboard;
    @FindBy(id = "menu_directory_viewDirectory")
    WebElement directory;
    @FindBy(id = "menu_maintenance_purgeEmployee")
    WebElement maintenance;
    @FindBy(id = "menu_buzz_viewBuzz")
    WebElement buzz;
    @FindBy(partialLinkText = "Welcome")
    WebElement Welcomebtn;
    @FindBy(partialLinkText = "Logout")
    WebElement logoutbtn;
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public void validateAdminModule()
    {
        admin.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatePim()
    {
        pim.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validateleave ()
    {
        leave.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatetime ()
    {
        time.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validaterecruitment ()
    {
        recruitment.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatemyinfo ()
    {
        myinfo.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validateperformance ()
    {
        performance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatedashboard ()
    {
        dashboard.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatedirectory ()
    {
        directory.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatemaintenance ()
    {
        maintenance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void validatebuzz ()
    {
        buzz.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
    }
    public void logout()
    {
        Welcomebtn.click();
        logoutbtn.click();
    }




}
