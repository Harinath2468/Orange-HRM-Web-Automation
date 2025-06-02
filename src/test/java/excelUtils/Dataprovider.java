package excelUtils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider extends ExcelReader {

	@DataProvider(name = "Employee data")
	public Object[][] employeedata() throws IOException{
		
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Testdata excel files\\sample_employee_records.xlsx";
	    return ExcelReader.employeeData(path, "Sheet1");
	}
}
