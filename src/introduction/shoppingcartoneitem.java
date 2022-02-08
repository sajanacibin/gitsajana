package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingcartoneitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		 List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 for(WebElement product:products)
			 
		 {
			 String item=product.getText();
			 if(item.contains("Cucumber"))
				 
				 
			 {
				 System.out.println(item);
			 }
		 }
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.close();
		
		 
	}

}
