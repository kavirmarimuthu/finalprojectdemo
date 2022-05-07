package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClass.WelcomeAbout;
import pageClass.Login;

public class TC008WelcomeAbout extends BaseClass 
{
	@Test
	public void verifyabout() 
	{
	   //Login hp = new Login(driver);
	  // hp.loginpage("Admin","admin123");
		WelcomeAbout ab = new WelcomeAbout(driver);
		ab.about();
		test.log(LogStatus.INFO,"Information about current employee");
		test.log(LogStatus.INFO,"Information about version ");
		test.log(LogStatus.INFO,"Information Employee terminated ");
		String actual ="OrangeHRM";
		String expected =ab.getcurrenturl();
	    Assert.assertEquals(actual,expected);
	}

}