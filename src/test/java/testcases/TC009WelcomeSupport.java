package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.Login;
import pageClass.WelcomeSupport;

public class TC009WelcomeSupport extends BaseClass
{

	@Test
	public void verifysupport() 
	{
	  // Login hp = new Login(driver);
	  //  hp.loginpage("Admin","admin123");
		WelcomeSupport ws = new WelcomeSupport(driver);
		ws.support();
		String actual ="https://opensource-demo.orangehrmlive.com/index.php/support/index";
		String expected = ws.getcurrenturl();
	    Assert.assertEquals(actual,expected);
	
	}
	
}