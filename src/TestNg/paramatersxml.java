package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramatersxml {

	//we can give parameter in the suite level so applicable to all testcases in the entire suite
	//or  at the test folder level also ,give the parameter but applicable only to the classes of that folder
	@Parameters({"url"})
	@Test(priority=1)
	public void test1(String URL)
	{
		
		System.out.println("test1");
		
		System.out.println(URL);
		
	}
	@Test(priority=2)
	public void test2()
	{
		
		System.out.println("test2");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("test3");
		
	}
	
}
