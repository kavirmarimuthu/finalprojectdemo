package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.AddEntitlements;
import pageClass.Login;

public class TC005AddEntitlements extends BaseClass

{
	@Test
	public void addentitlements() 
	{
	//Login lp = new Login(driver);
	//lp.loginpage("Admin","admin123");
	AddEntitlements em = new AddEntitlements(driver);
	em.addentitlements();
	WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'message success fadable')]"));
    String text=msg.getText();
    String actual ="Entitlements added to 3 employees(s)";
    Assert.assertEquals(actual, text);
	
	}
}
