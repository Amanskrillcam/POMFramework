package ActionClassSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement
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
        //driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        // driver.findElement(By.className(""));
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();
        action.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();
        driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
    }

    public static void main(String[] args)
    {
        MouseMovement mm=new MouseMovement();
        mm.launch();
    }
}
