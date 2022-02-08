package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositries.homepage;

public class testcase {
	@Test
	
	public void tests()
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		homepage hp=new homepage(driver);
		hp.username().sendKeys("hello");
		hp.Password().sendKeys("password");
		
		hp.ButtonClick().click();
		System.out.println("changes made");
		
		System.out.println("changes are made");
		System.out.println("changes are done");
		
	}

}
