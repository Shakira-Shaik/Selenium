package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_GrotechRegistrition {
@Test(dataProvider="data")
public void RegistrationForm(String Fname,String Lname,String email,String Pwd,String Padd,String Ptadd,String Pin)
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();//to maximize the browser
    driver.get("https://grotechminds.com/registration/");
    WebElement First_Name= driver.findElement(By.name("fname"));
    First_Name.sendKeys(Fname);
	   WebElement LastName= driver.findElement(By.name("lname"));
	   LastName.sendKeys(Lname);
    WebElement Email= driver.findElement(By.name("email"));
	   Email.sendKeys(email);
	   WebElement Password= driver.findElement(By.name("password"));
	   Password.sendKeys(Pwd);
	   WebElement gender= driver.findElement(By.id("Female"));
	   gender.click();
	   WebElement E1= driver.findElement(By.id("Skills"));
	   Select S1=new Select(E1);
	     S1.selectByIndex(1);
	     WebElement E2= driver.findElement(By.id("Country"));
		   Select S2=new Select(E2);
		     S2.selectByVisibleText("India");
  WebElement PresentAddress= driver.findElement(By.name("Present-Address"));
	   PresentAddress.sendKeys(Padd);
	   WebElement PermenentAddress= driver.findElement(By.name("Permanent-Address"));
	   PermenentAddress.sendKeys(Ptadd);
	   WebElement Pincode= driver.findElement(By.name("Pincode"));
	   Pincode.sendKeys(Pin);
	 /* WebElement E3= driver.findElement(By.id("Relegion"));
	   Select S3=new Select(E3);
	     S3.selectByValue("Muslim"); */
	   WebElement Check= driver.findElement(By.id("relocate"));
	   Check.click();
	   WebElement Submit= driver.findElement(By.name("Submit"));
	   Submit.click();
	    	
}
@DataProvider(name="data")
public Object[][]method1()
{
	Object[][]d1=new Object[5][7]; // 5 rows 7 columns
	//1st row
	d1[0][0]="Shakira"; //fname
	d1[0][1]="Shaik";  //Lname
	d1[0][2]="emailtoshakira@gmail.com"; //email
	d1[0][3]="Abcpwd@1013"; //pwd
	d1[0][4]="Scarborough"; //Padd
	d1[0][5]="Bradford";  //Ptadd
	d1[0][6]="M1P0B6"; //Pin
	//2nd row
	d1[1][0]="Ghouse"; //fname
	d1[1][1]="Mohammad";  //Lname
	d1[1][2]="emailtoghouse@gmail.com"; //email
	d1[1][3]="Abcpwd@1013"; //pwd
	d1[1][4]="Scarborough"; //Padd
	d1[1][5]="Bradford";  //Ptadd
	d1[1][6]="M1P0B6"; //Pin
	// 3rd row
	d1[2][0]="Swati"; //fname
	d1[2][1]="Lahane";  //Lname
	d1[2][2]="SwathiLahane@gmail.com"; //email
	d1[2][3]="Abcpwd@1013"; //pwd
	d1[2][4]="Maharastra"; //Padd
	d1[2][5]="pune";  //Ptadd
	d1[2][6]="M130M6"; //Pin
	//4th row
	d1[3][0]="Sanjia"; //fname
	d1[3][1]="Amreen";  //Lname
	d1[3][2]="SanjiaAmreen@gmail.com"; //email
	d1[3][3]="Abcpwd@1013"; //pwd
	d1[3][4]="chicago"; //Padd
	d1[3][5]="Newyork";  //Ptadd
	d1[3][6]="L3Z0M6"; //Pin
	//5th row
	d1[4][0]="Rashmi"; //fname
	d1[4][1]="Trivedi";  //Lname
	d1[4][2]="Rashmitrivedi@gmail.com"; //email
	d1[4][3]="Abcpwd@1013"; //pwd
	d1[4][4]="Bangalore"; //Padd
	d1[4][5]="Pune";  //Ptadd
	d1[4][6]="M1P116"; //Pin
	return d1;
}

}
