package Testcase;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages.LoginPage;

public class Loginandverify extends Base {
	
	@Test
	public void runloginandlogout() {
	
		LoginPage lp = new LoginPage(driver);
		
		lp.username()
		.password()
		.clickloginbutton()
		.VerifyHomePage()
		.clickcrmsfa()
		.createlead()
		.viewlead()
		.editlead();
		

	}

}
