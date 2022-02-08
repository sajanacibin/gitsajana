package introduction;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {
	

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a.blinkingText")).click();
        Set<String> windowid=	driver.getWindowHandles();
	
    Iterator<String>ids=	windowid.iterator();
	String parentId=ids.next();
	String childId=ids.next();
	//System.out.println(childId);
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	
	String Username=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	System.out.println(Username);
	
	driver.switchTo().window(parentId);
	
	driver.findElement(By.id("username")).sendKeys(Username);
	
	
	
	
	}

}
