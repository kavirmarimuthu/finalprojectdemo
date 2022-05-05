package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Logout extends BasePage {
	
	public Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@id='welcome']")
	public WebElement lin_welcome;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	public WebElement txt_logout;
	
	public void logout()
	{
		lin_welcome.click();
		txt_logout.click();
	}
	
	public String assert_actual()
	{
		
		return driver.getCurrentUrl();
		
	}
}
