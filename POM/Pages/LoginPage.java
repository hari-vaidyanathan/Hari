package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;

public class LoginPage extends Base {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver = driver;
	}

	public LoginPage username() {
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		return this;

	}

	public LoginPage password() {
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		return this;

	}

public HomePage clickloginbutton() {
	
	driver.findElementByClassName("decorativeSubmit").click();
	return new HomePage(driver);

}

}
