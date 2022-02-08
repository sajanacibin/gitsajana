package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args){
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/JP/Desktop/chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("JOHAN");
driver.findElement(By.name("inputPassword")).sendKeys("paul");
driver.findElement(By.className("signInBtn")).click();
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.id("chkboxTwo")).click();

String text=driver.findElement(By.cssSelector("p.error")).getText();
System.out.println(text);

driver.findElement(By.linkText("Forgot your password?")).click();


 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("cibin");
 
 driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("hgfjuhg");
 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
 driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("helo");
 driver.findElement(By.xpath("//form/input[3]")).sendKeys("234567");
 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
 String text1=driver.findElement(By.cssSelector("form p")).getText();
 
 System.out.println(text1);
 
 
 
 
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

driver.close();
	
	}

}
