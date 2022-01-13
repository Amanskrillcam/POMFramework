import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class First {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\AmanShukla\\Selenium\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.google.com");
            System.out.println(driver.getTitle());
            WebElement p=driver.findElement(By.name("q"));
            //enter text with sendKeys() then apply submit()
            p.sendKeys("Selenium Java");
            // Explicit wait condition for search results
            WebDriverWait w = new WebDriverWait(driver, 5);
            w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
            p.submit();
            driver.quit();
        }
    }


