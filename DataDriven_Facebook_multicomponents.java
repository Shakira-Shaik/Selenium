package testngpackage1;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
public class DataDriven_Facebook_multicomponents
{ 
@Test(dataProvider="inputs")
public void logintofacebook(String Uname,String Pwd)
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();//to maximize the browser
    driver.get("https://www.facebook.com");
   WebElement E1= driver.findElement(By.xpath("//input[@name='email']")); 
    E1.sendKeys(Uname);//performing action
   WebElement E2= driver.findElement(By.xpath("//input[@name='pass']")); 
   E2.sendKeys(Pwd);
   WebElement E3= driver.findElement(By.xpath("//button[@name='login']"));   
   E3.click();
   	}
@DataProvider(name="inputs")
public Object[][]method1()  
{
	Object[][]d1=new Object[4][2]; // 4 rows 2 columns 
	//1st row
	d1[0][0]="5773072861"; //invalid mobile no
	d1[0][1]="Fg%00289";//invalid password for mobile no
	//2nd row
	d1[1][0]="emailshakira@gmail.com";//invalid emailid
	d1[1][1]="Ab@00145"; //invalid password for emailid
	//3rd row
	d1[2][0]="9815462311"; //invalid mobile no
	d1[2][1]="Mb!00282";
	//4th row
	d1[3][0]="emailtosirkira@gmail.com";//invalid emailid
	d1[3][1]="NA!00286"; 
	
	return d1; 		
	
}
}
