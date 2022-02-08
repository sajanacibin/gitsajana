package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign_window_handling {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows'")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new'")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it =ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
		
		
				
		
	}

}
