package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AttendancePage {
	
	WebDriver driver;
	
	By btnAttendance = By.xpath("//input[@value='attendance']");
	By header = By.xpath("//div[@class='headertext']");
	By footer = By.xpath("//div[@class='footertext']");
	By paginator = By.xpath("//div[text()='paginatortext']");
	By btnProgramName = By.xpath("//input[@value='programName']");
	By programName = By.id("id_program");
	By btnUserName = By.xpath("//input[@value='userName']");
	By userName = By.id("id_username");
	By btnPresent = By.xpath("//input[@value='present']");
	By btnAbsent = By.xpath("//input[@value='Absent']");
	By btnEdit = By.xpath("//input[@value='edit']");
	By attendanceDetailsWindow = By.id("id_attendancedetails");
	By editValidation = By.xpath("//div[@class='headertext']");
	By btnDelete = By.xpath("//input[@value='delete']");
	By btnSave = By.xpath("//input[@value='save']");
	By successAlert = By.xpath("//div[@class='alert alert-primary']");
	By btnCancel = By.xpath("//input[@value='cancel']");
	By errorMessage = By.xpath("//div[@class='alert alert-primary']");
	By btnYesDelete = By.xpath("//input[@value='Yes']");
	By btnNoDelete = By.xpath("//input[@value='No']");
	By elementPresent = By.id("example_present");
	By elementAbsent = By.id("example_absent");
		
	String Present;
	String Absent;
	
	List<WebElement> userList;
	List<String> userNames = new ArrayList<String>();
	
	
	public AttendancePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnAttendance()
	{
		driver.findElement(btnAttendance).click();
	}
	public String headerValidation()
	{
		return driver.findElement(header).getText();
	}
	public String footerValidation()
	{
		return driver.findElement(footer).getText();
	}
	public String paginatorValidation()
	{
		return driver.findElement(paginator).getText();
	}
	public void paginatorValidation1()
	{
		String element= driver.findElement(paginator).getText();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",element);
		 
	}
	
	public void clickOnProgram()
	{
		driver.findElement(btnProgramName).click();
	}
	public void clickOnUserName()
	{
		driver.findElement(btnUserName).click();
	}
	public void clickOnPesent()
	{
		driver.findElement(btnPresent).click();
	}
	public void clickOnAbsent()
	{
		driver.findElement(btnAbsent).click();
	}
	public void clickOnEdit()
	{
		driver.findElement(btnEdit).click();
	}
	public void attendanceDetails()
	{
		driver.findElement(attendanceDetailsWindow).click();
	}
	public String editValidation()
	{
		return driver.findElement(editValidation).getText();
	}
	public void editProgramName(String programname)
	{
		driver.findElement(programName).sendKeys(programname);
		
	}
	public void editUserName(String username)
	{
		driver.findElement(userName).sendKeys(username);
	}
	public void clickOnDelete()
	{
		driver.findElement(btnDelete).click();
	}
	public void clickOnSave()
	{
		driver.findElement(btnSave).click();
	}
	public void alertMessageSuccess()
	{
		 driver.findElement(successAlert).getText();
	}
	public void clickOnCancel()
	{
		driver.findElement(btnCancel).click();
	}
	public void clickOnErrorMessage()
	{
		driver.findElement(errorMessage).getText();
	}
	public void clickOnYesBtnDelete()
	{
		driver.findElement(btnYesDelete).click();
	}
	public void clickOnNoBtnDelete()
	{
		driver.findElement(btnNoDelete).click();
	}

	public void ClickOnSDETCheckbox() {
		// TODO Auto-generated method stub
		driver.findElement(programName).click();
	}

	public void displayListOfUsers() {
		// TODO Auto-generated method stub
		 userList = (List<WebElement>) driver.findElement(userName);;
		 for (WebElement usernameList :userList) {
			userNames.add(usernameList.getText());
		 }
		 for (String NAME :userNames) {
			 System.out.println(NAME);
		 }
	}

	public void clickOnPresentBtn() {
		// TODO Auto-generated method stub
		driver.findElement(btnPresent).click();
	}

	public void displayListOfPresent() {
		// TODO Auto-generated method stub
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='users']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in web table:"+rowCount);
		
		String beforexpath = "//*[@id='users']/tbody/tr[";
		String afterxpathname ="]/td[1]";
		String afterxpathpresent ="]/td[2]";
	    
	    for (int i=2;i <= rowCount; i++) {
	    	String actualxpath = beforexpath +i+afterxpathname;
	    	WebElement element = driver.findElement(By.xpath(actualxpath));
	    	System.out.println(element.getText());
	    	String actualxpath1 = beforexpath +i+afterxpathpresent;
	    	WebElement element1 = driver.findElement(By.xpath(actualxpath1));
	    	System.out.println(element1.getText());
	    	
	    	if (element1.getText() != null)
	    	{
	    		System.out.println("username present");	    		
	    	}	    			
	    }	    
	}

	public void clickOnAbsentBtn() {
		// TODO Auto-generated method stub
		driver.findElement(btnPresent).click();
	}

	public void displayListOfAbsent() {
		// TODO Auto-generated method stub
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='users']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in web table:"+rowCount);
		
		String beforexpath = "//*[@id='users']/tbody/tr[";
		String afterxpathname ="]/td[1]";
		String afterxpathabsent ="]/td[3]";
	    
	    for (int i=2;i <= rowCount; i++) {
	    	String actualxpath = beforexpath +i+afterxpathname;
	    	WebElement element = driver.findElement(By.xpath(actualxpath));
	    	System.out.println(element.getText());
	    	String actualxpath1 = beforexpath +i+afterxpathabsent;
	    	WebElement element1 = driver.findElement(By.xpath(actualxpath1));
	    	System.out.println(element1.getText());
	    	
	    	if (element1.getText() != null)
	    	{
	    		System.out.println("username absent");
	    		
	    	}	    			
	    }		
	}

	public void disablePresentDetails() {
		// TODO Auto-generated method stub
		Present = driver.findElement(elementPresent).getAttribute("class");
			if(Present.contains("disabled"))
			{
				System.out.println("Disabling Present details");
			}
	}

	public void enableAbsentDetails() {
		// TODO Auto-generated method stub
		Absent = driver.findElement(elementAbsent).getAttribute("class");
		if(Absent.contains("enabled"))
		{
			System.out.println("Enabling Absent Details");
		}
	}	
}
