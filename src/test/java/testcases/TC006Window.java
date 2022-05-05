package testcases;

import org.testng.annotations.Test;

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
	Window wd = new Window(driver);	
	wd.logo();
	}
}
