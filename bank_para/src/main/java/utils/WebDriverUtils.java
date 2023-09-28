package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static WebDriverWait mywait;
	
	
	public static WebDriver getDriver()
	{

		/*System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver=new ChromeDriver();*/
		
		
		//webDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		return driver;


	}
	public static void linkUrl()
	{
		//String url = "https://parabank.parasoft.com/parabank/index.htm";
		//return url;
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
}
	
	public static void waitMethod(WebElement w_ele)
	{
		 mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		 mywait.until(ExpectedConditions.visibilityOf(w_ele));
	}

}
