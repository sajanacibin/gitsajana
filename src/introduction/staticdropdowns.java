package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriverService;

public class staticdropdowns {

	//WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select (staticdropdown);
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("INR");
		String text=dropdown.getFirstSelectedOption().getText();
		
		System.out.println(text);
		dropdown.selectByValue("USD");
		String text1=dropdown.getFirstSelectedOption().getText();
		System.out.println(text1);
		
driver.findElement(By.id("divpaxinfo")).click();

		
		int i=0;
		while(i<3)
		{
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		// driver.findElement(By.id("hrefDecAdt")).click();
		i++;
		
		}

		
		driver.findElement(By.id("btnclosepaxoption")).click();	
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                                             
		driver.close();

	}

}
