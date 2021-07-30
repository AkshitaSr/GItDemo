package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PraticeProjectObject {
	
	public WebDriver driver;
	
    public PraticeProjectObject(WebDriver driver) {
		
		this.driver=driver;
	}

    By name=By.id("name");
	By email= By.id("email");
	

	public WebElement getName() {
		return driver.findElement(name);
		
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
}
