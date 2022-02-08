package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action_mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		WebElement move1=driver.findElement(By.id("twotabsearchtextbox"));
		
		a.moveToElement(move).contextClick().build().perform();
		w.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("books").build().perform();
		

	}

}