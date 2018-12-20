package com.syntax.stepDefinitions;

import org.testng.Assert;

import com.syntax.pages.AssignLeavePage;
import com.syntax.utils.CommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignLeaveSteps {
	
	AssignLeavePage assignLeave;
	
	@When("^I click on leave and Assignleave$")
	public void i_click_on_leave_and_Assignleave() throws Throwable {
	    assignLeave=new AssignLeavePage();
		CommonMethods.click(assignLeave.leaveLink);
		CommonMethods.click(assignLeave.assignLeaveLink);
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String value) throws Throwable {
	    CommonMethods.enterValue(assignLeave.empName, value);
	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String leaveType) throws Throwable {
	    CommonMethods.selectValue(assignLeave.leaveType, leaveType);
	}

	@Then("^Balance of (\\d+) should be present for employee$")
	public void balance_of_should_be_present_for_employee(String text) throws Throwable {
	   String leaveText= assignLeave.text.getText();
		Assert.assertEquals(leaveText, 50);
	}

	@Then("^I select calendar \"([^\"]*)\"$")
	public void i_select_calendar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I select calendar \"([^\"]*)\" that doesn’t exceed (\\d+) days$")
	public void i_select_calendar_that_doesn_t_exceed_days(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see that the leave balance has changed based on how many days that was taken$")
	public void i_should_see_that_the_leave_balance_has_changed_based_on_how_many_days_that_was_taken() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
