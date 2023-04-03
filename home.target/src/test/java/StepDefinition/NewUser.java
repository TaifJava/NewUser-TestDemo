package StepDefinition;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewUser {

	WebDriver driver = null;
	
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
	
	@Given("User navigates to Target Home Page")
	public void user_navigate_to_target_home_page() throws InterruptedException {
	    
	System.setProperty("webdriver.chrome.driver", "/Users/asadzaman/eclipse-workspace/home.target/src/test/resources/Drivers/chromedriver");
	driver = new ChromeDriver();
	
	driver.get("https://www.target.com");
	
	Thread.sleep(3000);
	 
	}

	@Then("User lands on Home page and sees Home Page title")
	public void user_lands_on_home_page_and_sees_Home_Page_title() {
		
	   driver.getTitle();
	   System.out.println("User lands on Home page and sees Home Page title");
	}
	
	@When("User clicks on Profile button")
	public void user_clicks_on_profile_button() throws InterruptedException {
	     
		driver.findElement(By.id("account")).click();
		
		Thread.sleep(3000);
		
	    
	}

	@When("User clicks on create account button")
	public void user_clicks_on_create_account_button() throws InterruptedException {
	    
		
		driver.findElement(By.id("accountNav-createAccount")).click();

		System.out.println("User clicks on create account button");
		Thread.sleep(3000);
	}

	@When("User types email address in email field")
	public void user_types_email_address_in_email_field() throws InterruptedException {
		
		driver.findElement(By.name("usernamecreateaccount")).sendKeys(timeFormat + "@gmail.com");
		Thread.sleep(5000);
		System.out.println("User types email address in email field");
		driver.quit();
	}

	@When("User types First name in First name field")
	public void user_types_first_name_in_first_name_field() {
	    
		System.out.println("User types First name in First name field");
	}

	@When("User types Last name in Last name field")
	public void user_types_last_name_in_last_name_field() {
		
		System.out.println("User types Last name in Last name field");
	}

	@When("User types Password in password field")
	public void user_types_password_in_password_field() throws InterruptedException {
	    
		Thread.sleep(3500);
		System.out.println("User types Password in password field");
		driver.quit();
	}

	
}
