package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;

public class HomePage extends Base {
	
	public HomePage(ChromeDriver driver) {

		this.driver = driver;
	}

	public HomePage VerifyHomePage() {
		
		String expectedtitle=driver.getTitle();
		System.out.println("the title is" + expectedtitle);
		return this;

	}
	
	public CreateLeadPage clickcrmsfa() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new CreateLeadPage(driver);

	}
	
	public LoginPage clicklogoutbutton() {
		
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver);

	}


}
