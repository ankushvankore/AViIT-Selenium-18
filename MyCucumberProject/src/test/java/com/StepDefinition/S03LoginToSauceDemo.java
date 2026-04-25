package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03LoginToSauceDemo {
	WebDriver driver;
	@Given("Launch Sauce Demo")
	public void launch_sauce_demo() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
	}

	@When("Enter valid user name")
	public void enter_valid_user_name() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}

	@When("Enter invalid user name")
	public void enter_invalid_user_name() {
		driver.findElement(By.id("user-name")).sendKeys("dhanashri");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.id("password")).sendKeys("dhanashri");
	}

	@When("User Click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText().contains("Epic sadface"));
	}
}
