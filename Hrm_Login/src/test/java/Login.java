import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement Txtbx=driver.findElement(By.id("txtUsername"));
        Txtbx.sendKeys("Admin");
        Txtbx=driver.findElement(By.id("txtPassword"));
        Txtbx.sendKeys("admin123");

        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        String expected_title= "OrangeHRM";
        String actual_title=driver.getTitle();
        if (expected_title.equals(actual_title)){
            System.out.println("login successful");
        }else{
            System.out.println("Invalid credentials");
        }


    }

}
