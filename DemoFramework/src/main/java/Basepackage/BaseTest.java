package Basepackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestUtilClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest
{
    public static WebDriver driver;
    public static Properties prop;

    public BaseTest()
    {
        try
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\Configpackage\\config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browsername = prop.getProperty("browser");
        if (browsername.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else
        {
            System.out.println("invalid browser");
        }
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestUtilClass.IMPLICIT_WAIT));
        driver.get(prop.getProperty("url"));
    }
}