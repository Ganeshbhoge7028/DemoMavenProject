package github;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
	 WebDriver driver;

	    @Test
	    public void f() {
	        String baseUrl = "https://www.javatpoint.com/";
	        
	        System.out.println("Launching Google Chrome browser");
	        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	        
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        driver.findElement(By.xpath("//a[text()=' SQL']")).click();	       // String testTitle = "JavaTpoint - A Solution of all Technology";
	        String originalTitle = driver.getTitle();
	        System.out.println(originalTitle);
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
