package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/usr/local/Caskroom/chromedriver/122.0.6261.128/chromedriver-mac-x64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("MUHAMMAD JAHANZAIB");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lastnameElement = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element);
        lastnameElement.sendKeys("Khan");
        
        WebElement phoneNumberElement = driver.findElement(By.id("phoneNumber"));  // Check if ID "phone" is correct
        System.out.println("Found element: " + lastnameElement);
        phoneNumberElement.sendKeys("0430000000");
        
        WebElement emailElement = driver.findElement(By.id("email"));
        System.out.println("Found element: " + emailElement);
        emailElement.sendKeys("S223739038@deakin.edu.au");
        
        WebElement passwordElement = driver.findElement(By.id("password"));  // Check if ID "password" is correct
        passwordElement.sendKeys("admin#098"); 
        
        WebElement confirmPasswordElement = driver.findElement(By.id("confirmPassword"));  // Check if ID "password" is correct
        confirmPasswordElement.sendKeys("admin#098"); 
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
        WebElement accountActionButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
        accountActionButton.click();
       
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the path where you want to save the screenshot
        String screenshotPath = "/Users/jahanzaib/downloads/image1.png";

        // Move the screenshot file to the specified path
        try {
            if (screenshotFile.renameTo(new File(screenshotPath))) {
                System.out.println("Screenshot saved at: " + screenshotPath);
            } else {
                System.out.println("Failed to save screenshot.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void facebookRegistration(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/usr/local/Caskroom/chromedriver/122.0.6261.128/chromedriver-mac-x64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		 WebElement firstNameElement = driver.findElement(By.name("firstname"));
		    firstNameElement.sendKeys("MUHAMMAD JAHANZAIB");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code

		    WebElement lastNameElement = driver.findElement(By.name("lastname"));
		    lastNameElement.sendKeys("Khan");

		    WebElement emailElement = driver.findElement(By.name("reg_email__"));
		    emailElement.sendKeys("S223739038@deakin.edu.au");
		    
		    WebElement reg_emailElement = driver.findElement(By.name("reg_email_confirmation__"));
		    reg_emailElement.sendKeys("S223739038@deakin.edu");
		    
		    WebElement passwordElement = driver.findElement(By.id("password_step_input"));
		    passwordElement.sendKeys("admin@0987");
		    
		    //day***
		    WebElement dayElement = driver.findElement(By.id("day"));
		    dayElement.sendKeys("09");
		    //month***
		    WebElement monthElement = driver.findElement(By.id("month"));
		    monthElement.sendKeys("NOV");
		    //year***
		    WebElement yearElement = driver.findElement(By.id("year"));
		    yearElement.sendKeys("1996");
		    
		    WebElement genderElement = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		    genderElement.click();
        
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
       
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the path where you want to save the screenshot
        String screenshotPath = "/Users/jahanzaib/downloads/image2.png";

        // Move the screenshot file to the specified path
        try {
            if (screenshotFile.renameTo(new File(screenshotPath))) {
                System.out.println("Screenshot saved at: " + screenshotPath);
            } else {
                System.out.println("Failed to save screenshot.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
}