package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;

public class ViewandEditLeadPage extends Base{

	public ViewandEditLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public ViewandEditLeadPage viewlead() {
		System.out.println("the title is" +driver.getTitle());
		return this;

	}
	
  public ViewandEditLeadPage editlead() {
	  
	  driver.findElementByXPath("//a[text()='Edit']").click();
	  driver.findElementById("updateLeadForm_companyName").clear();
	  driver.findElementById("updateLeadForm_companyName").sendKeys("Testleafabc");
	  driver.findElementById("updateLeadForm_importantNote").clear();
	  driver.findElementById("updateLeadForm_importantNote").sendKeys("updated companyname");
	  driver.findElementByXPath("//input[@value='Update']").click();
		   
	  String COMPANY = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  System.out.println("The updated company name is" +COMPANY);
    
	  return this;
	  
}
}
