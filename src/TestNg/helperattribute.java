package TestNg;

import org.testng.annotations.Test;

public class helperattribute {

	@Test(priority=1)
	public void webcar()
	{  
		
		System.out.println("webpersonalloan");
		
	}
	
	@Test(groups= {"smoke"})
	public void mobilecar()
	{
		
		
		System.out.println("mobilecarloan");
	}
	@Test(priority=1)
	public void restapicar()
	{
		
		
		System.out.println("restapicarloan");
	}
	
}
