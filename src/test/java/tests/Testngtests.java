package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelUtils.Dataprovider;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LandingDashboardPage;
import pages.PIMPage;

public class Testngtests {
	
	WebDriver driver;
	
	@Test
	public void driverandurlsetup() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		LandingDashboardPage lp = new LandingDashboardPage(driver);
		lp.goToURL();
		lp.loginToHrm("Admin", "admin123");
		
	}
	
	@Test(dataProvider = "Employee data", dataProviderClass = Dataprovider.class,dependsOnMethods = "driverandurlsetup")
	public void AddingEmpTest(String fName, String lName) {
	
		PIMPage page = new PIMPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.addEmployee(fName,lName);
		
	}

}
