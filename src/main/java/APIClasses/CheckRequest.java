package APIClasses;

import junit.framework.Assert;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CheckRequest {
	
	@Test
	public void getWeatherDetails(){
		
		//specify the base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//Request object
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		//GET
		
		String x = response.getBody().asString();
		
		System.out.println("The response is : "+x);
		
		System.out.println("status code is : "+response.getStatusCode());
		
		Assert.assertEquals(200, response.getStatusCode());
		
		System.out.println("status line : "+response.getStatusLine());
	
	}
	
	@Test
	public void registerCustomer(){
		

		//POST
		System.out.println("THIS is POST Reqest test ");
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		
		RequestSpecification httpReq = RestAssured.given();
		 
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "Isuru");
		requestParams.put("LastName", "Madanayaka");
		requestParams.put("UserName", "HIMUser");
		requestParams.put("Password", "abcABC@123");
		requestParams.put("Email", "hims.rc@gmail.com");
		
		httpReq.header("Content-Type","application/jason");
	
		httpReq.body(requestParams.toJSONString());
		
		Response resp =httpReq.request(Method.POST,"/register");
		
		System.out.println("second response body  : "+resp.getBody().asString());
		
		System.out.println("second response body status code : "+resp.getStatusCode());
		
		System.out.println("second response body status line : "+resp.getStatusLine());
		
		
	}

}
