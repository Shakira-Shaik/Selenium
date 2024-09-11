package testngpackage1;
import org.testng.annotations.Test;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch_Browser {
 WebDriver driver;
@Test 
public void Launch()
{
 
 Scanner S1=new Scanner(System.in);
 System.out.println("Type 1 for Launching Chrome");
 System.out.println("Type 2 for Launching Edge");
 System.out.println("Type 3 for Launching Firefox");
 int input=S1.nextInt();
 if(input==1)
 {
	 driver=new ChromeDriver(); //upcasting and we make driver as globle
	 driver.manage().window().maximize();
 }
 if(input==2)
 {
	 driver=new EdgeDriver();
	 driver.manage().window().maximize();
 }
 if(input==3)
 {
	 driver =new FirefoxDriver();
	 driver.manage().window().maximize();
 } 
 }
 }
 