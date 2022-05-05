package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.EmployeeEntitlements;
import pageClass.Login;

public class TC007EmployeeEntitlements extends BaseClass
{
	@Test
	public void searchemployee()
	{
		//Login hp = new Login(driver);
		//hp.loginpage("Admin","admin123");
		EmployeeEntitlements ee = new EmployeeEntitlements(driver);
		ee.addentitlements();
		String actual = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveEntitlements/reset/1";
		String expected =driver.getCurrentUrl();
		Assert.assertEquals(actual,expected);
	}
	
	
	
}
