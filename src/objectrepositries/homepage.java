package objectrepositries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
public homepage (WebDriver driver)
{
	this .driver=driver;
	
	
}

By email=By.id("login1");
By password=By.id("password");
By button=By.className("password");
public WebElement username()
{
	
	
	return driver.findElement(email);
}
public WebElement Password()

{
	return driver.findElement(password);
	
}
public WebElement ButtonClick()

{
	
	return driver.findElement(button);
}
}
