package testngPackage;

import org.testng.annotations.Test;

public class Annotations_Priority {

	 @Test (priority=2)  //excutes based on the priority. if its not given then it will be 0 and excutes in the alphabetical order
	   public void login() 
	   {
		   System.out.println("Login");   
	   }
	  @Test(priority=1)
	   public void registration()
	   {
		   System.out.println("Registration");   
	   }
	  @Test (priority=3) 
	   public void logout()
	   {
		   System.out.println("Logout");   
	   }
}
