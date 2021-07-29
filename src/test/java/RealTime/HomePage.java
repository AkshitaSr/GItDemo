package RealTime;

import org.testng.annotations.Test;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	private final static Logger log= LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		log.info("Driver is initialized of Home Page");
	}
	
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String Username,String Password) throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home Page");
		
		LandingPage lp= new LandingPage(driver);
		LoginPage l=lp.pageLogin();
		log.info("Navigate to Landing Page");
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		l.getLogin().click();
		log.info("Testcase run successfully");
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="nonrestricted@qw.com";
		data[0][1]="1234";
		
		data[1][0]="restricted@qw.com";
		data[1][1]="5678";
		
		return data;
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
