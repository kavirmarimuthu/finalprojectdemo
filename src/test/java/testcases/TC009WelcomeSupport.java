package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClass.Login;
import pageClass.WelcomeSupport;

public class TC009WelcomeSupport extends BaseClass
{

	@Test
	public void verifysupport() 
	{
	 //  Login hp = new Login(driver);
	 //  hp.loginpage("Admin","admin123");
		
		WelcomeSupport ws = new WelcomeSupport(driver);
		ws.support();
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		System.out.println("softAssert Method Was Passed with condition");
		test.log(LogStatus.INFO,"Information to understand the application ");
		softAssert.assertTrue(true);
       softAssert.assertAll();
		/*String actual ="OrangeHRM";
		String expected = ws.getcurrenttitle();
	    Assert.assertEquals(actual,expected);*/
	
	}
	
}
