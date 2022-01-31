package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestngDemo
{
   public static String driverpath;
   public static WebDriver driver;
    @BeforeSuite
    public void launch()
   {
//       launch using webdriver manager.
//       WebDriverManager.chromedriver().setup();
       driverpath=System.getProperty("user.dir")+"//driver//chromedriver.exe";
       System.out.println(driverpath);
       //.Step1
       System.setProperty("webdriver.chrome.driver",driverpath);
       //.Step2
       driver=new ChromeDriver();
       //.Step3
       driver.manage().window().maximize();
       //.Step4
       driver.get("https://opensource-demo.orangehrmlive.com/");
//     driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
//     driver.findElement(By.className(""));
   }
   @AfterSuite
   public void close()
   {
       driver.close();
   }
}
