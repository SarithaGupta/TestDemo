package pages_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

import static utils.WebDriverReusables.*;
import static utils.WebDriverUtils.waitMethod;
public class Pages_Login {
	public WebDriver driver;
	String aoView= "Accounts Overview" ;
	

	public Pages_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy (name="username")
	WebElement user;

	@FindBy(name="password")
	WebElement password;

	public void fnEnterUserPwd(String string1, String string2)
	{
		user.sendKeys(string1);
		password.sendKeys(string2);
	}

	@FindBy(xpath="//input[@class='button']")
	WebElement loginlink;
	
	@FindBy(xpath= "//h1[@class='title']")
	WebElement AccOView;

	public void fnClickLogin()
	{
		loginlink.click();
		waitMethod(AccOView);
		String accOView=  AccOView.getText();
		System.out.println("The getText is "+ accOView);
		Assert.assertEquals(aoView, accOView);
	
	}

	@FindBy(id="customer.firstName")
	WebElement fname;
	@FindBy(id="customer.lastName")
	WebElement lname;
	@FindBy(id="customer.address.street")
	WebElement demoaddress;
	@FindBy(id="customer.address.city")
	WebElement democity;
	@FindBy(id="customer.address.state")
	WebElement demostate;
	@FindBy(id="customer.address.zipCode")
	WebElement demozip;
	@FindBy(id="customer.ssn")
	WebElement demossn;
	
	
	public void fnRegisteration(String fname1, String lname1, String add1, String city1, String state1, String zip1, String ssn1)
	{
		
		enterText(fname, fname1);
		enterText(lname, lname1);
		enterText(demoaddress,add1);
		enterText(democity, city1);
		enterText(demozip, zip1);
		enterText(demostate, state1);
		enterText(demossn, ssn1);
	}
	
	@FindBy(linkText=("Register"))
	WebElement clickreg;
	
	public void fnclickReg()
	{
		clickreg.click();
	}
	@FindBy(id="customer.username")
	WebElement userReg;
	@FindBy(id="customer.password")
	WebElement userPwd;
	@FindBy(id="repeatedPassword")
	WebElement userConPwd;
	
	public void fnRegisteration1(String user, String pwd, String conpwd)
	{
		enterText(userReg, user);
		enterText(userPwd, pwd);
		enterText (userConPwd, conpwd);
	}
			
	@FindBy(xpath="//*[@type='submit' and @value='Register']")
	WebElement regBtn;
	
	
	
	@SuppressWarnings("deprecation")
	public void fnClickReg1()
	{
			regBtn.click();
	}
	
	@FindBy(partialLinkText= "activity.htm?id")
	WebElement accounts;
	
	public void clickAccount()
	{
		String objaccounts= accounts.getText();
		System.out.println("The linkText is "+ objaccounts);
		System.out.println(objaccounts.length());
		//objaccounts.codePointCount(0, 0)
		accounts.click();
	}
	
	
}
