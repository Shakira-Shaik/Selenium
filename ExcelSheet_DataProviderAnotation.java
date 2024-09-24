package testngpackage1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheet_DataProviderAnotation 
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
	   Assert.assertEquals(driver.getTitle(), "Facebook","Sorry");
	   	}
	@DataProvider(name="inputs")
	public Object[][]method1() throws EncryptedDocumentException, IOException  
	{
		FileInputStream f1=new FileInputStream("H:\\Users\\shaki\\eclipse-workspace\\SeliniumProject\\DataFetching\\ShakeeraSheet.xlsx");
    Workbook w1 = WorkbookFactory.create(f1);
    String UN=w1.getSheet("Login_details").getRow(1).getCell(0).getStringCellValue();
   // System.out.println(UN); 
    String Pwd=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
    //System.out.println(Pwd);
   
    String UN1=w1.getSheet("Login_details").getRow(1).getCell(0).getStringCellValue();
     String Pwd1=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
     
     
		Object[][]d1=new Object[2][2]; // 2rows 2 columns 
		//1st row
		d1[0][0]=UN; 
		d1[0][1]=Pwd;
		//2nd row
		d1[1][0]= UN1;
		d1[1][1]=Pwd1; 
		 
		return d1; 		
		
	}
	}

