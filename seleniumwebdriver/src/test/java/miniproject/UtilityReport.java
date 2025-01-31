
package miniproject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class UtilityReport {
	private static ExtentReports extent;
	public static ExtentReports createInstance(String filePath) {
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(filePath);
		sparkReporter.config().setReportName("Autmation Report");
		sparkReporter.config().setDocumentTitle("Test Report");
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Host Name", "Localhost");
		extent.setSystemInfo("Environement", "QA");
		extent.setSystemInfo("Tester Name", "suguna");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser", "Chrome/Firefox");
		return extent;
	}
}
