package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.UserPage;

public class StepUser extends BaseClass{
	
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website {string}")
	public void admin_user_staff_logged_on_to_lms_website(String url) {
		up=new UserPage(driver);
	    driver.get(url);
	}
	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
		up = new UserPage(driver);
	   driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
	}


	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
	    up.clickOnUserTab();
	}	
	
	@Then("Admin\\/User\\/Staff should see the {string} page")
	public void admin_user_staff_should_see_the_page(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@Then("Admin\\/User\\/Staff should see the page heading as {string}")
	public void admin_user_staff_should_see_the_page_heading_as(String userHeader) {
		String actualMessage = up.userHeaderValidation();
		Assert.assertTrue(actualMessage.contains(userHeader));
	}
	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab {string}")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab(String url) {
		
		driver.manage().window().maximize();
	    driver.get(url);
	}

	
	@Then("Admin\\/User\\/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {
		
	    up.validationPaginate();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
	   
	}
//Validate the Pagination control with less rows
	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer int1) {
		up.findRowCount();
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	    
	    if(up.tableRowSize <=5)
		{
			up.disablePaginationValidate();
			
		}
	}
//Validate the Pagination control with more than 5 rows
	
	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
	       
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
	    if(up.tableRowSize>5)
	    {
	       up.enablePaginationValidate();
	    }
	}
//Verify pagination next link
	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {
	   up.clickOnNextLink();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	    System.out.println("Next page should be displayed in the table");
	}
	
//Verify pagination next link after last record of user table
	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {
	    up.lastRecordofPage();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
	    up.disabledNextLink();
	}
//Verify pagination Previous link
	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
	    up.tableDisplayed();
	}

	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {
	   up.clickOnPreviousLink();
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
	   System.out.println("Previous page should be displayed in the table");
	}
//Verify pagination previous link in first page of user table
	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
	   up.lastRecordofPage();
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
	   up.disablePreviousLink();
	}
//Verify button with << icon
	@When("Admin\\/User\\/Staff clicks << icon in pagination")
	public void admin_user_staff_clicks_icon_in_pagination() {
	    up.clickOnPreviousicon();
	}

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {
	   up.clickOnFirstPage();
	}
	
//Verify button with >> icon
	@When("Admin\\/User\\/Staff clicks {string} icon in pagination")
	public void admin_user_staff_clicks_icon_in_pagination(String string) {
	   up.clickOnNexticon();
	}


	@Then("Admin\\/User\\/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {
	    up.clickOnLastPage();
	}
//Verifiy the entry details below data table
	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
		
		
	}

	@Then("Admin\\/User\\/Staff should see the text {string} below the user table.")
	public void admin_user_staff_should_see_the_text_below_the_user_table(String entry) {
		String actualMessage = up.showEntryDetails();
		Assert.assertTrue(actualMessage.contains(entry));
	}
//Validating table footer
	@Then("Admin\\/User\\/Staffshould see the table footer as {string}.")
	public void admin_user_staffshould_see_the_table_footer_as(String footer) {
		String actualMessage = up.userFooterValidation();
		Assert.assertTrue(actualMessage.contains(footer));
	}
//Validate the presence of Add new user button
	@Then("Admin\\/User\\/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String string) {
	   up.displayAddNewUser();
	}
//Verify the functionality of Add new user button	
	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
	    up.clickOnAddNewUser();
	}

	@Then("Admin\\/User\\/Staff should see the {string} dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String userdetails) {
		String actualMessage =up.displayUserDetailDialogBox();
		Assert.assertTrue(actualMessage.contains(userdetails));
	}
//Validating Table header
	@Then("Admin\\/User\\/Staff should see the table header as {string} as column names")
	public void admin_user_staff_should_see_the_table_header_as_as_column_names(String tableHeader) {
		String actualMessage =up.displayTableHeader();
		Assert.assertTrue(actualMessage.contains(tableHeader));		
	}
//Verify the functionality of sort icon present in table header
	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {
		//driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		up.clickOnSortingDesc();
		up.clickOnSortingAsc();	  
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
		up.sorting();
	}
	
//Check box in table header
	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
	    up.clickOnCheckBoxValidation();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	   System.out.println("All table rows should be Checked");
	}
	
//Check box in table header
	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
		up.clickOnCheckBoxValidation();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		System.out.println("All table rows should be Unchecked");
	}
	
