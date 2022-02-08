package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTABLEASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		ListAllItems(driver);
		//SearchItems(driver);
		
		GetpriceItems(driver);
		//driver.findElement(By.xpath("//ul[@aria-label='Pagination']/li[4]/a")).click();
		
		//List<WebElement> items=driver.findElements(By.xpath("//tr/td[1]"));
		//List<String> itemslist=items.stream().map(s->s.getText()).collect(Collectors.toList());
	//	itemslist.stream().forEach(s->System.out.println(s));
		
		
	}
	
	public  static void ListAllItems(WebDriver driver)

	{
        driver.findElement(By.xpath("//ul[@aria-label='Pagination']/li[4]/a")).click();
		
		List<WebElement> items=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> itemslist=items.stream().map(s->s.getText()).collect(Collectors.toList());
		itemslist.stream().forEach(s->System.out.println(s));
		
		
		
	}
	public static void SearchItems(WebDriver driver)
	{
		
		driver.findElement(By.id("search-field")).sendKeys("pineapple");
		List<WebElement>searchitems=driver.findElements(By.xpath("//tr/td[1]"));
	List<WebElement> filteredItems=searchitems.stream().filter(s->s.getText().contains("Pineapple")).collect(Collectors.toList());
	if(searchitems.size()==filteredItems.size())
	{
		
	System.out.println("corect");
	}
	    
	}
public static void GetpriceItems(WebDriver driver)
{
	List<String> price1;
	do
	{
	List<WebElement>allitems=driver.findElements(By.xpath("//tr/td[1]"));
	 price1=allitems.stream().filter(s->s.getText().contains("Cherry")).map(s->getprice(s)).collect(Collectors.toList());
	price1.stream().forEach(s->System.out.println(s));
	
	if(price1.size()<1)
	{
		driver.findElement(By.cssSelector("a[aria-label='Next'")).click();
	}
	}while(price1.size()<1);
}

public static String getprice(WebElement s)
{
	
	String priceitem=s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceitem;
	
}
}
