package DataDrivenFramework;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFetch
{
    String path,driverpath;
    WebDriver driver;
    String uname,pass;

    public void Launch()
    {
        //launch using webdriver manager.
        //WebDriverManager.chromedriver().setup();
        driverpath=System.getProperty("user.dir")+"//driver//chromedriver.exe";
        System.out.println(driverpath);
        //Step1
        System.setProperty("webdriver.chrome.driver",driverpath);
        //Step2
        driver=new ChromeDriver();
        //Step3
        driver.manage().window().maximize();
        //Step4
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        // driver.findElement(By.className(""));
    }
    public void Getdata() throws IOException
    {
        //Step1 give path of the file
        path = System.getProperty("user.dir")+"\\Testdata\\Test_data.xlsx";
        System.out.println(path);


        //Step2 give path in fileinputstream class from where we want to add file
        FileInputStream fis = new FileInputStream(path);

        //step3 move to workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        //step4 move to specific sheet
        XSSFSheet sheet = wb.getSheetAt(0);

        //Step5 read rows from excel sheet
        System.out.println(sheet.getLastRowNum());

        //Step6 read data from cell
        //String usrname=sheet.getRow(1).getCell(0).getStringCellValue();
        //System.out.println("username is"+usrname);

        for (int i = 1; i <= sheet.getLastRowNum(); i++)
        {
            uname = sheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.id("txtUsername")).sendKeys(uname);
            pass=sheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.id("txtPassword")).sendKeys(uname);
            driver.findElement(By.id("btnLogin")).click();
            System.out.println("username and password"+" "+uname+" "+pass);


        }
    }
    public void writeexcel(String sheetname,int col,String cellvalue) throws IOException
    {
        String filepath=System.getProperty("user.dir")+"\\Testdata\\Test_data.xlsx";
        FileInputStream fis=new FileInputStream(filepath);
        XSSFWorkbook wrkbk=new XSSFWorkbook(fis);
        XSSFSheet sheet=wrkbk.getSheetAt(0);
        for(int i=1; i<=sheet.getLastRowNum();i++)
        {
            sheet.getRow(i).createCell(col).setCellValue(cellvalue);
        }

        FileOutputStream fos=new FileOutputStream(filepath);

        wrkbk.write(fos);
        fos.close();
    }




    public void Closedriver()
    {
        driver.close();
    }

    public static void main(String[] args) throws IOException
    {
        DataFetch df=new DataFetch();
        df.Launch();
        df.Getdata();
        df.writeexcel("Login_Details",2,"data import");
        df.Closedriver();
    }
}