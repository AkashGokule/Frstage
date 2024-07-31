package utility;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.TestBase.TestBase;



public class ScreenShot extends TestBase{

	public static void screenShot(String name) {	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		String path="C:\\Users\\agsat\\OneDrive\\Desktop\\AkashDocument\\Frstage_Flow_rocket\\Frstage_Flow_rocket\\ScreenShot\\";
		File des=new File(path+name+".png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void scrollUpDown(WebElement element) {
		

            // Cast the WebDriver instance to JavascriptExecutor
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            // Execute JavaScript to scroll down the page by 2000 pixels
          //  js.executeScript("window.scrollBy(0, 800)");
            js.executeScript("arguments[0].scrollIntoView(true);", element);
	}


	// Method to generate a random string of a specified length
	public static String generateRandomString(String firstName) {
		//  String[] firstName = {"John", "Jane", "David", "Emma", "Michael", "Olivia", "James", "Sophia", "William", "Isabella"}; // Add more first names as needed
		Random random = new Random();
		StringBuilder mobileNumber = new StringBuilder();
		for (int i = 0; i <3; i++) {
			int randomDigit = random.nextInt(10);; // Generates a random integer between 0 (inclusive) and 10 (exclusive)
			mobileNumber.append(randomDigit);
		}


		return firstName+mobileNumber.toString();
	}

	// Method to generate a random digit (0-9)
	public static String generateRandomDigit() {
		Random random = new Random();
		StringBuilder mobileNumber = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			int randomDigit = random.nextInt(10); // Generates a random integer between 0 (inclusive) and 10 (exclusive)
			mobileNumber.append(randomDigit);
		}
		return mobileNumber.toString();
	}

	// Method to generate a random email address
	public static String generateRandomEmail(String firstName) {
		String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"}; // Add more domains as needed
		Random random = new Random();
		String username = generateRandomString(firstName); // Generate a random username
		String domain = domains[random.nextInt(domains.length)]; // Choose a random domain from the array
		return username + "@" + domain;
	}

	
}


