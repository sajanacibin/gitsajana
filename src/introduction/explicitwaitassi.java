package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitassi {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,20);
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
			
		 System.out.println(driver.findElement(By.id("results")).getText());
		 
	
				 
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
