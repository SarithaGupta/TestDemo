package api.CRUD;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restful_booker_API {
	static RequestSpecification requestSpecification= RestAssured
			.given().baseUri("https://restful-booker.herokuapp.com"); // check is this the only way?
	
	static Response response;
	
	static ResourceBundle getUrl()
	{
		ResourceBundle endPoints= ResourceBundle.getBundle("endPoints");
		return endPoints;
	}
	
	public static Response auth_token(String username,String password)
	{
//JSONObject to parse the test data as JSON object 		
		JSONObject requestParams = new JSONObject();
		 requestParams.put("username", username);
		 requestParams.put("password", password); 
		 
// reading end point from property file
		String auth_Token= getUrl().getString("auth_Token");
		
//parse headers
		Map<String,String> headers= new HashMap();
		headers.put("Content-Type", "application/json");
		headers.put("User-Agent", "PostmanRuntime/7.32.3");
		headers.put("Accept-Encoding", "gzip, deflate, br");
		String cnctn= headers.put("Connection", "keep-alive");
		
		
//	HTTP requests	
		response = RestAssured.given(requestSpecification)
		.contentType(ContentType.JSON)
		.headers(headers)
		//.accept(ContentType.JSON)
		.body(requestParams.toString())
		//.formParam("username", "admin")
		//.formParam("password", "password123")
		//.pathParams("username", username, "password", password)
		.log().all()
		.when().post(auth_Token)
		.then().log().all().extract().response();
		//System.out.println("The response is "+ response);
		return response;
	}
	
	public static Response getRequest(String endpoints)
	{
// reading end point from property file
		//String getAllIds=getUrl().getString("getAllIds");
		response= RestAssured.given(requestSpecification)
				.header("Connection", "keep-alive")
				.when().get(endpoints);
	      		return response;
		
	}

}
