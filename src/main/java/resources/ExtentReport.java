package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports getReport() {
		
		String path = "C:\\Users\\dell\\Desktop\\Eclipse workspace\\SDET Udemy\\OrangeHRM\\Reports\\ExtentReport.html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(path);
		sparkReport.config().setDocumentTitle("OrangeHRM Web Automation");
		sparkReport.config().setReportName("OrangeHRM");
		
		ExtentReports extentReport =new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("Tester", "Harinath Reddy");
		return extentReport;
		
	}
	
}
