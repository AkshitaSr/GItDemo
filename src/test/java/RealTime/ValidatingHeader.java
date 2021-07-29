package RealTime;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

import pageObjects.LandingPage;
import resources.Base;


public class ValidatingHeader extends Base{
	
		public WebDriver driver;
		
		private static Logger log= LogManager.getLogger(HomePage.class.getName());
		
		@BeforeTest
		public void initialize() throws IOException {
			
			driver=initializeDriver();
			log.info("Driver is initialized for Validation ");
			driver.get(prop.getProperty("url"));
			log.info("Navigate to Home Page");
			
		}
		

			
			@Test()
			public void validateNavBar() throws IOException, InterruptedException {
				
				LandingPage lp= new LandingPage(driver);
				Assert.assertTrue(lp.getHeader().isDisplayed());
				log.info("Successfully validated header");
			
			}
		
			@AfterTest
			public void tearDown() {
				driver.close();
			}
			

	}



