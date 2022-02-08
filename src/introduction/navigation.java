package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://the-internet.herokuapp.com/");
	driver.navigate().to("http://the-internet.herokuapp.com/windows/new");
	driver.navigate().back();
	driver.navigate().forward();
	System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	driver.navigate().refresh();
	driver.navigate().back();
	System.out.println(driver.findElement(By.className("heading")).getText());
	
	
	
	}

}
