package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getExtentReport() {
		
		String path= "/Users/AKshita/Desktop/Automation/Project/E2EProject"+"/reports/index.html";
		ExtentSparkReporter reporter=  new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Akshita");
		return extent;
		
	}

}
