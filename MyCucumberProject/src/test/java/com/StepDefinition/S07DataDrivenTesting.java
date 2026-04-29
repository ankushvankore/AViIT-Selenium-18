package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07DataDrivenTesting {
	WebDriver driver;
	
	@Given("Launch Orange HRM Application")
	public void launch_orange_hrm_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter username as {string}")
	public void enter_username_as(String un) {
	    driver.findElement(By.name("username")).sendKeys(un);
	}

	@When("Enter password as {string}")
	public void enter_password_as(String ps) {
	    driver.findElement(By.name("password")).sendKeys(ps);
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dashboard page should display")
	public void dashboard_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}
