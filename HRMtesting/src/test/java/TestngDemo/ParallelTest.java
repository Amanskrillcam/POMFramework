package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParallelTest
{
    public static String driverpath;
    public static WebDriver driver;

    @Test
    public void parallellaunch()
    {
        System.out.println("launch");
//       launch using webdriver manager.
//       WebDriverManager.chromedriver().setup();
//        driverpath=System.getProperty("user.dir")+"//driver//chromedriver.exe";
//        System.out.println(driverpath);
//        //.Step1
//        System.setProperty("webdriver.chrome.driver",driverpath);
//        //.Step2
//        driver=new ChromeDriver();
//        //.Step3
//        driver.manage().window().maximize();
//        //.Step4
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//     driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
//     driver.findElement(By.className(""));
    }

    @Test
    public void parallellogin()
    {
        System.out.println("login test");
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//        driver.findElement(By.id("btnLogin")).click();
    }

    @Test
    public void parallelForgetpassword()
    {
        System.out.println("forgetpassword");
//            driver.findElement(By.linkText("Forgot your password?")).click();
//            driver.navigate().back();
    }

    @Test
    public void parallelclose()
    {
        System.out.println("close");
//        driver.close();
    }

}
