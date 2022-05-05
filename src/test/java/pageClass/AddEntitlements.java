package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class AddEntitlements extends BasePage 
{
	public AddEntitlements(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	public WebElement drp_menu;
	
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']")
	public WebElement drp_leave;
	
	@FindBy(xpath="//a[@id='menu_leave_addLeaveEntitlement']")
	public WebElement drp_addleave;
	
	@FindBy(xpath="//input[@id='entitlements_filters_bulk_assign']")
	public WebElement drp_addfilter;
	
	@FindBy(xpath="//select[@id='entitlements_filters_location']")
	public WebElement drp_filelocation;
	
	@FindBy(xpath="//select[@id='entitlements_filters_subunit']")
	public WebElement drp_filtersubunit;
	
	@FindBy(xpath="//select[@id='entitlements_leave_type']")
	public WebElement drp_leavetype;
	
	@FindBy(xpath="//select[@id='period']")
	public WebElement drp_period;
	
	@FindBy(xpath="//input[@id='entitlements_entitlement']")
	public WebElement drp_entitle;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement btn_save;
	
	@FindBy(xpath="//h3[contains(text(),'OrangeHRM - Matching Employees')]")
	public WebElement btn_diglog;
	
	@FindBy(xpath="//input[@id='dialogConfirmBtn']")
	public WebElement btn_confirm;
	
	
	public void addentitlements()
	{
		Actions dp = new Actions(driver);
		dp.moveToElement(drp_menu).build().perform();
		Actions dp2 = new Actions(driver);
		dp2.moveToElement(drp_leave).build().perform();
		drp_addleave.click();
		drp_addfilter.click();
		Select sl = new Select(drp_filelocation);
		sl.selectByValue("3");
		Select s2 = new Select(drp_filtersubunit);
		s2.selectByValue("3");
		Select s3 = new Select(drp_leavetype);
		s3.selectByValue("8");
		Select s4 = new Select( drp_period);
		s4.selectByValue("2020-01-01$$2020-12-31");
		drp_entitle.sendKeys("200");
		btn_save.click();
		btn_diglog.click();
		btn_confirm.click();
	}
	
}
