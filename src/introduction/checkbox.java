package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
         driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        boolean value=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
        System.out.println(value);
        
        
        if(value==true)
        
        {
        	System.out.println("slected");
        	
        }

    	try {
    		Thread.sleep(2000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
        driver.close();

	}

}
