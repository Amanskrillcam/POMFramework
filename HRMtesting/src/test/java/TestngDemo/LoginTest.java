package TestngDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestngDemo {
    @Test
    public void Login()
    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void Forgetpass()
    {
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.navigate().back();
    }
}
