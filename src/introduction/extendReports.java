package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendReports {
	static ExtentReports extent;





public static void main(String[] args){

	extent=new ExtentReports();//generate the html report in the pathe specified
	String path=System.getProperty("user.dir");
//	extent =new ExtentReports(path+"test-output/index1.html");
	ExtentSparkReporter reporter= new ExtentSparkReporter(path+"/test-output/index1.html");
	 reporter.config().setReportName("automation report");
	 reporter.config().setDocumentTitle("result");
	 
	
 
   //  reporter.config().setTestViewChartLocation(ChartLocation.TOP);
     reporter.config().setTheme(Theme.DARK);
     reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	 
	 try {
		extent.attachReporter(reporter);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
extent.setSystemInfo("author", "johan");
extent.setSystemInfo("os", "os version");



	ExtentTest object=extent.createTest("Extend reports");
	System.setProperty("webdriver.chrome.driver", "/Users/JP/Desktop/chromedriver");
	WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com");	
System.out.println(driver.getTitle());
object.log(Status.PASS, "passed");//log method logs the status into generated report

driver.close();
extent.flush();//create new report bt removing old data

}
}

