package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClass.ApplyLeave;
import pageClass.Login;



public class TC003ApplyLeave extends BaseClass
{
	@Test
	public void applyleave() 
	{
		//Login hp = new Login(driver);
		//hp.loginpage("Admin","admin123");
		test.log(LogStatus.INFO,"Applying Leave");
		ApplyLeave al= new ApplyLeave(driver);
		al.applyleaveform();
	
	    String expected =al.assert_actual();
	    String actual ="Apply Leave";
		Assert.assertEquals(actual,expected);
	}
	
}
