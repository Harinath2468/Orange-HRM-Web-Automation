package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import Abstractcomponents.Utils;


public class LandingDashboardPage extends Utils{

WebDriver driver;

public LandingDashboardPage(WebDriver driver) {
		super(driver);
		  this.driver =driver;
		PageFactory.initElements( driver, this);
		
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	@FindBy(xpath="//button[@title='Timesheets']")
	WebElement timesheets;
	@FindBy(xpath="//div[@class='oxd-table-cell-actions']//button[text()=' View ']")
	WebElement viewRecord;
	@FindBy(css=".oxd-text--subtitle-2")
	WebElement status;
	
	
	public void goToURL() throws IOException {
		driver.get(getURL());
		System.out.println(getURL());
	}
	
	public void loginToHrm(String Username, String Password) {
		
		username.sendKeys(Username);
		password.sendKeys(Password);
		login.click();
	}
	
	public void goToTimesheetsAndViewRecord() {
		
		timesheets.click();
		viewRecord.click();
		
	}
	
	public String getStatus() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOf(status));
		String Status = status.getText();
		//System.out.println(Status);
		return Status;
		
	}
	
	//Individual testing template
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		LandingDashboardPage lp = new LandingDashboardPage(driver);
		lp.goToURL();
		lp.loginToHrm("Admin", "admin123");
		lp.goToTimesheetsAndViewRecord();
		System.out.println(lp.getStatus());
		
	}
}
