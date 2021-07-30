package RealTime;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PraticeProjectObject;
import resources.Base;

public class PracticeProjectTest extends Base {
	
	public WebDriver driver;
	private final static Logger log= LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		log.info("Driver is initialized by PracticeProjectTest");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home Page");
		
	}
	
	
	@Test()
	public void practiceProject() throws IOException, InterruptedException {
		
		LandingPage lp= new LandingPage(driver);
		PraticeProjectObject po= lp.praticePage();
		po.getName().sendKeys("ahjshj");
		po.getEmail().sendKeys("jbhjabhj@gmail.com");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
