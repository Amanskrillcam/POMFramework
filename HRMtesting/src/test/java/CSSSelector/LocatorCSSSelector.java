package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector
{
    String driverpath;
    WebDriver driver;
    public void launch()
    {
        //launch using webdriver manager.
        //WebDriverManager.chromedriver().setup();
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
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Admin");
//        driver.findElement(By.className(""));
    }

    public static void main(String[] args) {
        LocatorCSSSelector css=new LocatorCSSSelector();
        css.launch();
    }
}
