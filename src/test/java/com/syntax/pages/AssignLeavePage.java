package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AssignLeavePage extends BaseClass {
	

	@FindBy (xpath= "//b[contains(text(),'Leave')]")
	public WebElement leaveLink;
	
	@FindBy (xpath= "//a[@id='menu_leave_assignLeave']")
	public WebElement assignLeaveLink;
	
	@FindBy (xpath= "//input[@name='assignleave[txtEmployee][empName]']")
	public WebElement empName;
	
	@FindBy(xpath = "//select[@id='assignleave_txtLeaveType']")
	public WebElement leaveType;
	
	@FindBy(xpath = "//ol//li[1]//img[1]")
	public WebElement fromCalendar;
	
	@FindBy(xpath = "//ol//li[2]//img[1]")
	public WebElement toCalendar;
	
	@FindBy(xpath = "//input[@id='assignBtn']")
	public WebElement assignBtn;
	
	@FindBy (xpath="//div[@id='assignleave_leaveBalance']")
	public WebElement text;
	
	public AssignLeavePage() {
		PageFactory.initElements(driver, this);
		
	}
}

