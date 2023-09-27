package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class UserPage {
	WebDriver driver;
	
	By btnUser = By.xpath("//button[@value='user']");
	By user_header = By.xpath("//div[@class='userheadertext']");
	By userPaginate = By.id("example_paginate");
	By paginateSize = By.xpath("//div[@id ='example_paginate']/span/a[1]");
	By firstPage = By.xpath("//div[@id ='example_paginate']/span/a[1]");
	By lastPage = By.xpath("//div[@id ='example_paginate']/span/a[6]");
	By tableRows = By.xpath("//table[@id='example']//tr");
	By nextLink = By.id("example_next");
	By previousLink = By.id("example_previous");
	By tableDisplay = By.xpath("//table[@id='example']");
	By nextIcon = By.xpath("//a[text()='»']");
	By previousIcon = By.xpath("//a[text()='<<']");
	By entryDetailsShow = By.id("example_info");
	By addNewUser = By.xpath("//div/button");
	By user_footer = By.xpath("//div[@class='footertext']");
	By btnaddNewUser = By.xpath("//span[text()='Add New User']");
	By userDetailDialogBox = By.xpath("//span[text()='userdetails']");
	By tableHeader = By.xpath("//table[@id='example']/thead");
	By sortDesc = By.xpath("//table/thead/tr/th[1][@class='sorting sorting_desc']");
	By sortAsc = By.xpath("//table/thead/tr/th[1][@class='sorting sorting_asc']");
	By id = By.xpath("//table[@id='example']//tbody//td[1]");
	
	By checkBox = By.xpath("//input[@id='hobbies-checkbox-1']");
	By btnDelete = By.xpath("//input[@value='delete']");
	By dialogBoxConfirm_Delete =By.xpath("//span[text()='deleteDialog']");
	By close_ConfirmDialogBox = By.xpath("//span[text()='cofirmdialogbox']");
	
	By search = By.xpath("//input[@id='search']");
	By searchInputField = By.xpath("//div[@id='search-input']");
	By searchPlaceholder = By.xpath("//input[@placeholder='Search...']");
	By searchIcon = By.xpath("//button[@id='search-icon-legacy']");
	By name = By.xpath("//table[@id='example']//tbody//td[2]");	
	By NewUserDetailsWindow = By.xpath("//span[text()='userdetailswindow']");
	
	
	
	By cancelBtn = By.xpath("//button[@name='cancel']");
	By submitBtn = By.id("submitButton");
	By cancelIcon =By.xpath("//button[@data-card-widget='remove']");
//placeholdersUserDetails	
	By FirstNamePlaceholder = By.xpath("//input[@placeholder='FirstName']");
	By MiddleNamePlaceholder = By.xpath("//input[@placeholder='MiddleName']");
	By LastNamePlaceholder = By.xpath("//input[@placeholder='LastName']");
	By EmailIDPlaceholder = By.xpath("//input[@placeholder='EmailID']");
	By PhoneNoPlaceholder = By.xpath("//input[@placeholder='PhoneNo']");
	By addressPlaceholder = By.xpath("//input[@placeholder='address']");
	By cityPlaceholder = By.xpath("//input[@placeholder='city']");
	By statePlaceholder = By.xpath("//input[@placeholder='state']");
	By postalCodePlaceholder = By.xpath("//input[@placeholder='postalCode']");
	By programPlaceholder = By.xpath("//input[@placeholder='program']");
	By UGprogramPlaceholder = By.xpath("//input[@placeholder='UGprogram']");
	By PGprogramPlaceholder = By.xpath("//input[@placeholder='PGprogram']");
	By skillPlaceholder = By.xpath("//input[@placeholder='skill']");
	By ExperiancePlaceholder = By.xpath("//input[@placeholder='Experiance']");
	By userRolePlaceholder = By.xpath("//input[@placeholder='userRole']");
	By visaStatusPlaceholder = By.xpath("//input[@placeholder='visaStatus']");
	By batchPlaceholder = By.xpath("//input[@placeholder='batch']");
	By commentsPlaceholder = By.xpath("//input[@placeholder='comments']");
	By editDeleteBtn = By.id("edit_delete");
	By editBtn = By.id("edit");
	By editDialogBox = By.xpath("//span[text()='editDialog']");
	By FirstName = By.name("firstname");
	By MiddleName = By.name("middlename");
	By LastName = By.name("lastname");
	By EmailID = By.id("emailControl");
	By PhoneNo = By.xpath("//input[@id='mat-input-9']");
	By address = By.id("address");
	By city =  By.xpath("//input[@id='mat-input-12']");
	By state=  By.xpath("//input[@id='mat-input-13']");
	By postalCode =By.xpath("//input[@id='mat-input-10']");
	By program = By.id("id_program");
	By UGprogram = By.id("id_ugprogram");
	By PGprogram = By.id("id_pgprogram");
	By skill = By.xpath("//skill");
	By Experiance = By.xpath("//experiance");
	By userRole = By.xpath("//role");
	By visaStatus = By.id("//status");
	By batch = By.id("id_batch");
	By comments = By.id("id_comments");
	By dropDownState = By.xpath("//button[@data-toggle='dropdown']/strong");
	By dropDownRole = By.xpath("//button[@data-toggle1='dropdown1']/strong");
	
	By errorMessage = By.xpath("//div[@role='alert']");
	By successMessage = By.xpath("//div[@role='alert']");
	By address2Btn = By.xpath("//div/button");
	By NewAddress2 = By.xpath("//input[@id='mat-input-10']");

	public int tableRowSize;
	String elementPaginator;
	List<String> userIds = new ArrayList<String>();
	List<WebElement> userid;
	WebElement table=driver.findElement(tableDisplay);
	
	
	public UserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnUserTab()
	{
		driver.findElement(btnUser).click();
	}
	public String userHeaderValidation()
	{
		return driver.findElement(user_header).getText();
	}
	public void validationPaginate()
	{
		driver.findElement(userPaginate).isDisplayed();
		System.out.println("*********Displayed********");
		
	}
	public void disablePaginationValidate()
	{
		//int paginationSize = driver.findElements(paginateSize).size();
		 elementPaginator = driver.findElement(userPaginate).getAttribute("class");
		if(elementPaginator.contains("disabled"))
		{
			System.out.println("Paginator Buttons Disabled");
		}
		
				
	}
	public void enablePaginationValidate()
	{
		if(!elementPaginator.contains("disabled"))
		{
			System.out.println("Paginator Buttons enabled");
		}
	}
	public void findRowCount()
	{
		int tableRowSize = driver.findElements(tableRows).size();
		System.out.println("table Size "+tableRowSize);
		if(tableRowSize==0)
		{
			System.out.println("No Rows is displayed in table");
		}
				
	}
	public void clickOnNextLink()
	{
		driver.findElement(nextLink).click();
	}
	public void disabledNextLink()
	{
		String nextClassName = driver.findElement(nextLink).getAttribute("class");
		if(nextClassName.contains("disabled"))
		{
			System.out.println("Next Link Disabled");
		}
	}
	public void lastRecordofPage()
	{
		driver.findElement(paginateSize).click();
	}
	public void clickOnPreviousLink()
	{
		driver.findElement(previousLink).click();
	}
    public void tableDisplayed() {
    	driver.findElement(tableDisplay).isDisplayed();
	
    }
    public void disablePreviousLink()
    {
    	String previousClassName = driver.findElement(previousLink).getAttribute("class");
    	if(previousClassName.contains("disabled"))
    	{
    		System.out.println("previous Link Disabled");
    	}
    }
	public void clickOnNexticon()
	{
		driver.findElement(nextIcon).click();
	}
	public void clickOnPreviousicon()
	{
		driver.findElement(previousIcon).click();
	}
	public void clickOnFirstPage()
	{
		driver.findElement(firstPage).click();
	}
	public void clickOnLastPage()
	{
		driver.findElement(lastPage).click();
	}
	public String showEntryDetails()
	{
		return driver.findElement(entryDetailsShow).getText();
				
	}
	public void displayAddNewUser()
	{
		driver.findElement(addNewUser).isDisplayed();
	}
	public String userFooterValidation()
	{
		return driver.findElement(user_footer).getText();
	}
	public void clickOnAddNewUser()
	{
		driver.findElement(btnaddNewUser).click();
	}
	public String displayUserDetailDialogBox()
	{
		return driver.findElement(userDetailDialogBox).getText();
				
	}
	public String displayTableHeader()
	{
		return driver.findElement(tableHeader).getText();
	}
	public void clickOnSortingDesc()
	{
		driver.findElement(sortDesc).click();
	}
	public void clickOnSortingAsc()
	{
		driver.findElement(sortAsc).click();
	}
	public void sorting()
	{
		 userid = (List<WebElement>)driver.findElement(id);
		 for (WebElement user_id :userid) {
			userIds.add(user_id.getText());
		 }
		 for (String ID :userIds) {
			 System.out.println(ID);
		 }
		 Collections.sort(userIds);
		 Collections.reverse(userIds);
	}
	public void clickOnCheckBoxValidation()
	{
		driver.findElement(checkBox).click();
		
		
	}
	public void displayDeleteIcon()
	{
		driver.findElement(btnDelete).isDisplayed();
	}
	
	public void disableBtnDelete()
	{
		String classDelete = driver.findElement(btnDelete).getAttribute("class");
		if(classDelete.contains("disabled"))
    	{
    		System.out.println("Delete button Disabled");
    	}
	}
	public void enableBtnDelete()
	{
		String classDelete = driver.findElement(btnDelete).getAttribute("class");
		if(!classDelete.contains("disabled"))
    	{
    		System.out.println("Delete button Enabled");
    	}
	}
	public void UncheckedCheckBox()
	{
		if(!driver.findElement(checkBox).isSelected())
		{
			disableBtnDelete();
		}
	}
	public void CheckedCheckBox()
	{
		if(driver.findElement(checkBox).isSelected())
		{
			enableBtnDelete();
		}
	}
	public void clickOnDelete()
	{
		driver.findElement(btnDelete).click();
	}
	public String confirmDialogBox_DeleteBtn()
	{
		return driver.findElement(dialogBoxConfirm_Delete).getText();
	}
	public void closeCofirmDialogBox_Delete()
	{
		 driver.findElement(close_ConfirmDialogBox).click();
		
	}
	public void displaySearch() {
		driver.findElement(search).isDisplayed();
	}
	public String displaySearchPlaceHoder() {
		return driver.findElement(searchPlaceholder).getText();
	}
	public void displaySeachInputField() {
		driver.findElement(searchInputField).isDisplayed();
	}
	public void displaySearchIcon() {
		driver.findElement(searchIcon).isDisplayed();
	}
	public void enterNameSearch()
	{
		driver.findElement(name).sendKeys("John Dove");
	}
	public String randomName()
	{
		String generatedName = RandomStringUtils.randomAlphabetic(8);
		driver.findElement(name).sendKeys("generatedName");
		System.out.println("Random Name" +generatedName);
		return generatedName;
	}
	public void clickOnSearch()
	{
		driver.findElement(search).click();
	}
	public boolean searchByName(String Name)
	{
		boolean flag = false;
		for(int i=1;i<=tableRowSize;i++)
		{			
			String name = table.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			if(name.equals(Name))
			{
				flag =true;
			}
		}
		return flag;
	}
	public void clickOnID()
	{
		driver.findElement(By.xpath("//table//tbody/tr/td[1]")).click();
	}
	public String displayUserDetailWindow()
	{
		return driver.findElement(NewUserDetailsWindow).getText();
				
	}
	public void displayCancelBtn()
	{
		driver.findElement(cancelBtn).isDisplayed();
	}
	public void clickOnCancelBtn()
	{
		driver.findElement(cancelBtn).click();
		
	}
	public void clickOnCancelIcon()
	{
		driver.findElement(cancelIcon).click();
	}
	public void displaySubmitBtn()
	{
		driver.findElement(submitBtn).isDisplayed();
		
	}
	public void enterUserDetails() {
		driver.findElement(FirstName).sendKeys("Deepthi");
		driver.findElement(MiddleName).sendKeys("Harilal");
		driver.findElement(LastName).sendKeys("Liju");
		driver.findElement(EmailID).sendKeys("Deepu85@gmail.com");
		driver.findElement(PhoneNo).sendKeys("4698681234");
		driver.findElement(address).sendKeys("5311 N macArthur");
		driver.findElement(city).sendKeys("Frisco");
		driver.findElement(state).sendKeys("Texas");
		driver.findElement(postalCode).sendKeys("76227");
		driver.findElement(program).sendKeys("AutomationQA");
		driver.findElement(UGprogram).sendKeys("DegreeMaths");
		driver.findElement(PGprogram).sendKeys("BTech");
		driver.findElement(skill).sendKeys("Coding");
		driver.findElement(Experiance).sendKeys("4+ years");
		driver.findElement(userRole).sendKeys("Lead");
		driver.findElement(visaStatus).sendKeys("H4ead");
		driver.findElement(batch).sendKeys("Sdet82");
		driver.findElement(comments).sendKeys("I want to join as a full time tester job");
		
	}
	public void displayAllUserDetailsPlaceHolders()
	{
		driver.findElement(FirstNamePlaceholder).isDisplayed();		
		driver.findElement(MiddleNamePlaceholder).isDisplayed();
		driver.findElement(LastNamePlaceholder).isDisplayed();
		driver.findElement(EmailIDPlaceholder).isDisplayed();
		driver.findElement(PhoneNoPlaceholder).isDisplayed();
		driver.findElement(addressPlaceholder).isDisplayed();
		driver.findElement(cityPlaceholder).isDisplayed();
		driver.findElement(statePlaceholder).isDisplayed();
		driver.findElement(postalCodePlaceholder).isDisplayed();
		driver.findElement(programPlaceholder).isDisplayed();
		driver.findElement(UGprogramPlaceholder).isDisplayed();
		driver.findElement(PGprogramPlaceholder).isDisplayed();
		driver.findElement(skillPlaceholder).isDisplayed();
		driver.findElement(ExperiancePlaceholder).isDisplayed();
		driver.findElement(userRolePlaceholder).isDisplayed();
		driver.findElement(visaStatusPlaceholder).isDisplayed();
		driver.findElement(batchPlaceholder).isDisplayed();
		driver.findElement(commentsPlaceholder).isDisplayed();
		
	}
	public void displayUserDetailsInputFields()
	{
		driver.findElement(FirstName).isDisplayed();
		driver.findElement(FirstName).isDisplayed();
		driver.findElement(FirstName).isDisplayed();
		driver.findElement(EmailID).isDisplayed();
		driver.findElement(PhoneNo).isDisplayed();
		driver.findElement(address).isDisplayed();
		driver.findElement(city).isDisplayed();
		driver.findElement(state).isDisplayed();
		driver.findElement(postalCode).isDisplayed();
		driver.findElement(program).isDisplayed();
		driver.findElement(UGprogram).isDisplayed();
		driver.findElement(PGprogram).isDisplayed();
		driver.findElement(skill).isDisplayed();
		driver.findElement(Experiance).isDisplayed();
		driver.findElement(userRole).isDisplayed();
		driver.findElement(visaStatus).isDisplayed();
		driver.findElement(batch).isDisplayed();
		driver.findElement(comments).isDisplayed();
		
	}
	public void clickOnDropDownState()
	{
		driver.findElement(dropDownState).click();
	}
	public void dropdownStateValidate() {
		Select select = new Select(driver.findElement(dropDownState));
		 List<WebElement> optionsState = select.getOptions();
		 for(WebElement option:optionsState) {
		 System.out.println("List Of State"+option.getText());
		 }
	}
	public void clickOnDropDownRole()
	{
		driver.findElement(dropDownRole).click();
	}
	public void dropdownRoleValidate() {
		Select select = new Select(driver.findElement(dropDownRole));
		 List<WebElement> optionsRole = select.getOptions();
		 for(WebElement option:optionsRole) {
		 System.out.println("List Of Roles"+option.getText());
		 }
	}
	public void clickOnSubmitBtn()
	{
		driver.findElement(submitBtn).click();
	}
	public String displayErrorMessage()
	{
		return driver.findElement(errorMessage).getText();
	}
	public String displaySuccessMessage()
	{
		return driver.findElement(successMessage).getText();
	}

	public void enterFewUserDetails() {
		// TODO Auto-generated method stub
		driver.findElement(MiddleName).sendKeys("Harilal");
		driver.findElement(EmailID).sendKeys("Deepu85@gmail.com");
		driver.findElement(PhoneNo).sendKeys("4698681234");
		driver.findElement(address).sendKeys("5311 N macArthur");
		driver.findElement(city).sendKeys("Frisco");
		driver.findElement(state).sendKeys("Texas");
		driver.findElement(postalCode).sendKeys("76227");
		driver.findElement(program).sendKeys("AutomationQA");
		driver.findElement(UGprogram).sendKeys("DegreeMaths");
		driver.findElement(PGprogram).sendKeys("BTech");
		driver.findElement(skill).sendKeys("Coding");
		driver.findElement(Experiance).sendKeys("4+ years");
		driver.findElement(userRole).sendKeys("Lead");
		driver.findElement(visaStatus).sendKeys("H4ead");
		driver.findElement(batch).sendKeys("Sdet82");
		driver.findElement(comments).sendKeys("I want to join as a full time tester job");
	}

	public void enterWrongEmailID() {
		// TODO Auto-generated method stub
		driver.findElement(FirstName).sendKeys("Deepthi");
		driver.findElement(MiddleName).sendKeys("Harilal");
		driver.findElement(LastName).sendKeys("Liju");
		driver.findElement(EmailID).sendKeys("Deepu85gmail%com");
		driver.findElement(PhoneNo).sendKeys("4698681234");
		driver.findElement(address).sendKeys("5311 N macArthur");
		driver.findElement(city).sendKeys("Frisco");
		driver.findElement(state).sendKeys("Texas");
		driver.findElement(postalCode).sendKeys("76227");
		driver.findElement(program).sendKeys("AutomationQA");
		driver.findElement(UGprogram).sendKeys("DegreeMaths");
		driver.findElement(PGprogram).sendKeys("BTech");
		driver.findElement(skill).sendKeys("Coding");
		driver.findElement(Experiance).sendKeys("4+ years");
		driver.findElement(userRole).sendKeys("Lead");
		driver.findElement(visaStatus).sendKeys("H4ead");
		driver.findElement(batch).sendKeys("Sdet82");
		driver.findElement(comments).sendKeys("I want to join as a full time tester job");
	}

	public void displayAddress2Btn() {
		// TODO Auto-generated method stub
		driver.findElement(address2Btn).isDisplayed();
	}

	public void enterWrongPhoneNumber() {
		// TODO Auto-generated method stub
		driver.findElement(FirstName).sendKeys("Deepthi");
		driver.findElement(MiddleName).sendKeys("Harilal");
		driver.findElement(LastName).sendKeys("Liju");
		driver.findElement(EmailID).sendKeys("Deepu85gmail%com");
		driver.findElement(PhoneNo).sendKeys("469868123456");
		driver.findElement(address).sendKeys("5311 N macArthur");
		driver.findElement(city).sendKeys("Frisco");
		driver.findElement(state).sendKeys("Texas");
		driver.findElement(postalCode).sendKeys("76227");
		driver.findElement(program).sendKeys("AutomationQA");
		driver.findElement(UGprogram).sendKeys("DegreeMaths");
		driver.findElement(PGprogram).sendKeys("BTech");
		driver.findElement(skill).sendKeys("Coding");
		driver.findElement(Experiance).sendKeys("4+ years");
		driver.findElement(userRole).sendKeys("Lead");
		driver.findElement(visaStatus).sendKeys("H4ead");
		driver.findElement(batch).sendKeys("Sdet82");
		driver.findElement(comments).sendKeys("I want to join as a full time tester job");
	}

	public void enterWrongPostalCode1() {
		// TODO Auto-generated method stub
		driver.findElement(FirstName).sendKeys("Deepthi");
		driver.findElement(MiddleName).sendKeys("Harilal");
		driver.findElement(LastName).sendKeys("Liju");
		driver.findElement(EmailID).sendKeys("Deepu85gmail%com");
		driver.findElement(PhoneNo).sendKeys("469868123456");
		driver.findElement(address).sendKeys("5311 N macArthur");
		driver.findElement(city).sendKeys("Frisco");
		driver.findElement(state).sendKeys("Texas");
		driver.findElement(postalCode).sendKeys("7622789");
		driver.findElement(program).sendKeys("AutomationQA");
		driver.findElement(UGprogram).sendKeys("DegreeMaths");
		driver.findElement(PGprogram).sendKeys("BTech");
		driver.findElement(skill).sendKeys("Coding");
		driver.findElement(Experiance).sendKeys("4+ years");
		driver.findElement(userRole).sendKeys("Lead");
		driver.findElement(visaStatus).sendKeys("H4ead");
		driver.findElement(batch).sendKeys("Sdet82");
		driver.findElement(comments).sendKeys("I want to join as a full time tester job");
	}

	public void displayAlphabeticalOrderState1() {
		// TODO Auto-generated method stub
		driver.findElement(dropDownState).isDisplayed();
	}

	public void clickOnUGprogramDropDown() {
		// TODO Auto-generated method stub
		driver.findElement(UGprogram).click();
	}

	public void displayUGprogramList() {
		// TODO Auto-generated method stub
		driver.findElement(UGprogram).isDisplayed();
	}

	public void clickOnAddress2Btn() {
		// TODO Auto-generated method stub
		driver.findElement(address2Btn).click();
	}
	public void displayNewAddress2()
	{
		 driver.findElement(NewAddress2).isDisplayed();
				
	}

	public void editOrDeleteBtn() {
	
		// TODO Auto-generated method stub
		driver.findElement(editDeleteBtn).isDisplayed();
	}

	public void clickOnEditOrDeleteBtn() {
		// TODO Auto-generated method stub
		driver.findElement(editDeleteBtn).click();
	}

	public void clickOnEditBtn() {
		
		// TODO Auto-generated method stub
		driver.findElement(editBtn).click();
	}

	public void displayEditDialogBox() {
		
		// TODO Auto-generated method stub
		driver.findElement(editDialogBox).isDisplayed();
	}	
	
}
