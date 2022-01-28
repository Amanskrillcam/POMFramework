package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle
{
    String driverpath;
    WebDriver driver;

    public void Launch() throws InterruptedException {
        //launch using webdriver manager.
        //WebDriverManager.chromedriver().setup();
        driverpath=System.getProperty("user.dir")+"//driver//chromedriver.exe";
        System.out.println(driverpath);
        //Step1
        System.setProperty("webdriver.chrome.driver",driverpath);
        //Step2
        driver=new ChromeDriver();
        //Step3
        driver.manage().window().maximize();
        //Step4
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        // driver.findElement(By.className(""));
        driver.findElement(By.id("password")).sendKeys("xyz");
        driver.findElement(By.className("signinbtn")).click();
        Thread.sleep(2000);
        Alert alt =driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
    }

    public static void main(String[] args) throws InterruptedException {
        Alerthandle alh=new Alerthandle();
        alh.Launch();

    }

}
