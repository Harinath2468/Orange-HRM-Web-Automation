package Abstractcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utils {
	
	 WebDriver driver;

	public Utils(WebDriver driver) {
		
		 this.driver = driver ;
		PageFactory.initElements( driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(@href,'admin')]")
	static WebElement admin;
	
	@FindBy(xpath="//a[contains(@href,'dashboard')]")
	static WebElement dashboard;
	
	@FindBy(xpath="//a[contains(@href,'pim')]")
	static WebElement pim;
	
	public String getURL() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\Eclipse workspace\\SDET Udemy\\OrangeHRM\\src\\main\\java\\resources\\global.properties");
		prop.load(fis);
		String url = prop.getProperty("URL");
		return url;
		
	}
	
	public static void goToDashboardPage() {
		dashboard.click();		
	}
	
	public static void goToAdminPage() {
		admin.click();		
	}
	
	public static void goToPimPage() {
		pim.click();		
	}
	
}
