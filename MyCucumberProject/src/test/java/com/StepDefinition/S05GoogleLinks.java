package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05GoogleLinks {
	WebDriver driver;
	
	//@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		
		System.out.println("Before Hook Executed");
	}
	
	//@After
	public void tearDown() {
		driver.close();
		System.out.println("After Hook Executed");
	}

	@Given("Launch Google in Chrome")
	public void launch_google_in_chrome() {
		
	}

	@When("Click on About Link")
	public void click_on_about_link() {
		driver.findElement(By.linkText("About")).click();
	}

	@Then("About page should display")
	public void about_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Store Link")
	public void click_on_store_link() {
		driver.findElement(By.linkText("Store")).click();
	}

	@Then("Store page should display")
	public void store_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Gmail Link")
	public void click_on_gmail_link() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@Then("Gmail page should display")
	public void gmail_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Images Link")
	public void click_on_images_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Images page should display")
	public void images_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}
}
