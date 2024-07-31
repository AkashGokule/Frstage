package com.qa.TestLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

import utility.ScreenShot;


public class User_Workflow_Design_page_test extends TestBase{

	@Test
	public void verify_that_workflow_design_add_successfuly() throws InterruptedException {

		login_page.userName("darshan");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(10000);
		home_page.click_On_Tool_Button();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		driver.switchTo().frame(iframes.get(0));

		tool_configuration.click_on_workflow_designer();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		// Get the list of nested iframes within the first iframe
		List<WebElement> nestedIframes = driver.findElements(By.tagName("iframe"));
		System.out.println(nestedIframes.size());

		for (int i = 0; i < nestedIframes.size(); i++) {
			System.out.println("Nested iframe " + i + ": " + nestedIframes.get(i).getAttribute("id"));
		}

		driver.switchTo().frame(nestedIframes.get(1));
		user_Workflow_Design_page.enter_the_workflow_design_title("moblie");
		Thread.sleep(1000);
		user_Workflow_Design_page.enter_the_short_workflow_title("iphone");
		Thread.sleep(1000);
		user_Workflow_Design_page.select_the_ACL_workflow("All Internal");
		Thread.sleep(1000);
//		user_Workflow_Design_page.click_on_Allow_multiple_enteries_in_workflow_checkbox();
//		Thread.sleep(1000);
//		user_Workflow_Design_page.click_show_in_menu_section_checkbox();
//		Thread.sleep(1000);
//		user_Workflow_Design_page.select_custom_field_set_dropDown("Operations");
//		Thread.sleep(1000);
		user_Workflow_Design_page.enter_work_flow_discription("heloooo");
		Thread.sleep(1000);
		user_Workflow_Design_page.click_on_save_workflow_design();
		Thread.sleep(1000);
		user_Workflow_Design_page.click_On_popUp_ok_button();
		Thread.sleep(1000);
		user_Workflow_Design_page.click_On_add_custom_field_set();
		Thread.sleep(1000);
		user_Workflow_Design_page.select_custom_field_set_dropDown("bank statement1");
		Thread.sleep(1000);
		user_Workflow_Design_page.click_On_multiple_record_checkbox();
		Thread.sleep(1000);
		user_Workflow_Design_page.click_On_save_button();
		Thread.sleep(1000);
		user_Workflow_Design_page.click_On_popUp_ok_button();
		Thread.sleep(1000);
		String actualresult = user_Workflow_Design_page.get_added_custom_field_set();
		String expectedresult="bank statement1";
		Assert.assertEquals(expectedresult, actualresult);











	}





}
