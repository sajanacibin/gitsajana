package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	

	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	
	//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']//a[@value='MAA']
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

/* alternative method to diplay the chennai :parent xpath and child xpath formation */

	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();

	}

}
