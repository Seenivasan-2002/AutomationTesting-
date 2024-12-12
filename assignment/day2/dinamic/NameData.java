package week5.assignment.day2.dinamic;
		
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class NameData {

	public static String[][] readValue() throws IOException {
		//excel workbook path
		XSSFWorkbook wb = new XSSFWorkbook ("./Excelsheet/Salesforcename.xlsx");

		//get the sheet from book
		XSSFSheet sheet = wb.getSheetAt(0);
	
		//get into row
		int lastRowNum = sheet.getLastRowNum();
		
		//get into cell
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		
		//Store it in String
		String[][]data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			String stringCellValue = sheet.getRow(i).getCell(0).getStringCellValue();
			data[i-1][0]=stringCellValue;
		}
		
		//close the window and return the statement
		wb.close();
		return data;
		
	
	
	}

}
