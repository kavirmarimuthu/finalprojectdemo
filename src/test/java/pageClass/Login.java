package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;

public class Login extends BasePage {
	
	public Login(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='txtUsername']")
	public WebElement textusername;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement btnlogin;
	

	
	public void loginpage(String uname, String upass) 
	{
		
		textusername.sendKeys(uname);
		txtpassword.sendKeys(upass);
		btnlogin.click();
		
	}
	
	public String getcurrenturl () 
	{
		return driver.getCurrentUrl();
	}
	
}
