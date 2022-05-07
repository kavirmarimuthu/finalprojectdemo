package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

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
		test.log(LogStatus.INFO,"Displays employee leave type add along with period");
		String actual = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveEntitlements/reset/1";
		String expected =driver.getCurrentUrl();
		Assert.assertEquals(actual,expected);
	}
	
	
	
}
