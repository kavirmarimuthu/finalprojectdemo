package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClass.Login;
import pageClass.Window;

public class TC006Window extends BaseClass

{
	@Test
	public void windowhandler() 
	{
	/*Login hp = new Login(driver);
	hp.loginpage("Admin","admin123");	*/
	test.log(LogStatus.INFO,"Windows Handle Parent and a child ");
	Window wd = new Window(driver);	
	wd.logo();
	}
}
