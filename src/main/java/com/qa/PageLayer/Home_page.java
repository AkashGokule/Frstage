package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.TestBase.TestBase;

public class Home_page extends TestBase {

	public Home_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//body/div[@id='mainContent']/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/i[1]")
	private WebElement plus_icon;
	public void click_On_plus_icon()
	{
		plus_icon.click();
	}	
	
	@FindBy(xpath ="//li[text()='Tools']")
	private WebElement tools;
	public void click_On_Tool_Button()
	{
		tools.click();
	}	
	
	@FindBy(xpath ="//button[contains(text(),'Address Book')]")
	private WebElement address_book;
		public void click_On_address_book_Button()
	{
		address_book.click();
	}
	
	@FindBy(xpath ="//li[@id='spanEcm']")
	private WebElement documents;
	public void click_On_documents_Button()
	{
		documents.click();
	}
	
	@FindBy(xpath ="//li[@id='spanCal']")
	private WebElement calender;
	public void click_On_calender_Button()
	{
		calender.click();
	}

	@FindBy(xpath ="//header/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	private WebElement home_logo;
	
	public boolean get_home_logo_status()
	{
		boolean actual_result=false;
		
		try {
			if (home_logo.isDisplayed()==true) {
				
			
			 actual_result = home_logo.isDisplayed();
			
			}
			
		} catch (Exception e) {
			
			
		}
		return actual_result;
		
	}

	
	
	
}
