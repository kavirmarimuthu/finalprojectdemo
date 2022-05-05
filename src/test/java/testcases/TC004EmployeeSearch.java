package testcases;



import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.EmployeeSearch;
import pageClass.Login;

public class TC004EmployeeSearch extends BaseClass
{
	@Test
	public void searchemployee() 
	{
		Login lp = new Login(driver);
		lp.loginpage("Admin","admin123");
		
		EmployeeSearch es = new EmployeeSearch(driver);
		es.searchname();
	}
}
