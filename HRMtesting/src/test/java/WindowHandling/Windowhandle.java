package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandle
{
    String driverpath;
    WebDriver driver;


    public void Launch() throws InterruptedException
    {
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
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        //handling multiple windows
        Set<String> handle=driver.getWindowHandles();
        System.out.println("ID is:"+handle);
        Iterator<String> it=handle.iterator();
        String parent_id= it.next();
        String child_id=it.next();
        System.out.println("parent id"+parent_id);
        System.out.println("child id"+child_id);
        driver.switchTo().window(child_id);
        System.out.println(driver.getTitle());
//         handles=driver.getWindowHandles();
//        driver.switchTo().window(handle);
//
//        //switch to newly created window
//        String curwindow=driver.getWindowHandle();

    }

    public static void main(String[] args) throws InterruptedException {
        Windowhandle oo=new Windowhandle();
        oo.Launch();


    }
}
