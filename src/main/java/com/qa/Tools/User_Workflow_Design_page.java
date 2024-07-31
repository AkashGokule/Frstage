package com.qa.Tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class User_Workflow_Design_page extends TestBase {
	public User_Workflow_Design_page() {
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//input[@id='txtDocumentConfigurationName']")
	private WebElement workflow_title;
	public void enter_the_workflow_design_title(String title) {
		workflow_title.sendKeys(title);
	}



	@FindBy(xpath="//input[@id='txtDocumentConfigurationShortName']")
	private WebElement enter_short_workflow_title;
	public void enter_the_short_workflow_title(String tital) {
		enter_short_workflow_title.sendKeys(tital);
	}



	@FindBy(xpath="//span[@id='select2-ddlAcl-container']")
	private WebElement select_the_ACL_workflow;

	public void select_the_ACL_workflow(String typeoftheddata)
	{
		select_the_ACL_workflow.click();
		List<WebElement> datatypestore = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));

		for(WebElement datatype: datatypestore) {
			System.out.println(datatype.getText());
			if(datatype.getText().equals(typeoftheddata))
			{	

				datatype.click();
				break;
			}
		}

	}



	@FindBy(xpath="//img[@id='checkMultipleEntries']")
	private WebElement Allow_multiple_enteries_in_workflow_checkbox;
	public void click_on_Allow_multiple_enteries_in_workflow_checkbox( ) {



		try {
			if (!Allow_multiple_enteries_in_workflow_checkbox.isSelected()) {
				Allow_multiple_enteries_in_workflow_checkbox.click();
			}

		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

	@FindBy(xpath="//img[@id='uncheckMenu']")
	private WebElement show_in_menu_section_checkbox;
	public void click_show_in_menu_section_checkbox( ) {
		try {
			if (!show_in_menu_section_checkbox.isSelected()) {
				show_in_menu_section_checkbox.click();
			}

		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

	@FindBy(xpath="//span[@id='select2-ddlSection-container']")
	private WebElement show_in_menu_section_dropdown;

	public void select_show_in_menu_section_dropdown(String typeoftheddata) throws InterruptedException
	{
		show_in_menu_section_dropdown.click();
		Thread.sleep(3000);
		List<WebElement> datatypestore = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));

		for(WebElement datatype: datatypestore) {
			System.out.println(datatype.getText());
			if(datatype.getText().equals(typeoftheddata))
			{	

				datatype.click();
				break;
			}
		}

	}

	@FindBy(xpath="//textarea[@id='txtDescriptionArea']")
	private WebElement work_flow_discription;
	public void enter_work_flow_discription(String title) {
		work_flow_discription.sendKeys(title);
	}

	@FindBy(xpath="//button[@id='imgDocumentConfigurationSave']")
	private WebElement save_workflow_design;
	public void click_on_save_workflow_design() {
		save_workflow_design.click();
	}
	@FindBy(xpath="//input[@id='popup_ok']")
	private WebElement popUp_ok_button;
	public void click_On_popUp_ok_button()  {
		popUp_ok_button.click();
	}

	@FindBy(xpath="//button[@id='btnAddDivider']")
	private WebElement add_divider_button;
	public void click_On_add_divider_button()  {
		add_divider_button.click();
	}

	@FindBy(xpath="//span[contains(text(),'Add Custom Field Set')]")
	private WebElement add_custom_field_set;
	public void click_On_add_custom_field_set()  {
		add_custom_field_set.click();
	}

	@FindBy(xpath="//span[@id='select2-ddlCustomeFieldsSet-container']")
	private WebElement select_custom_field_set_dropDown;

	public void select_custom_field_set_dropDown(String typeoftheddata)
	{
		select_custom_field_set_dropDown.click();
		List<WebElement> datatypestore = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));

		for(WebElement datatype: datatypestore) {
			System.out.println(datatype.getText());
			if(datatype.getText().equals(typeoftheddata))
			{	

				datatype.click();
				break;
			}
		}

	}
	@FindBy(xpath="//input[@id='chxforMultipleRecords']")
	private WebElement multiple_record_checkbox;
	public void click_On_multiple_record_checkbox()  {
		multiple_record_checkbox.click();
	}
	@FindBy(xpath="//body/div[@id='AddCustomFieldSetModel']/div[1]/div[1]/div[3]/button[1]/span[1]")
	private WebElement save_button;
	public void click_On_save_button()  {
		save_button.click();
	}
	@FindBy(xpath="//button[@id='btnCancelCustomFieldSet']")
	private WebElement CancelCustomFieldSet;
	public void click_On_Cancel_CustomField_Set_button()  {
		CancelCustomFieldSet.click();
	}

	@FindBy(xpath="(//tr[@role='row']/td)[1]")
	private WebElement get_added_custom_field_set;
	public String get_added_custom_field_set()  {
		return get_added_custom_field_set.getText();
	}


}
