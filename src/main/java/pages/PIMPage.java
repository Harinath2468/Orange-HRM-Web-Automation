package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponents.Utils;

public class PIMPage extends Utils{
	
	WebDriver driver;
	
	public PIMPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement AddEmployee;
	
	@FindBy(xpath="//input[contains(@class,'orangehrm-firstname')]")
	WebElement firstName;
	
	@FindBy(xpath="//input[contains(@class,'orangehrm-lastname')]")
	WebElement lastName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	
	public void addEmployee(String fName, String lName) {
		Utils.goToPimPage();
		AddEmployee.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		submit.click();
		AddEmployee.click();
	}

}
