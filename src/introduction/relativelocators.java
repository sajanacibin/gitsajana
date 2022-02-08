package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
		String  mail=driver.findElement(with(By.tagName("Label")).above(email)).getText();
	    System.out.println(mail);
	    WebElement dateofbirth=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();

WebElement text=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
driver.findElement(with(By.tagName("input")).toLeftOf(text)).click();
WebElement radio=driver.findElement(By.id("inlineRadio1"));
System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
	}

}