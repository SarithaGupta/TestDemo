package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import static utils.WebDriverUtils.getDriver;
import static utils.WebDriverUtils.linkUrl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_login.Pages_Login;

public class LoginStepDefinitions {

public  WebDriver driver;
public Pages_Login loginobj;

public LoginStepDefinitions() throws InterruptedException
{
	driver= getDriver();
	Thread.sleep(5000);
	// class obj=new class()
	loginobj=new Pages_Login(driver);
	//String ProjectPath=System.getProperty("user.dir");
	//System.out.println(ProjectPath);
	
	//driver.get("https://parabank.parasoft.com/parabank/index.htm");
}

	
	@Given("user enters appUrl and click on register")
	public void user_enters_and_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions

		linkUrl();
		System.out.println("launchedUrl");
	    loginobj.fnclickReg();
	}
	


	@When("user enters {string}, {string},{string},{string},{string}, {string}, and {string}")
	public void user_enters_and(String fname, String lname, String add, String city, String state, String zip, String ssn) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   loginobj.fnRegisteration(fname, lname, add, city, state, zip, ssn);
	  
	}

	@When("user enters {string},{string} and {string}")
	public void user_enters_and(String user, String pass, String CPass) throws InterruptedException {
	    
		// Write code here that turns the phrase above into concrete actions
	    
		loginobj.fnRegisteration1(user, pass, CPass);
		
	}

	@Then("clicks register")
	public void clicks_register() {
	    // Write code here that turns the phrase above into concrete actions
	    loginobj.fnClickReg1();
	}

	@Given("user enter {string} completes registeration")
	public void user_enter_completes_registeration(String appurl) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(appurl);
	    
	}



	@When("user enters {string} and {string}")
	public void user_enters_and(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   loginobj.fnEnterUserPwd(string1, string2); 
	}

	@When("clicks login button")
	public void clicks_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    loginobj.fnClickLogin();
	   
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
	   
	    driver.getPageSource().contains("Accounts Overview");
	   
	}
	
//Scenario= Account overview functionality
	
	@Given("user enter appUrl and logged in using {string} and {string}")
	public void user_enter_app_url_and_logged_in_using_and(String username, String password) throws InterruptedException {
		linkUrl();
		Thread.sleep(5000);
		System.out.println("username is "+ username);
		loginobj.fnEnterUserPwd(username, password);
		loginobj.fnClickLogin();
		
	}

	@When("user clicks on the account number")
	public void user_clicks_on_the_account_number() {
		loginobj.clickAccount();
		
	}

	@Then("user can view the complete info of account")
	public void user_can_view_the_complete_info_of_account() {
	    System.out.println("account overview");
	}
	
	@After
	public void tearDown()
	{
 	
	    driver.close();
	    driver.quit();
	
	}


}

