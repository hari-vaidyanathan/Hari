package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Base;

public class CreateLeadPage extends Base{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewandEditLeadPage createlead() {
		
		System.out.println("the title is" +driver.getTitle());
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("HARI1");
		driver.findElementById("createLeadForm_lastName").sendKeys("VAIDYANATHAN");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown1 = new Select(source);
		dropdown1.selectByVisibleText("Employee");
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(marketingCampaign);
		dropdown2.selectByValue("9001");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown3 = new Select(industry);
		dropdown3.selectByIndex(17-2);
		
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown4 = new Select(ownership);
		dropdown4.selectByIndex(5);
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown5 = new Select(country);
		dropdown5.selectByVisibleText("India");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		return new ViewandEditLeadPage(driver);

	}

}
