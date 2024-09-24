package testngpackage1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelSheet_Amazon_IleegalStateException 
{
	@Test 
    public void Login() throws EncryptedDocumentException, IOException
	{
	FileInputStream f1=new FileInputStream("H:\\Users\\shaki\\eclipse-workspace\\SeliniumProject\\DataFetching\\ShakeeraSheet.xlsx");
    Workbook w1 = WorkbookFactory.create(f1);
    String UN= w1.getSheet("Login_details").getRow(2).getCell(0).getStringCellValue();
    System.out.println(UN);
    String Pwd= w1.getSheet("Login_details").getRow(2).getCell(1).getStringCellValue();
    //passed the numeric value for the password in the excelsheet thats'y we got exception
    System.out.println(Pwd);
    ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();//to maximize the browser
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    WebElement E1= driver.findElement(By.name("email"));
    E1.sendKeys(UN); 
    WebElement E2= driver.findElement(By.id("continue")); 
    E2.click();
    WebElement E3= driver.findElement(By.name("password"));
    E3.sendKeys(Pwd); 
    WebElement Sign_in= driver.findElement(By.id("signInSubmit"));     
    Sign_in.click();	 
}
}
