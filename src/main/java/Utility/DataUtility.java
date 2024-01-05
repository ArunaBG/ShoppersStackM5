package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataUtility {

	public String dataFromPropertiesFile(String key) throws Throwable {
		
	
	File file=new File(IPathConstant.propertiesPath);
	FileInputStream fis=new FileInputStream(file);
	Properties Pr=new Properties();
	Pr.load(fis);
	String value = Pr.getProperty(key);
	return value;
}
	public String dataFromExcelFile(String sheetname,int rownum,int colnum) throws Throwable{
	File file=new File(IPathConstant.propertiesPath);
	 FileInputStream fis=new FileInputStream(file);
	 Workbook workbook=WorkbookFactory.create(fis);
	 Sheet sheet=workbook.getSheet("Sheet1");
	 Row row=sheet.getRow(rownum);
	 Cell cell=row.getCell(colnum);
	
	 DataFormatter formater=new DataFormatter();
	 String value = formater.formatCellValue(cell);
	 System.out.println(value);
	return value;
}
	
public Object[][] AcessAddress() throws  Throwable{
	
		File file=new File(IPathConstant.excelPath);
		 FileInputStream fis=new FileInputStream(file);
		 Workbook workbook=WorkbookFactory.create(fis);
		 Sheet sheet=workbook.getSheet("Sheet1");
		 Object[][] ref=new Object[sheet.getLastRowNum()][9];
		 DataFormatter form=new DataFormatter();
		 int count=0;
		 for(int i=1;i<=sheet.getLastRowNum();i++)
		 {
			 for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) 
			 {
				 ref[count][j]=form.formatCellValue(sheet.getRow(i).getCell(j)).toString();
			 }
			 count++;
		 }
	return ref;
}
}