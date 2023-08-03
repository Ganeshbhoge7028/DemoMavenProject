package github;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AccessToken {
public static void main(String[] args) {
		
		String Token = getAccessToken(); 
		System.out.println("AcsessToken:"+Token);
	}
		public static String getAccessToken() {
		    RestAssured.baseURI = "http://182.73.175.19:8080/realms/npss-mobile/protocol/openid-connect/token";
		    RequestSpecification httpRequest = RestAssured.given();

		    // Set JSON body
		    String requestBody = "client_id=npss-mobile-client&"
	                  + "grant_type=password&"
	                  + "scope=openid&"
	                  + "username=QAMobileConsumer&"
	                  + "password=QAMobileConsumer";

		    // Send POST request and get the response
		    Response response = httpRequest.contentType(ContentType.URLENC)
		            .body(requestBody)
		            .post();

		    // Get the status code
		    int statusCode = response.getStatusCode();

		    // Print the status and message body of the response received from the server
		    System.out.println("Status received: " + response.getStatusLine());

		    // Get the access token from the response
		    String accessToken = response.jsonPath().getString("access_token");

		    // Validate token
		    if (statusCode != 200) {
		        accessToken = null;
		    }

		    // Return the access token
		    return accessToken;
		}
}
