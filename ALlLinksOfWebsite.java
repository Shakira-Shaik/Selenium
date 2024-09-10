package seleniumpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALlLinksOfWebsite {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		List<WebElement>li =driver.findElements(By.tagName("a"));//findelements is for all the links
		System.out.println(li.size()); //list interface method:gives total no of links presentin google
		 for(int i=0;i<li.size();i++) 
		 {
			WebElement E1=li.get(i);//get(index) method is used to get the links based on index
			String url=E1.getAttribute("href");//getAttribute gives value of attribute href(href wiil be  present for all links)
			String text =E1.getText();//gives the text msg for the link
			System.out.println(url);
		    System.out.println(text); 
		 } 
		 
	} 

}
