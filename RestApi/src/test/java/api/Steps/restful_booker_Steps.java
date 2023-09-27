package api.Steps;

import api.Actions.Restful_booker_TestCase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class restful_booker_Steps {
	
	Restful_booker_TestCase obj_Restful_booker_TestCase= new Restful_booker_TestCase();

	@Given("User creates post req for the restbooker API")
	public void user_creates_post_req_for_the_restbooker_api() {
	    System.out.println("Trying to generate auth token");
	}

	@When("User sends HTTPS Request and  {string} {string} to get the token")
	public void user_sends_https_request_and_to_get_the_token(String username, String password) {
		obj_Restful_booker_TestCase.create_auth_token(username, password);
	}

	@Then("user receives {int} status with response body")
	public void user_receives_status_with_response_body(Integer int1) {
		obj_Restful_booker_TestCase.validations(int1);
	}
	
// Scenario 2:Get req to fetch all ID's

	@Given("User creates get req for the restbooker API")
	public void user_creates_get_req_for_the_restbooker_api() {
	    System.out.println("User trying to get all Ids");
	}

	@When("User sends HTTPS Request with {string} to get all ID'S and code {int}")
	public void user_sends_https_request_with_to_get_all_id_s_and_code(String endpoints, Integer int1) {
		obj_Restful_booker_TestCase.getAllIds(endpoints, int1);
	}
	
	@When("User sends HTTPS Request with {string} to get targeted ID and code {int}")
	public void user_sends_https_request_with_to_get_targeted_id_and_code(String endpoints, Integer int1) {
		obj_Restful_booker_TestCase.get_By_Id(endpoints, int1);
	}


}
