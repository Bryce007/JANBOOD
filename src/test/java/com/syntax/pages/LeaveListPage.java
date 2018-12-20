package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LeaveListPage extends BaseClass {
	
	@FindBy(xpath = "//b[contains(text(),'Leave')]")
    public WebElement clickLeave;

    @FindBy(xpath = "//a[@id='menu_leave_viewLeaveList']")
    public WebElement clickLeveList;

    @FindBy(xpath = "//ol//li[1]//img[1]")
    public WebElement fromLeave;

    @FindBy(xpath = "//ol//li[2]//img[1]")
    public WebElement toLeave;

    @FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
    public WebElement checkAll;

    @FindBy(xpath = "//input[@id='leaveList_txtEmployee_empName']")
    public WebElement EmpName;

    @FindBy(xpath = "//select[@id='leaveList_cmbSubunit']")
    public WebElement subUnit;

    @FindBy(xpath="//input[@id='btnSearch']")
    public WebElement clickSearch;
    
    public LeaveListPage() {
    	PageFactory.initElements(driver, this);
}

}
