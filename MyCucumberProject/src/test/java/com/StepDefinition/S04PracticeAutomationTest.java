package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04PracticeAutomationTest {
	WebDriver driver;
	
	@Given("Open practice automation test application")
	public void open_practice_automation_test_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
	}

	@When("Enter name as {string}")
	public void enter_name_as(String sName) {
		 driver.findElement(By.id("name")).sendKeys(sName);
	}

	@When("Enter email id as {string}")
	public void enter_email_id_as(String email) {
	    driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("Enter mobile no as {string}")
	public void enter_mobile_no_as(String mNo) {
		 driver.findElement(By.id("phone")).sendKeys(mNo);
	}

	@When("Enter address as {string}")
	public void enter_address_as(String address) {
		 driver.findElement(By.id("textarea")).sendKeys(address);
	}

	@When("Select gender as {string}")
	public void select_gender_as(String gn) {
	    if(gn.equals("Male"))
	    	driver.findElement(By.id("male")).click();
	    else
	    	driver.findElement(By.id("female")).click();
	}
}
