package github;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	      
		  @BeforeTest                                             // annotated method placed in the beginning.  
		  public void before_test()  
		  {  
		      GetMobileNo.mobilenpss(); 
		  }  
		  @Test  
		  public void software_developers()  
		  {  
		      System.out.println("Software Developers");  
		      AccessToken.getAccessToken();		
		    	  }  
		    
		  @Test  
		  public void software_testers()  
		  {  
		      System.out.println("Software Testers");  
		  }  
		    
		  @Test  
		  public void qa_analyst()  
		  {  
		      System.out.println("QA Analyst");  
		  }}  
