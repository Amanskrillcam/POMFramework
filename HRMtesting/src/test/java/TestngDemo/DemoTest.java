package TestngDemo;

import org.testng.annotations.*;

public class DemoTest
{
    public void f(){}
    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("before method");
    }
    @AfterMethod
    public void aftermethod()
    {
        System.out.println("after method");
    }
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("before class");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("after class");
    }
    @BeforeTest
    public void beforetest()
    {
        System.out.println("before test");
    }
    @AfterTest
    public void aftertest()
    {
        System.out.println("after class");
    }
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("before suite");
    }
    @AfterSuite
    public void aftersuite()
    {
        System.out.println("after suite");
    }

}
