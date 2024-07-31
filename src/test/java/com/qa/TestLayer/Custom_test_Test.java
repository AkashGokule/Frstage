package com.qa.TestLayer;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

import utility.ScreenShot;

public class Custom_test_Test extends TestBase {
	@Test
	public void verify_the_custom_filed_add_succesfully() throws InterruptedException {
		login_page.userName("darshan");
		login_page.Password("DK@!2345");
		login_page.click_On_singin_Button();
		Thread.sleep(9000);;
		home_page.click_On_Tool_Button();
		// Get the list of iframes
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		driver.switchTo().frame(iframes.get(0));

		tool_configuration.click_on_cuctom_fields();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		// Get the list of nested iframes within the first iframe
		List<WebElement> nestedIframes = driver.findElements(By.tagName("iframe"));
		System.out.println(nestedIframes.size());

		for (int i = 0; i < nestedIframes.size(); i++) {
			System.out.println("Nested iframe " + i + ": " + nestedIframes.get(i).getAttribute("id"));
		}

		driver.switchTo().frame(nestedIframes.get(1));
		Thread.sleep(5000);
		custom_Fields_page.enter_the_tital_text("laptop");
		custom_Fields_page.enter_the_description_text("i am using a laptop");
		Thread.sleep(1000);
		custom_Fields_page.click__on_customfield_save_button(); 
		Thread.sleep(1000);
		custom_Fields_page.click__on_add_new_filed_icon();
		Thread.sleep(1000);
	    custom_Fields_page.select_custom_datatype("Text");
		Thread.sleep(1000);
		custom_Fields_page.enter_the_custom_lable_text_box("dell");
		Thread.sleep(1000);
		custom_Fields_page.enter_custom_field_description_text("dell laptop is very nice");
		Thread.sleep(1000);
		custom_Fields_page.click_on_required_field_check_box();
		Thread.sleep(1000);
		custom_Fields_page.click_on_unique_field_check_box();
		Thread.sleep(1000);
		custom_Fields_page.click_on_full_field_check_box();
		Thread.sleep(1000);
		custom_Fields_page.clcik_next_customfield_save_button(); 
		Thread.sleep(1000);
		custom_Fields_page.click_On_popUp_ok_button();
		String actual_result = custom_Fields_page.get_added_custom_field();
		String expected="dell";
		Assert.assertEquals(expected, actual_result);



	}


}
