package excelUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static Object[][] employeeData(String path, String sheetName) throws IOException{
		
		//path =System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata excel files\\sample_employee_records.xlsx";
		List<Object[]> datareader = new ArrayList<>();
		XSSFWorkbook workbook = new XSSFWorkbook(path);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		DataFormatter dataFormat = new DataFormatter();
		
		for(int i=1; i<rows; i++) {
			
			XSSFRow row = sheet.getRow(i);
			Object[] rowData = new Object[cols];
			
			for(int j=0; j<cols; j++) {
				
				rowData[j]= dataFormat.formatCellValue(row.getCell(j));
			}
			datareader.add(rowData);
		}
		workbook.close();
		return datareader.toArray(new Object[0][0]);
		
	}
	
	public static void main(String[] args) throws IOException {
		 String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Testdata excel files\\sample_employee_records.xlsx";
		    Object[][] data = employeeData(path, "Sheet1");

		    for (Object[] row : data) {
		    	System.out.println("I have added this data to PIM AddEmployee");
		        System.out.println(Arrays.toString(row));
		    }
	}

}
