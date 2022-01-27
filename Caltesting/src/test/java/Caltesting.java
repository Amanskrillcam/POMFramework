import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Caltesting {
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.goibibo.com/");
            driver.findElement(By.id("departureCalendar")).click();
            Thread.sleep(2000);
            //new WebDriverWait(driver, Duration.ofSeconds(5));
            dateselect("20","may","2022");
        }

        public static String[] getmonthyear(String monyear)
        {
            return monyear.split((" "));
        }

        public static void dateselect(String userday, String usermonth, String useryear)
        {
            WebDriver driver = new ChromeDriver();
            String monyear = driver.findElement(By.className("DayPicker-Caption")).getText();
            System.out.println(monyear);
            // String month = monyear.split(" ")[0].trim();
            // String year = monyear.split(" ")[1].trim();
            while (!(getmonthyear(monyear)[0].equals("usermonth")
                    &&
                    getmonthyear(monyear)[1].equals("useryear")))
            {
                driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
                monyear = driver.findElement(By.className("flex-1 ta-left")).getText();
            }
            driver.findElement(By.className("calDate")).click();

        }
    }

