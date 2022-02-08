package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
	
	@AfterTest
	public void lastexecute()
	
	{

		System.out.println("last execution");
		
	}
	@BeforeTest
	public void firstexecute()
	
	
	{
		

		System.out.println("firtexecution");
		
	}
	@Test(groups= {"smoke"})
	public void Webpersonalloan()
	{
		
		System.out.println("webpersonalloan");
		
	}
	@AfterMethod
	
	public void aftermethod()
	{
		
		System.out.println("Aftermethod execution");
		
		
		
	}
	
	@Test
	
	public void mobilepersonalloan()
	{
		
		
		System.out.println("mobilepersonalloan");
	}
	@Test
	public void restapipersonalloan()
	{
		
		
		System.out.println("restapipersonalloan");
	}

}
