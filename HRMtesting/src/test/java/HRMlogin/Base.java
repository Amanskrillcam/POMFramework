package HRMlogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

class Hrm
{
     WebDriver driver = new ChromeDriver();
    void login()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        WebElement a = driver.findElement(By.name("txtUsername"));
        a.sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

    }
    void adduser() throws InterruptedException
    {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
        driver.findElement(By.id("firstName")).sendKeys("Aatimiit");
        driver.findElement(By.id("lastName")).sendKeys("verma");
        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys("Aatim89");
        driver.findElement(By.id("user_password")).sendKeys("Amana007");
        driver.findElement(By.id("re_password")).sendKeys("Amana007");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);

    }
    void verifyuserisadded()
    {
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.id("menu_admin_UserManagement")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aatim89");
        driver.findElement(By.id("searchBtn")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       /* String expectedUsername ="Aatim89721";
        WebElement actualusername = driver.findElement(By.xpath("//td[contains(text(),'Aatim89721')]"));
        System.out.println(actualusername.getText());
       // org.junit.Assert.assertEquals(expectedUsername,actualusername,"User not found");
        Assert.assertEquals(expectedUsername,actualusername,"User not found");*/

    }
    void Dropdown() throws InterruptedException
    {
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//*[@id=\"menu_pim_Configuration\"]")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.linkText("Configuration")).click();
        driver.findElement(By.linkText("Reporting Methods")).click();
        //s.selectByVisibleText("Reporting Methods");

    }
    void calender()
    {
        driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
        driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
        //dates from
        WebElement w=driver.findElement(By.id("candidateSearch_fromDate"));
        w.click();
        w.clear();
        w.sendKeys("2022-01-19");
        w.sendKeys(Keys.TAB);
       /* WebElement dateBox = driver.findElement(By.className("ui-datepicker-month"));
        Select s=new Select(dateBox);
        s.selectByValue("0");
        driver.findElement(By.className("ui-datepicker-year"));
        s.selectByValue("2022");
        driver.findElement(By.linkText("19")).click();
        dateBox.sendKeys(Keys.TAB);*/
        //dates to
        driver.findElement(By.id("candidateSearch_toDate")).sendKeys("2022-01-21");
        driver.findElement(By.id("btnSrch")).click();
        /*driver.findElement(By.className("ui-datepicker-month"));
        s.selectByValue("1");
        driver.findElement(By.className("ui-datepicker-year"));
        s.selectByValue("2022");
        driver.findElement(By.linkText("20")).click();
        dateBox.sendKeys("2022-01-21");*/

    }
    void edituser()
    {
        driver.findElement(By.linkText("Aatim89723")).click();
        driver.findElement(By.className("addbutton")).click();
        WebElement Userrole= driver.findElement(By.id("systemUser_userType"));
        Select s=new Select(Userrole);
        s.selectByValue("2");
       //driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Akash jones");
        WebElement status= driver.findElement(By.id("systemUser_status"));
        Select s1=new Select(status);
        s1.selectByValue("0");
        driver.findElement(By.name("btnSave")).click();

    }
    void deleteuser()
    {
        driver.findElement(By.id("ohrmList_chkSelectRecord_77")).click();
        driver.findElement(By.id("btnDelete")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       // driver.switchTo().alert().accept();
        driver.findElement(By.id("dialogDeleteBtn")).click();

    }
    void logout()
    {
        driver.findElement(By.className("panelTrigger")).click();
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver);*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Logout")).click();

    }
    void close()
    {
        driver.quit();

    }
}
public class Base extends Hrm
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        Hrm h = new Hrm();
        h.login();
        h.adduser();
        h.verifyuserisadded();
        h.edituser();
        h.deleteuser();
        h.Dropdown();
        h.calender();
        h.logout();
        h.close();
    }
}

