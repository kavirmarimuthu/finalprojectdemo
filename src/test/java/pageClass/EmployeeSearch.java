package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class EmployeeSearch extends BasePage
{
	public EmployeeSearch(WebDriver driver) 
	{
		super(driver);
	
	}

	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
	public WebElement txtemployee;
	
	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	public WebElement txtviewemployee;
	
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	public WebElement txtsrcemployee;
	
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public WebElement txtbtn;
	
	
	public void searchname()
	{
		
		Actions action = new Actions(driver);
		action.moveToElement(txtemployee).build().perform();
		txtviewemployee.click();
		txtsrcemployee.sendKeys("Sara");
		
		txtbtn.click(); 
		
	}
	
	
}
