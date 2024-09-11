package testngPackage;
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
public class TestNG_1 
{
   @Test  //decides the no.of test cases
   public void testcase1()
   {
	   System.out.println("Test");   
   }
   @BeforeSuite
   public void bs()
   {
	  System.out.println("bs"); 
   }
   @BeforeTest
   public void bt()
   {
	   System.out.println("bt");   
   }
   @BeforeClass
   public void bc()
   {
	   System.out.println("bc");  
   }
   @BeforeMethod
   public void bm()
   {
	   System.out.println("bm"); 
	    }
   @AfterSuite
   public void AS()
   {
	  System.out.println("AS"); 
   }
   @AfterTest
   public void AT()
   {
	   System.out.println("AT");   
   }
   @AfterClass
   public void AC()
   {
	   System.out.println("AC");  
   }
   @AfterMethod
   public void AM()
   {
	   System.out.println("AM"); 
   }
} 
   

