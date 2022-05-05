package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class WelcomeAbout extends BasePage 
{
	
	public WelcomeAbout(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//a[@id='welcome']")
	public WebElement lin_welcome;
	
	
	@FindBy(xpath="//a[@id='aboutDisplayLink']")
	public WebElement lin_display;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul[1]/li[1]/div[1]/div[1]/a[1]")
	public WebElement lin_popup;
	
	
	
	
	public void about()
	{
		lin_welcome.click();
		lin_display.click();
		lin_popup.click();
		
	}
	
	public String getcurrenturl () 
	{
		return driver.getTitle();
	}
}
