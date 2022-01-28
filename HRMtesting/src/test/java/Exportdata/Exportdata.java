package Exportdata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exportdata
{
    public void writeexcel(String sheetname,int row,int col,String cellvalue) throws IOException
    {
        String filepath=System.getProperty("user.dir")+"\\Testdata\\Test_data.xlsx";
//        File file=new File(filepath);
        FileInputStream fis=new FileInputStream(filepath);
        XSSFWorkbook wrkbk=new XSSFWorkbook(fis);
        XSSFSheet sheet=wrkbk.getSheet(sheetname);

        FileOutputStream fos=new FileOutputStream(filepath);
        sheet.getRow(row).createCell(col).setCellValue("cellvalue");
        wrkbk.write(fos);
        wrkbk.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        Exportdata ed=new Exportdata();
        ed.writeexcel("Test_data",0,2,"data imported");
        ed.writeexcel("Test_data",1,2,"data imported");

    }

}
