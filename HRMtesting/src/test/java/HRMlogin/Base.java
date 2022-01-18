package HRMlogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
    void logout()
    {
        driver.findElement(By.className("panelTrigger")).click();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("arguments[0].click();",driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.linkText("Logout")).click();
    }
    void close()
    {
        driver.quit();
    }
}
public class Base extends Hrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Hrm b = new Hrm();
        b.login();

        b.driver.findElement(By.id("menu_pim_viewPimModule")).click();
        b.driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
        b.driver.findElement(By.id("firstName")).sendKeys("Aatimiit");
        b.driver.findElement(By.id("lastName")).sendKeys("verma");
        b.driver.findElement(By.id("chkLogin")).click();
        b.driver.findElement(By.id("user_name")).sendKeys("Aatim8972");
        b.driver.findElement(By.id("user_password")).sendKeys("Aman@007");
        b.driver.findElement(By.id("re_password")).sendKeys("Aman@007");
        b.driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);
        b.driver.findElement(By.linkText("Admin")).click();
        b.driver.findElement(By.id("menu_admin_UserManagement")).click();
        b.driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aatim8972");
        b.driver.findElement(By.id("searchBtn")).click();
        b.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        b.logout();
        b.close();
    }
}

