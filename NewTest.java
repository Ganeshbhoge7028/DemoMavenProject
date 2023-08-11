import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver ;
	@Test
	public void f() {
	  
	    String baseUrl = "https://www.javatpoint.com/";
	      
	         
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        String testTitle = "Free QA Automation Tools For Everyone";
	       String originalTitle = driver.getTitle();
	       Assert.assertEquals(originalTitle, testTitle);
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}

}
