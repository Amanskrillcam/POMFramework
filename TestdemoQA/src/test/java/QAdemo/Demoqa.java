package QAdemo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class Demoqa
    {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/");
            WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(5000);
            WebElement Txtbox =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div"));
            Txtbox.click();
            driver.findElement(By.id("item-0")).click();
            driver.findElement(By.id("userName")).sendKeys("Aman");
            driver.findElement(By.id("userEmail")).sendKeys("aman@gmail.com");
            driver.findElement(By.id("currentAddress")).sendKeys("Sbp Valley");
            driver.findElement(By.id("permanentAddress")).sendKeys("SBP Society");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            driver.findElement(By.id("submit")).click();
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(5000);
            driver.quit();
        }

    }


