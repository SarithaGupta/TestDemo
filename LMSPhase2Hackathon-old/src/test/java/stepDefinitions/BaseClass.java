package stepDefinitions;

import static stepDefinitions.DriverManager.getDriver;

import org.openqa.selenium.WebDriver;

import pageObjects.AttendancePage;
import pageObjects.UserPage;

public class BaseClass {

	public static WebDriver driver;
	public static AttendancePage at;
	public static UserPage up;
	
	static {  
		driver = getDriver();
	}

	
}
