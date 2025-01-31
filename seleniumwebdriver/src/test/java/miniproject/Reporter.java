package miniproject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
public class Reporter {
	protected static ExtentReports extent;
	@BeforeSuite
	public void setupExtent() {
		extent=UtilityReport.createInstance("reports/TestReport.html");
	}
//	@BeforeTest
//	public void setup() {
//		test=extent.createTest(getClass().getSimpleName(),"Test description for "+getClass().getSimpleName());
//		test.info("Test started");
//		
//	}
	@AfterSuite
	public void tearDownExtent() {
		if(extent!=null)
		extent.flush();
	}
}
