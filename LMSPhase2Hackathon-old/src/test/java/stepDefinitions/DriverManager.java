package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	 public static WebDriver driver_init;

	    @BeforeAll
	    public static void before_all() {	
	    	
	    	WebDriverManager.chromedriver().setup();
		    driver_init = new ChromeDriver();
	    }

	    public static WebDriver getDriver(){
	        return driver_init;
	    }
	    
	    @AfterAll
	    public static void after_all() {	    		
	    	
	    	//driver_init.quit();
	    }

}
