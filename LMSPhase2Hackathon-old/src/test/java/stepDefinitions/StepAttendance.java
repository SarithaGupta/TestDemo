package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.AttendancePage;

public class StepAttendance extends BaseClass{
	
	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		
		 at = new AttendancePage(driver);		    
		 driver.get("https://www.google.com/");
	}

	@When("Admin\\/User\\/Staff Clicks on Attendance button")
	public void admin_user_staff_clicks_on_attendance_button() {
	    at.clickOnAttendance();
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String header ) {
		String actualMessage = at.headerValidation();
		Assert.assertTrue(actualMessage.contains(header));
	}
	
	@When("Admin\\/User\\/Staff Clicks on {string} button tab")
	public void admin_user_staff_clicks_on_button_tab(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}

	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String footer) {
		String actualMessage = at.footerValidation();
		Assert.assertTrue(actualMessage.contains(footer));
	}
	@Then("Admin\\/User\\/Staff see the text as {string}")
	public void admin_user_staff_see_the_text_as(String paginator) {
		String actualMessage = at.paginatorValidation();
		Assert.assertTrue(actualMessage.contains(paginator));
	   
	}
	@Then("Admin\\/User\\/Staff see all paginator buttons are Disabled")
	public void admin_user_staff_see_all_paginator_buttons_are_disabled() {
	   at.paginatorValidation1();
	}
	
	@Given("User\\/Staff is on Manage Attendance page")
	public void user_staff_is_on_manage_attendance_page() {
		 at.clickOnAttendance();
	}

	@When("User\\/Staff Clicks on Edit button")
	public void user_staff_clicks_on_edit_button() {
	    at.clickOnEdit();
	    at.attendanceDetails();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String msg) {
		String actualMessage = at.editValidation();
		Assert.assertTrue(actualMessage.contains(msg));
	}
	@When("^User\\/Staff clicks on Save button after changing program name (.*)$")
	public void user_staff_clicks_on_save_button_after_changing_program_name(String pname) {
	   at.editProgramName(pname);
	   at.clickOnSave();
	}
	@When("^User\\/Staff clicks on Save button after changing user name (.*)$")
	public void user_staff_clicks_on_save_button_after_changing_user_name(String uname) {
	   at.editUserName(uname);
	   at.clickOnSave();
	}
	@Then("User\\/Staff see the success message {string}")
	public void user_staff_see_the_success_message(String string) {
	    at.alertMessageSuccess();
	}
	@When("User\\/Staff clicks on Save button after disabling Present details")
	public void user_staff_clicks_on_save_button_after_disabling_present_details() {
		at.disablePresentDetails();
	    at.clickOnSave();
	}
	@When("User\\/Staff clicks on Save button after enabling Absent details")
	public void user_staff_clicks_on_save_button_after_enabling_absent_details() {
		at.enableAbsentDetails();
		at.clickOnSave();
	}
	@When("User\\/Staff clicks on Cancel button after entering details")
	public void user_staff_clicks_on_cancel_button_after_entering_details(String pname,String uname) {
	   at.editProgramName(pname);
	   at.editUserName(uname);
	   at.clickOnCancel();
	}

	@Then("User\\/Staff see a Attendance Details window getting closed")
	public void user_staff_see_a_attendance_details_window_getting_closed() {
	   at.attendanceDetails();
	}
	@Given("Admin is on Manage Attendance page")
	public void admin_is_on_manage_attendance_page() {
	    at.clickOnAttendance();
	}

	@When("Admin Clicks on {string} button")
	public void admin_clicks_on_button(String string) {
	   at.clickOnEdit();
	}

	@Then("Admin see Error Message {string}")
	public void admin_see_error_message(String string) {
	    at.clickOnErrorMessage();
	}
	@When("User\\/Staff Clicks on Delete button")
	public void user_staff_clicks_on_delete_button() {
	   at.clickOnDelete();
	}
	@When("User\\/Staff  Clicks on {string}  button")
	public void user_staff_clicks_on_button(String string) {
	   at.clickOnYesBtnDelete();
	}

	@When("User\\/Staff  Click on {string} button")
	public void user_staff_click_on_button(String string) {
	    at.clickOnNoBtnDelete();
	}
	
	@Given("Admin\\/User\\/Staff is on {string} page")
	public void admin_user_staff_is_on_page(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}

	@When("Admin\\/User\\/Staff Clicks on Checkbox")
	public void admin_user_staff_clicks_on_checkbox() {
		 at.ClickOnSDETCheckbox();
	}

	@Then("Admin\\/User\\/Staff  see list of Users in that Program")
	public void admin_user_staff_see_list_of_users_in_that_program() {
	    at.displayListOfUsers();
	}
	
	@When("Admin\\/User\\/Staff  Clicks on Present")
	public void admin_user_staff_clicks_on_present() {
	    at.clickOnPresentBtn();
	}

	@Then("Admin\\/User\\/Staff  see the list of {string} who are Present")
	public void admin_user_staff_see_the_list_of_who_are_present(String string) {
		at.displayListOfPresent();
	}
	
	@Given("Admin\\/User\\/Staff is on Manage Attendance page")
	public void admin_user_staff_is_on_manage_attendance_page(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@When("Admin\\/User\\/Staff  Clicks on Absent")
	public void admin_user_staff_clicks_on_absent() {
	   at.clickOnAbsentBtn();
	}

	@Then("Admin\\/User\\/Staff  see the list of {string} who are Absent")
	public void admin_user_staff_see_the_list_of_who_are_absent(String string) {
	    at.displayListOfAbsent();
	}	

}
