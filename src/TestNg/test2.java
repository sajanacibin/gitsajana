package TestNg;

import org.testng.annotations.Test;

public class test2 {

	@Test(timeOut=4000)
	public void webcarloan()
	{  
		
		System.out.println("webpersonalloan");
		
	}
	
	@Test(dependsOnMethods={"webcarloan"})
	public void mobilecarloan()
	{
		
		
		System.out.println("mobilecarloan");
	}
	@Test(enabled=false)
	public void restapicarloan()
	{
		
		
		System.out.println("restapicarloan");
	}
}
