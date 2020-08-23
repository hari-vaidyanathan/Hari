package Testcase;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages.LoginPage;

public class LoginandLogout extends Base {
	
	@Test
	public void runloginandlogout() {
	
		LoginPage lp = new LoginPage(driver);
		
		lp.username()
		.password()
		.clickloginbutton()
		.VerifyHomePage()
		.clicklogoutbutton();
		

	}

}
