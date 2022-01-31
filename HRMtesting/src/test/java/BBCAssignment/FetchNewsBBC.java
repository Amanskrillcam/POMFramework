package BBCAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class FetchNewsBBC {
    public static String driverpath;
    public static void main(String[] args)
    {
        driverpath=System.getProperty("user.dir")+"//driver//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.bbc.com/");
        List<WebElement> linktext = driver.findElements(By.tagName("a"));
        System.out.println(linktext.size());
        for(int i = 0;i<linktext.size();i++)
        {
            String linktxt = linktext.get(i).getText();
            String linkurl  = linktext.get(i).getAttribute("href");
            System.out.println(linktxt+"    "+linkurl);

        }
    }
}