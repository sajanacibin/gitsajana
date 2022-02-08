package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	
	public static void main(String[] args)
	{
		

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.className("datepicker-switch")).getText().contains("April"))
				{
			System.out.println(driver.findElement(By.className("datepicker-switch")).getText());
			driver.findElement(By.className("next")).click();
				}
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		for(int i=1;i<count;i++)
		{
		if(dates.get(i).getText().equalsIgnoreCase("27"))
		{
			dates.get(i).click();
			break;
			
		}
		
		}
	
	}
}
