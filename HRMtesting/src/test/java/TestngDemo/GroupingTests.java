package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupingTests
{
    public static String driverpath;
    public static WebDriver driver;

    @BeforeSuite(groups = {"smoke","regression"})
    public void launch()
    {
//        launch using webdriver manager.
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

    @Test(groups = {"Sanity","regression"})
    public void test1()
    {
        System.out.println("this is test 1");
    }

    @Test(groups={"Sanity","regression"})
    public void test2()
    {
        System.out.println("this is test 2");
    }

    @Test(groups = {"smoke","regression"})
    public void test3()
    {
        System.out.println("this is test 3");
    }

    @Test(groups = {"smoke","regression"})
    public void test4()
    {
        System.out.println("this is test 4");
    }

    @AfterSuite(groups = {"sanity","regression"})
    public void close()
    {
        driver.close();
    }
}
