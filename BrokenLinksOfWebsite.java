package seleniumpackage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinksOfWebsite {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/");
		List<WebElement>li =driver.findElements(By.tagName("a"));
		System.out.println(li.size()); 
		 for(int i=0;i<li.size();i++) 
		 {
			WebElement E1=li.get(i);
			String url=E1.getAttribute("href");
			System.out.println(url);
			verify_the_link(url);  // calling method in the main
		    } 
	} 
    static void verify_the_link(String url) throws IOException
    {
    	try {
    	URL u1= new URL(url); //created an oject for the URL class and pass the parameter as url(link)
        HttpURLConnection u2=   (HttpURLConnection) u1.openConnection(); 
        if(u2.getResponseCode()==200)
        { 
          System.out.println("Valid Link "+u2.getResponseMessage()+" "+u2.getResponseCode());
        }
        else
        {
        	System.out.println("Invalid link "+u2.getResponseMessage()+" "+u2.getResponseCode());
        }
    	}	
    	catch(MalformedURLException m1)
    	{
    		System.out.println("Handled it");
    	}
    
    }

}


