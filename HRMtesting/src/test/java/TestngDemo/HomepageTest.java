package TestngDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomepageTest extends TestngDemo
{
    String actualtitle;
    @Test
    public void verifypage()
    {
        actualtitle=driver.getTitle();
        Assert.assertEquals(actualtitle, "OrangeHRM");
    }
    @Test
    public void Logout()
    {
        driver.findElement(By.partialLinkText("Welcome")).click();
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver);*/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.findElement(By.linkText("Logout")).click();
    }

}
