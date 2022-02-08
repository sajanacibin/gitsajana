package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTABLESORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.close();
		
		//driver.findElement(By.className("sort-descending")).click();
		List<WebElement> elementslist=driver.findElements(By.xpath("//tr/td[1]"));
		List<String>  originallist=elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>  newlist=originallist.stream().sorted().collect(Collectors.toList());
		if(newlist.equals(originallist))
		{
			
			System.out.println("matching");
		}
		else
		{
			System.out.println(" not matching");
		}
	}

}
