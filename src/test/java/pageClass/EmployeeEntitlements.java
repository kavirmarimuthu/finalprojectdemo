package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class EmployeeEntitlements extends BasePage
{
	public EmployeeEntitlements(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	public WebElement drp_menu;
	
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']")
	public WebElement drp_leave;
	
	@FindBy(xpath=" //a[@id='menu_leave_viewLeaveEntitlements']")
	public WebElement drp_sub;
	
	@FindBy(xpath="//input[@id='entitlements_employee_empName']")
	public WebElement drp_empname;
	
   @FindBy(xpath="//select[@id='entitlements_leave_type']")
	public WebElement drp_search;
	
	 @FindBy(xpath=" //option[contains(text(),'All')]")
	public WebElement drp_fst;
	 
	 @FindBy(xpath="//select[@id='period']")
	 public WebElement drp_period;
		
	@FindBy(xpath="//input[@id='searchBtn']")
	public WebElement btn_search;
	
	
	public void addentitlements()
	{
	Actions dp = new Actions(driver);
	dp.moveToElement(drp_menu).build().perform();
	Actions dp1 = new Actions(driver);
	dp1.moveToElement(drp_leave).build().perform();
	 drp_sub.click();
	 drp_empname.sendKeys("Nina");
	 drp_search.click();
	 drp_fst.click();
	 
	 Select adays = new Select(drp_period);
	 adays.selectByValue("2020-01-01$$2020-12-31");
	 btn_search.click();
	}
	
}

