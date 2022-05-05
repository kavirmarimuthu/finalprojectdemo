package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class WelcomeSupport extends BasePage 
{
		public WelcomeSupport(WebDriver driver) 
		{
			super(driver);
		}
		
		@FindBy(xpath="//a[@id='welcome']")
		public WebElement lin_welcome;
		
		@FindBy(xpath="//a[contains(text(),'Support')]")
		public WebElement lin_support;
		
		public void support()
		{
			lin_welcome.click();
			lin_support.click();
		}
		
		
		public String getcurrenturl () 
		{
			return driver.getCurrentUrl();
		}
		
}



