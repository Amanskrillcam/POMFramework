import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\AmanShukla\\Selenium\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.gmail.com");
            System.out.println(driver.getTitle());
            driver.quit();
        }
    }


