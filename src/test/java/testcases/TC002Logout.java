package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.Login;
import pageClass.Logout;

public class TC002Logout extends BaseClass 
{
	
	@Test
	public void verifyLogout() 
	{
	  //  Login hp = new Login(driver);
		//hp.loginpage("Admin","admin123");
		Logout lg = new Logout(driver);
		lg.logout();
		String actual ="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		String expected = lg.assert_actual();
		Assert.assertEquals(actual, expected);
	}
	
	
}

