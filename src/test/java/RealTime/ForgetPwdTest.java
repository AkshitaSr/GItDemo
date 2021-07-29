package RealTime;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ForgetPwd;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ForgetPwdTest extends Base {

	public WebDriver driver;
	private final static Logger log= LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		
		log.trace("<<----Trace---->>>");
		log.debug("<<----Debug---->>>");
		driver=initializeDriver();
		log.info("Driver is initialized in Forget Pwd");

		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home Page");
		log.trace("Trace---->>>");
		log.debug("Debug---->>>");
	}
	
	@Test
	public void getForgetPassword() throws InterruptedException {
		LandingPage lp= new LandingPage(driver);
		LoginPage l=lp.pageLogin();
		ForgetPwd fp= l.getforgotPassword();
		fp.getForgetemail().sendKeys("fytdfjyt");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
