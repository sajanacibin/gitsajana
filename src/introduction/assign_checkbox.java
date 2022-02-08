package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign_checkbox {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption1")).click();
		String text=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		WebElement options=driver.findElement(By.id("dropdown-class-example"));
		
		Select optionobject=new Select(options);
		optionobject.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("alertbtn")).click();
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	String verifytext=	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
		System.out.println(verifytext);
	String text1=verifytext.split(",")[0].split(" ")[1];
	System.out.println(text1);
		if(verifytext.contains(text))
			
		{
			
			System.out.println("excution correct");
			
		}
		else
		{

			System.out.println("excution wrong");
		}


	}

}
