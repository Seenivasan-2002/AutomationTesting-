package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.ProjectSpecificMethod;

public class DataLibrary {

	public static String[][] getValue(String data) throws IOException {
		//Path for work book
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+data+".xlsx");
		
		//Get into sheet
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Get into row
		int rowCount = sheet.getLastRowNum();
		
		//get into cell
		short cellCount = sheet.getRow(1).getLastCellNum();
		
		//create a 2 dimentional array for store the data
       String[][] data1 = new String[rowCount][cellCount];
		
		 
		 //to print all the rows and col use for loop
		 for (int i = 1; i <=rowCount; i++) //row count starts from 1
		 {
			 for (int j = 0; j < cellCount; j++) //col count starts from 0
			 {
				 String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				 //declare value to data provider
				 data1[i-1][j]=stringCellValue;//row starts with 0 @data provider so we gives a i-1 
				
			 }
		 }
		 //return the data
		 wb.close();
		return data1;
	}
}
