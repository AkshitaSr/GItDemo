package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
    public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By practicep=By.cssSelector("a[href*='practice-project']");
	By title= By.cssSelector("div[class='pull-left']");
	By header= By.cssSelector("div[class='header-upper']");

	public LoginPage pageLogin() {
		driver.findElement(signin).click();
		LoginPage l= new LoginPage(driver);
		return l; 
	}
	
	public PraticeProjectObject praticePage() {
		driver.findElement(practicep).click();
		PraticeProjectObject ppo= new PraticeProjectObject(driver);
		return ppo; 
	}
	
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
