package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;
import pages.LandingDashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	WebDriver driver;
	LandingDashboardPage lp;
	AdminPage ad;
	
	@Given("launch HRM application")
	public void launch_HRM_Application() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	

@Given("Logged in with username  and password")
public void logged_in_with_username_and_password() throws IOException {
	
	lp = new LandingDashboardPage(driver);
	lp.goToURL();
	lp.loginToHrm("Admin","admin123" );
}


	@When("I click on timesheets and click on the records")
	public void i_click_on_timesheets() {
	    lp.goToTimesheetsAndViewRecord();
	}
	
	@Then("displays record and status submitted")
	public void displays_record() {
		System.out.println(lp.getStatus());
	}


}
