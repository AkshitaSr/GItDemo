package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email= By.id("user_email");
	By password = By.id("user_password");
	By login= By.cssSelector("input[type='submit']");
	By forgotPassword= By.cssSelector("a[class='link-below-button']");
	
	public LoginPage(WebDriver driver) {
	 this.driver=driver;	
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public ForgetPwd getforgotPassword() throws InterruptedException {
		 driver.findElement(forgotPassword).click();
		 Thread.sleep(2000);
		 return new ForgetPwd(driver);
		  
		 
	}
}
