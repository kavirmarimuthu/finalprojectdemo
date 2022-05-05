package pageClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class Window extends BasePage {
	
	public Window(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
	public WebElement link_icon;
	
	@FindBy(xpath=" //h3[contains(text(),'Peace of mind is just a few clicks away!')]")
	public WebElement linktxt;
	
	public void logo()
	{
		link_icon.click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) 
        {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
                {
                driver.switchTo().window(ChildWindow);
                       
              String actual = linktxt.getText();
              String expected ="Peace of mind is just a few clicks away!";
		      Assert.assertEquals(actual,expected);
                }
        }
        driver.switchTo().window(mainWindowHandle);
	}
}