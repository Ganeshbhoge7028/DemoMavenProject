package github;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

public class GetMobileNo extends BaseClass{
	public static void main(String[] args) {
        mobilenpss();
    }
public static void mobilenpss() {
        // Specify the base URL of the API
        RestAssured.baseURI =BaseURL;
        String endpoint=endpointsMap.get("retrieve-contact-by-mobile");

        // Disable SSL certificate validation
        RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());

        // Send the GET request and get the response
        Response response = RestAssured.given()
        		.header("Authorization", "Bearer " + token)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
        // Print the response status code
        System.out.println("Status code: " + response.getStatusCode());
        // Print the response body
        System.out.println("Response body: " + response.prettyPrint());
    }
}
