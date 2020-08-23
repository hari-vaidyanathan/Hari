package BaseClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	
   @BeforeMethod
	public void precondition() {
	
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		

}
   @AfterMethod
   public void postcondition() {
 	 driver.close();

 }
  

}
