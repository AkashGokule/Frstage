package com.qa.Tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.TestBase.TestBase;

public class Custom_Fields_page extends TestBase{
	public Custom_Fields_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtTitle']")
	private WebElement tital_text;
	
	public void enter_the_tital_text(String tital) {
     
		tital_text.sendKeys(tital);
	}
	
	@FindBy(xpath="//textarea[@id='txtCustomDescription']")
	private WebElement description_text;
	
	public void enter_the_description_text(String description) {
		description_text.sendKeys(description);	
	}
	
	@FindBy(xpath="//i[@id='customFieldSave']")
	private WebElement customfield_save_button;
	
	public void click__on_customfield_save_button()  {
		customfield_save_button.click();
	}
	
	
	@FindBy(xpath="//i[@id='customTypeFieldAddNew']")
	private WebElement add_new_filed_icon;
	
	public void click__on_add_new_filed_icon()  {
		add_new_filed_icon.click();
	}
	
	@FindBy(xpath="//span[@id='select2-ddlAddDocumentMetadata-container']")
	private WebElement add_custom_datatype;
	
	public void select_custom_datatype(String typeoftheddata) throws InterruptedException
      {
		 add_custom_datatype.click();

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
	
	@FindBy(xpath="//input[@id='txtLable']")
	private WebElement custom_lable_text_box;
	
	public void enter_the_custom_lable_text_box(String Custom_lable) {
		custom_lable_text_box.sendKeys(Custom_lable);
	}
	
	@FindBy(xpath="//textarea[@name='txtDescription']")
	private WebElement custom_field_description_text;
	
	public void enter_custom_field_description_text(String description_text) {
		custom_field_description_text.sendKeys(description_text);
	}

	@FindBy(xpath="//img[@id='RequiredInactiveCheck']")
	private WebElement required_field;
	
	public void click_on_required_field_check_box() {
		required_field.click();
	}
	@FindBy(xpath="//img[@id='UniqueInactiveCheck']")
	private WebElement unique_field;
	
	public void click_on_unique_field_check_box() {
		unique_field.click();
	}
	
	@FindBy(xpath="//img[@id='FullWidthInactiveCheck']")
	private WebElement full_field;
	
	public void click_on_full_field_check_box() {
		full_field.click();
	}
	
	@FindBy(xpath="//i[@id='customTypeFieldSave']")
	private WebElement next_customfield_save_button;
	
	public void clcik_next_customfield_save_button()  {
		next_customfield_save_button.click();
	}
	
	@FindBy(xpath="//input[@id='popup_ok']")
	private WebElement popUp_ok_button;
	public void click_On_popUp_ok_button()  {
		popUp_ok_button.click();
	}
	
	@FindBy(xpath="(//tbody[@id='tbodyMetadata']/tr/td)[3]")
	private WebElement get_added_custom_field;
	public String get_added_custom_field()  {
		
	return	get_added_custom_field.getText();
	}
	

}
