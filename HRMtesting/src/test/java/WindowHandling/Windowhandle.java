package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowhandle {
    String driverpath;
    WebDriver driver;

    public void Launch() throws InterruptedException {
        //launch using webdriver manager.
        //WebDriverManager.chromedriver().setup();
        driverpath = System.getProperty("user.dir") + "//driver//chromedriver.exe";
        System.out.println(driverpath);
        //Step1
        System.setProperty("webdriver.chrome.driver", driverpath);
        //Step2
        driver = new ChromeDriver();
        //Step3
        driver.manage().window().maximize();
        //Step4
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        //handling multiple windows
        String handle=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        driver.switchTo().window(handle);

        //switch to newly created window
        String curwindow=driver.getWindowHandle();

    }
}
