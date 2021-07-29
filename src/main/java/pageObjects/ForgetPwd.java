package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPwd {
	
	public WebDriver driver;
	
	By forgetemail= By.cssSelector("input[placeholder='name@example.com']");
	By inst= By.cssSelector("input[type='submit']");
	

	public ForgetPwd(WebDriver driver) {
	 this.driver=driver;	
	}

	public WebElement getForgetemail() {
		return driver.findElement(forgetemail);
	}
	
	public WebElement getinst() {
		return driver.findElement(inst);
	}

}
