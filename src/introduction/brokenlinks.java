package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class brokenlinks {

	public static void main(String[] args, Object Assert) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> links=	driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		for(WebElement link:links)
		{
		
		System.out.println(link.getText());
		String url=link.getAttribute("href");
	HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
int code=conn.getResponseCode();
if(code>400)
{
	System.out.println("broken links with "+code);
	
}
		}

	}

}