//Verify the presence of Delete icon in manage user page
	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	    up.displayDeleteIcon();
	}
	
//Behaviour of Delete icon when no rows unchecked
	@When("No rows is checked")
	public void no_rows_is_checked() {
	   up.UncheckedCheckBox();
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	   up.disableBtnDelete();
	}
//Behaviour of Delete icon when rows checked
	@When("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
	    up.clickOnCheckBoxValidation();
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
	    up.enableBtnDelete();
	}
	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	   up.clickOnDelete();
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(String Sure, String No, String Yes) {
		 up.confirmDialogBox_DeleteBtn();
					
	}
//Validating Confirm dialog box by selecting No	
	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon with title {string}")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon_with_title(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}

	@When("Admin\\/User\\/Staff clicks button with text {string}")
	public void admin_user_staff_clicks_button_with_text(String No) {
		
		Assert.assertTrue(up.confirmDialogBox_DeleteBtn().contains(No));
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		
	   up.closeCofirmDialogBox_Delete();
	}
	
//Validating Confirm dialog box by selecting Yes
	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String Yes) {
		
		Assert.assertTrue(up.confirmDialogBox_DeleteBtn().contains(Yes));
	}
	
//Validating Confirm dialog box by clicking close(x) icon
	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		up.confirmDialogBox_DeleteBtn(); 
	}

	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
	    up.closeCofirmDialogBox_Delete();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
	    System.out.println("DialogBox closed");
	}
//#Edit/Delete icon in each row
	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
	    up.editOrDeleteBtn();
	}
//#Edit/Delete icon in each row	
	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
	    up.clickOnEditOrDeleteBtn();
	}
//#Edit/Delete icon in each row
	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
	   up.clickOnEditBtn();
	}

	@Then("{string} dialog box should be displayed for editing")
	public void dialog_box_should_be_displayed_for_editing(String string) {
	    up.displayEditDialogBox();
	}
	
//Verify the presence of Input field for searching
	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String search) {
		up.displaySeachInputField();
		up.displaySearch();
	}
	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as {string}")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as(String searchtext) {
	    up.displaySearchIcon();
	    String searchPlaceHolder =up.displaySearchPlaceHoder();
		Assert.assertTrue(searchPlaceHolder.contains(searchtext));	
	}
//Verify the functionality of search
	@When("Admin\\/User\\/Staff types Name to search")
	public void admin_user_staff_types_name_to_search() {
	  up.enterNameSearch();
	  up.clickOnSearch();
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() {
	  boolean status = up.searchByName("John Dove");
	  Assert.assertEquals(true, status);
	}
//Verify the functionality of search
	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry() {
	  up.randomName();
	  up.clickOnSearch();
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
	   up.findRowCount();
	}
//Verify ID functionality
	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
	   up.clickOnID();
	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
		driver.findElement(By.xpath("//User Detils]")).isDisplayed();
	}
//Verify the heading of User Details window
	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
	  up.clickOnAddNewUser();
	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as {string}")
	public void admin_user_staff_should_see_user_details_window_with_text_as(String userDetailsWindow) {
		String actualMessage =up.displayUserDetailWindow();
		Assert.assertTrue(actualMessage.contains(userDetailsWindow));
	}
//Verify the presence of Cancel button in User Details window
	@Then("Admin\\/User\\/Staff should see a button with text as Cancel in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
	    up.displayCancelBtn();
	}
	
//Validate Fucntionality of Cancel button	
	@Given("Admin\\/User\\/Staff is on {string} window")
	public void admin_user_staff_is_on_window(String userdetails) {
		Assert.assertTrue(up.displayUserDetailWindow().contains(userdetails));
	}


	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
	   up.clickOnCancelBtn();
	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed(String manageuserpage) {
	   Assert.assertTrue(up.userHeaderValidation().contains(manageuserpage));
	   System.out.println("User details Window closed");
	}
	
//Verify the presence of Cancel(x) icon in user detais window
	@Then("Admin\\/User\\/Staff should see a cancel\\(x) icon")
	public void admin_user_staff_should_see_a_cancel_x_icon() {
	   up.clickOnCancelIcon();
	}
	
//Verify the presence of Submit button in User Details window	
	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
	   up.displaySubmitBtn();
	}
	
