package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn_frame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top'")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle'")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		
	}
	
}
