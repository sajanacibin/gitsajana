

package introduction;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	     String[] vegetables= {"Brocolli","Cauliflower"};
	 
	     addItems(driver,vegetables); 
	     
	     driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	     driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
	     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	     
	     driver.findElement(By.className("promoBtn")).click();
	   System.out.println(driver.findElement(By.className("promoInfo")).getText());
	   //  driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	     
	   
	
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		driver.close();
		

	}
public static void addItems(WebDriver driver,String[] vegetables)
{
	List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
	 List al = Arrays.asList(vegetables);
	 int j=0;
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 for(int i=0;i<products.size();i++)
			
	 {
		 
		String list=products.get(i).getText();
		String[] name=list.split("-");
		String name1=name[0].trim();
	
		if(al.contains(name1))
		
		{
			System.out.println(name1);
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	
	
		//if(list.contains("Cucumber"))
			//	{
			
		//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();//add to cart is dynamic.so when new items will add to list,we cant use this code.
			
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
		
			if(j==2)
			{
			
			break;
			}
				
		}
	 } 
	 
}



}
