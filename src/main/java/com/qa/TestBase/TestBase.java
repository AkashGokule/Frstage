package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.Home_page;
import com.qa.PageLayer.LoginPage;
import com.qa.Tools.Custom_Fields_page;
import com.qa.Tools.Tools_configuration_page;
import com.qa.Tools.User_Workflow_Design_page;

public class TestBase {
	
public static WebDriver driver;
	public static LoginPage login_page;
	public static Home_page home_page;
	public static Tools_configuration_page tool_configuration;
	public static  Custom_Fields_page custom_Fields_page;
	public static WebDriverWait wait;
	public static User_Workflow_Design_page  user_Workflow_Design_page;
	
	
	
	
	@BeforeMethod
	public void Setup() {		
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.get("http://frstage.flowrocket.com/");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	login_page=new LoginPage();
	home_page =new Home_page ();
    tool_configuration=new Tools_configuration_page();
    custom_Fields_page=new Custom_Fields_page();
    user_Workflow_Design_page=new User_Workflow_Design_page();
    
    
    
    
	}

	
	
	
	
	@AfterMethod
	public void tear_down() {
		driver.close();
	}
	
	

}
