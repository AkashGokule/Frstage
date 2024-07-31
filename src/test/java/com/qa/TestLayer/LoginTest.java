package com.qa.TestLayer;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;



@Listeners(utility.ExtentReportManager.class)

public class LoginTest extends TestBase {

	@Test(priority = 1)
	public void verify_the_Login_functionality_with_valid_credential() throws InterruptedException {
		
		login_page.userName("darshan");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		boolean actual_result = home_page.get_home_logo_status();
		Assert.assertTrue(actual_result);

	}
	

	@Test(priority = 2)
	public void verify_the_Login_functionality_with_invalid_credential() throws InterruptedException {
		
		login_page.userName("arshan");
		login_page.Password("K@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		boolean actual_result = home_page.get_home_logo_status();
		Assert.assertFalse(actual_result);

	}
	@Test(priority = 3)
	public void verify_the_Login_functionality_with_invalid_username_and_valid_password() throws InterruptedException {
		
		login_page.userName("133");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		String actual_result =login_page.get_username_error();
		String expected_result="The username or password is incorrect";
		Assert.assertEquals(expected_result,actual_result);

	}
	@Test(priority = 4)
	public void verify_the_Login_functionality_with_valid_username_and_invalid_password() throws InterruptedException {
		
		login_page.userName("darshan");
		login_page.Password("!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		boolean actual_result = home_page.get_home_logo_status();
		Assert.assertFalse(actual_result);

	}
	@Test(priority = 5)
	public void verify_the_Login_functionality_with_blank_username_and_valid_password() throws InterruptedException {
		
		login_page.userName("");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		boolean actual_result = home_page.get_home_logo_status();
		Assert.assertFalse(actual_result);

	}
	@Test(priority = 6)
	public void verify_the_Login_functionality_with_blank_username_and_blank_password() throws InterruptedException {
		
		login_page.userName("");
		login_page.Password("");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		String actual_result =login_page.get_password_error();
		String expected_result="The Password field is required.";
		Assert.assertEquals(expected_result,actual_result);

	}
	@Test(priority = 7)
	public void verify_the_Login_functionality_with_blank_username_and_invalid_password() throws InterruptedException {
		
		login_page.userName("");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		boolean actual_result = home_page.get_home_logo_status();
		Assert.assertFalse(actual_result);

	}
	@Test(priority = 8)
	public void verify_the_Login_functionality_with_invalid_username_and_blank_password() throws InterruptedException {
		
		login_page.userName("pooja");
		login_page.Password("");
		login_page.click_On_singin_Button();
		Thread.sleep(3000);
		String actual_result =login_page.get_password_error();
		String expected_result="The Password field is required.";
		Assert.assertEquals(expected_result,actual_result);

	}
	
	
	
	
	
	
}
