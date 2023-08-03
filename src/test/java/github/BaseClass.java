package github;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;


public class BaseClass {
	 protected static String BaseURL="https://localhost:7028";
	  protected static String token;
	  static String A1;
	    protected static HashMap<String, String> endpointsMap = new HashMap<>();

	    static {
	        // Retrieve the access token once and store it in the Token variable
	    	
	        token = AccessToken.getAccessToken();
	        try (FileReader reader = new FileReader("./EndPoint/FEmobileEndPoint.config")) {
	            Properties props = new Properties();
	            props.load(reader);
	            for (String key : props.stringPropertyNames()) {
	                endpointsMap.put(key, props.getProperty(key));
	            }
	            A1 = endpointsMap.get("A1");
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the exception appropriately
	        }
}
}
