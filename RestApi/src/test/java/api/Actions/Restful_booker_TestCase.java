package api.Actions;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;

import api.CRUD.Restful_booker_API;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Restful_booker_TestCase {
	Response resp=null;
	String extractResponse;
	String aToken; 
	JsonPath js;
	int rCode;
	int targetBookingId; 
	
	
	public void create_auth_token(String username,String password)
	{
		//Restful_booker_API obj = new Restful_booker_API();
		resp= Restful_booker_API.auth_token(username, password);
		//System.out.println(username);
		System.out.println("The response from the crud class is "+resp);
		extractResponse= resp.then().log().all().extract().response().asString();
		js= new JsonPath(extractResponse);
		aToken= js.getString("token");
		System.out.println("The auth Token is "+ aToken);
		//header validations	
				String cnctn1= resp.header("Connection");
				Assert.assertEquals("keep-alive", cnctn1);
	}
	
	public void validations(int statusCode)
	{
		rCode= resp.getStatusCode();
		Assert.assertEquals(rCode, statusCode);

		
	}
	
	public void getAllIds(String endpoints, int cde)
	{
		resp= Restful_booker_API.getRequest(endpoints);
		extractResponse= resp.then().log().all().extract().response().asString();
		this.validations(cde);
		
//fetching all bookingIds
		js= new JsonPath(extractResponse);  //ask hari to explain this
		List<Integer> bookingIds= js.getList("bookingid");
		System.out.println("All id "+bookingIds);
//targetId
		 targetBookingId=543 ;
		/*List<Integer> filteredBookinId= bookingIds.stream().filter(bookingId -> bookingId==targetBookingId)
										.collect((Collectors.toList()));
		System.out.println("The filtered booking Id is "+ filteredBookinId);*/
  		bookingIds.stream().filter(n ->n==targetBookingId).forEach(n ->System.out.println("The filtered booking Id is "+ n));
		//bookingIds.stream().filter(n->n==targetBookingId).forEach(System.out::println);
		
	}
	
// Get request Returns a specific booking based upon the booking id provided
	public void get_By_Id(String endpoints, int cde)
	{
		resp= Restful_booker_API.getRequest(endpoints);
		extractResponse= resp.then().log().all().extract().response().asString();
	
		js= new JsonPath(extractResponse);
		String firstname= js.getString("firstname");
		String lastname= js.getString("lastname");
	
		
	}
	
}
