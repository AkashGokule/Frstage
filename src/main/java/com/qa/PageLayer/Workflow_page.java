package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Workflow_page extends TestBase {
	
	public Workflow_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//li[@id='spanTools']")
	private WebElement tools;
	public void click_On_Tool_Button()
	{
		tools.click();
	}	
	

}