//Verify the presence of Label Texts	
	@Then("Admin\\/User\\/Staff should see the placeholders with Text As {string},{string}, {string},{string},{string}, {string},{string}, {string},{string}.{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void admin_user_staff_should_see_the_placeholders_with_text_as(String fname, String mname, String lname, String email, String ph, String address, String city, String state, String zip, String program, String ug, String pg, String skill, String exp, String role, String visa, String batch, String comments) {
	    up.displayAllUserDetailsPlaceHolders();
	}
	
//Verify the presence of input fields
	@Then("Admin\\/User\\/Staff should see the input fields for {string},{string},{string},{string},{string}, {string},{string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} corresponding to their labels")
	public void admin_user_staff_should_see_the_input_fields_for_corresponding_to_their_labels(String fname, String mname, String lname, String email, String ph, String address, String city, String state, String zip, String program, String ug, String pg, String skill, String exp, String role, String visa, String batch, String comments) {
	    up.displayUserDetailsInputFields();
	}
	
//Verify drop down menu for state
	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
	    up.clickOnDropDownState();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
	   up.dropdownStateValidate();
	}
//Verify drop down menu user role
	@When("Admin\\/User\\/Staff clicks the drop down icon user role")
	public void admin_user_staff_clicks_the_drop_down_icon_user_role() {
	  up.clickOnDropDownRole();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_user_role() {
	    up.dropdownRoleValidate();
	}
	
//Validating the User Details window with all fields empty
	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
	   up.clickOnSubmitBtn();
	}

	@Then("Admin\\/User\\/Staff should see Error message {string}")
	public void admin_user_staff_should_see_a_error_message(String errorMsg) {
		String actualMessage =up.displayErrorMessage();
		Assert.assertTrue(actualMessage.contains(errorMsg));
	}
//Adding new User	
	@When("Admin\\/User\\/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {
	    up.enterUserDetails();
	    up.clickOnSubmitBtn();
	}

	@Then("Admin\\/User\\/Staff  see Success message  {string}  is  Should be Saved.")
	public void admin_user_staff_see_success_message_is_should_be_saved(String successMsg) {
		String actualMessage =up.displaySuccessMessage();
		Assert.assertTrue(actualMessage.contains(successMsg));
	}
	
//Validating the User Details window with few fields empty	
	@When("Admin\\/User\\/Staff clicks on Submit button after entering Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {
	   up.enterFewUserDetails();
	   up.clickOnSubmitBtn();
	}

	@Then("Admin\\/User\\/Staff see error message {string}")
	public void admin_user_staff_see_error_message(String errorMessage) {
		String actualMessage =up.displayErrorMessage();
		Assert.assertTrue(actualMessage.contains(errorMessage));
	}
	
//Validating the Email address
	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address() {
	   up.enterWrongEmailID();
	   up.clickOnSubmitBtn();
	}
	
//Validating the presence of Address2 button	
	@Then("Admin\\/User\\/Staff should see the address button with text {string}")
	public void admin_user_staff_should_see_the_address_button_with_text(String string) {
	    up.displayAddress2Btn();
	}
	
//Validating the Phone number	
	@When("Admin\\/User\\/Staff Enters more than {int} digits")
	public void admin_user_staff_enters_more_than_digits(Integer int1) {
	   up.enterWrongPhoneNumber();
	   up.clickOnSubmitBtn();
	}
	
//Validating Postal Code	
	@When("Admin\\/User\\/Staff Enters more than {int} digits in Postal code field")
	public void admin_user_staff_enters_more_than_digits_in_postal_code_field(Integer int1) {
	   up.enterWrongPostalCode1();
	   up.clickOnSubmitBtn();
	}
	
//Validating State dropdown	
	@When("Admin\\/User\\/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
	    up.clickOnDropDownState();
	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
	    up.displayAlphabeticalOrderState1();
	}
	
//Validating UG Program Dropdown
	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
	    up.clickOnUGprogramDropDown();
	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
	   up.displayUGprogramList();
	}
	
//Validating Address line in User Details window
	@When("Admin\\/User\\/Staff clicks the button {string}")
	public void admin_user_staff_clicks_the_button(String string) {
	   up.clickOnAddress2Btn();
	}

	@Then("Admin\\/User\\/Staff should see the input field with Label {string}")
	public void admin_user_staff_should_see_the_input_field_with_label(String string) {
		up.displayNewAddress2();
	}
	
}
