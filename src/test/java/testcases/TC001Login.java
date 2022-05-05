package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClass.Login;

public class TC001Login extends BaseClass {
	
	SoftAssert asrt;
	
	@Test
	public void verifyLogin() 
	{
		
		Login hp = new Login(driver);
		hp.loginpage("Admin","admin123");
		app_logs.debug("Clicked on login button");
		asrt = new SoftAssert();
		String actual= "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String expected = hp.getcurrenturl();
		asrt.assertEquals(actual,expected);
		app_logs.debug("Login in Sccessfully");
		
	}

}
