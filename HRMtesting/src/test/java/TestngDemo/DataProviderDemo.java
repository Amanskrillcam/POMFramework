package TestngDemo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
public class DataProviderDemo {
    static String path;
    static WebDriver driver;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    @DataProvider(name="Login_Details")
    public Object[][] Data() throws IOException{
        path = System.getProperty("user.dir")+"//TestData//Test_data.xlsx";

//Step-2 Give path in FileInputstream class from where you want to run
        fis = new FileInputStream(path);

//Step-3 Move to workbook
        wb = new XSSFWorkbook(fis);

//Step-4 Move to specific sheet
        sheet =wb.getSheetAt(0);
        int row = sheet.getLastRowNum();

        Object[][] arr= new Object[row+1][2];
        for(int i=1;i<=row;i++) {
            String uname=sheet.getRow(i).getCell(0).getStringCellValue();
            String pass=sheet.getRow(i).getCell(1).getStringCellValue();
            arr[i][0]=uname;
            arr[i][1]=pass;
        }
        arr[0][0]="hi";
        arr[0][1]="Aman Shukla";
        return arr;
    }

    @Test(dataProvider ="Login_Details")
    public void signIn(String uname, String pass) {
        System.out.println(uname+"\t"+pass);
// driver.findElement(By.id("txtUsername")).sendKeys(uname);
// driver.findElement(By.id("txtPassword")).sendKeys(pass);
// driver.findElement(By.id("btnLogin")).click();
    }
}