package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//input[@id='UserName']")
	private WebElement UserName;
	
	public void userName(String username)
	{
		UserName.sendKeys(username);
	}
	

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passWord;
	
	public void Password(String password)
	{
		passWord.sendKeys(password);
	}
	

	@FindBy(xpath ="//button[contains(text(),'Sign in')]")
	private WebElement singin;
	
	public void click_On_singin_Button()
	{
		singin.click();
	}	
	
	
	
	
	@FindBy(xpath ="//span[text()='The Password field is required.']")    
	private WebElement password_error;
	
	public String get_password_error()
	{
		 String actual_result = password_error.getText();
		return actual_result;
	}
		
	@FindBy(xpath ="//li[text()='The username or password is incorrect']")    
	private WebElement  username_error;
	
	public String get_username_error()
	{
		 String actual_result = username_error.getText();
		return actual_result;
	}
	
	
	
	}


