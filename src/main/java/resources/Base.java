package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	
	//method to intialize driver
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis= new FileInputStream("/Users/AKshita/Desktop/Automation/Project/E2EProject/src/main/java/resources/data.propertise");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/AKshita/Downloads/chromedriver");
		    driver = new ChromeDriver();
			
		}
		
		if(browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "/Users/AKshita/Downloads/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshoot(String testMethodName, WebDriver driver) throws IOException {
		
		String filePath="/Users/AKshita/Desktop/Automation/Project/E2EProject"+"/reports/"+testMethodName+".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filePath));
		return filePath;
	}


}
