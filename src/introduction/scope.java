package introduction;

import java.util.Iterator;
import java.util.Set;

import javax.xml.transform.OutputKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//the code is  to get the count of links//
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//scope to footdriver
		WebElement footdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		//scope to columndriver
 	WebElement columndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
 	System.out.println(columndriver.findElements(By.tagName("a")).size());
		//click on each link on column and check page is opened
 	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
 		
 	{
 		String linktab=Keys.chord(Keys.COMMAND,Keys.ENTER);
 		
 		
 		columndriver.findElements(By.tagName("a")).get(i).sendKeys(linktab);
 		
 	}
 	Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
 		while(it.hasNext())
 		{
 		
 			
 		driver.switchTo().window(it.next());
 		System.out.println(driver.getTitle());
 			
 		}
 	
	}

}
