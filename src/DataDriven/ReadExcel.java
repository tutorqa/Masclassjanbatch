package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

public static void main(String []args) throws Exception   {
  
	// Specify the path of file
      File src=new File("C:\\selenium\\read.xlsx");

    // load file
      FileInputStream fis=new FileInputStream(src);
    
    // Load workbook
      XSSFWorkbook wb=new XSSFWorkbook(fis);
    
     // Load sheet- Here we are loading sheet 1
      XSSFSheet sh1= wb.getSheetAt(0);

      String data0=sh1.getRow(0).getCell(0).getStringCellValue();
      
      System.out.println("The data is "+ data0);
      
      wb.close();
}      
}