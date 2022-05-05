package pageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class ApplyLeave extends BasePage {
	
	public ApplyLeave(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//span[contains(text(),'Apply Leave')]")
	public WebElement applyleave;
	
	@FindBy(xpath="//select[@id='applyleave_txtLeaveType']")
	public WebElement txt_leave ;
	
	@FindBy(xpath="//input[@id='applyleave_txtFromDate']")
	public WebElement txt_fromdate ;
	
	@FindBy(xpath="//input[@id='applyleave_txtToDate']")
	public WebElement txt_todate ;
	
	@FindBy(xpath="//select[@id='applyleave_partialDays']")
	public WebElement drp_pleave;
	
	@FindBy(xpath="//select[@id='applyleave_firstDuration_duration']")
	public WebElement drp_pduration ;
	
	@FindBy(xpath="//select[@id='applyleave_firstDuration_ampm']")
	public WebElement drp_fduration ;
	
	@FindBy(xpath="//textarea[@id='applyleave_txtComment']")
	public WebElement txt_comment ;
	
	@FindBy(xpath="//input[@id='applyBtn']")
	public WebElement txt_abutton;
	

	@FindBy(xpath="//h1[contains(text(),'Apply Leave')]")
	public WebElement txt_message;
	
	public void applyleaveform()
	{
		applyleave.click();
		txt_leave.click();
		
		Select dropmon = new Select(txt_leave);
		dropmon.selectByVisibleText("CAN - Bereavement");
		txt_fromdate.clear();
		txt_fromdate.sendKeys("2022-04-21"+ Keys.ENTER);
		txt_todate.clear();
		txt_todate.sendKeys("2022-04-22"+ Keys.ENTER);
		Select adays = new Select(drp_pleave);
		adays.selectByVisibleText("All Days");
		Select pdays = new Select(drp_pduration);
		pdays.selectByVisibleText("Half Day");
		Select fdays = new Select(drp_fduration);
		fdays.selectByVisibleText("Afternoon");
		txt_comment.sendKeys("Submitted");
		txt_abutton.click();
		
		
	}
	
	public String assert_actual()
	{
		
		return  txt_message.getText();
		
	}
	
	
	
}
