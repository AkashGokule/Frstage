package com.qa.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Tools_configuration_page extends TestBase {
	
	public Tools_configuration_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='Custom Fields'])[2]")
	public WebElement custom_fields;
	
	public void click_on_cuctom_fields() {
		custom_fields.click();
	}
	
	
	@FindBy(xpath="//span[text()='Workflow Designer']")
	public WebElement workflow_designer;
	
	public void click_on_workflow_designer() {
		workflow_designer.click();
	}
	public void switchTo_iframe() {
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='ifr_window_0']"));
		
		driver.switchTo().frame(iframe);
		
	}
	/*
	 * @FindBy(xpath="") private WebElement custom_fields;
	 * 
	 * public void click_on_cuctom_fields() {
	 * 
	 * }
	 */

 
}
