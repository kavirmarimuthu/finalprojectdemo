package datadriven_testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.Login;



public class TC001_LoginDDT extends BaseClass {
	
	

	@Test(dataProviderClass = utilities.Utilities.class, dataProvider = "dp")
	
	public void verifyLogin(String username, String userpass) 
	{
		
		Login hp = new Login(driver);
		hp.loginpage(username,userpass);
		String expectedTitle = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualTitle=driver.getCurrentUrl();
		Assert.assertEquals(actualTitle, expectedTitle);
	
		
	}

}
