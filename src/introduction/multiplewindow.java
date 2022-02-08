package introduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
	 Set<String>   ids= driver.getWindowHandles();
	Iterator<String> windowid= ids.iterator();
	String parentid=windowid.next();
	String childid=windowid.next();
	driver.switchTo().window(childid);
	driver.get("https://rahulshettyacademy.com/");
	
String text=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
driver.switchTo().window(parentid);
System.out.println(text);
WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
driver.findElement(By.cssSelector("input[name='name']")).sendKeys(text);
//taking webelemnt screen shot
File file=name.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(file,new File("/Users/JP/Pictures/Selenium/log.png"));

//taking height and width of webelement

int height=name.getRect().getDimension().getHeight();
int width=name.getRect().getDimension().getWidth();

System.out.println(height);
System.out.println(width);
	}

}


