package com.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class S06InsuranceProject {
	WebDriver driver;
	@Given("Launch Insurance Project")
	public void launch_insurance_project() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/index.php");
	}
	
	@When("Click on Automobile link")
	public void click_on_automobile_link() {
	    driver.findElement(By.linkText("Automobile")).click();
	}

	@When("Enter the details as follows")
	public void enter_the_details_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    //System.out.println(dataTable);
		List<String>data = dataTable.asList();
		
		//System.out.println(data.get(0));
		
		Select makeDD = new Select(driver.findElement(By.id("make")));
		makeDD.selectByVisibleText(data.get(0));
		driver.findElement(By.id("engineperformance")).sendKeys(data.get(1));
		driver.findElement(By.id("dateofmanufacture")).sendKeys(data.get(2));
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(data.get(3));
		new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(data.get(4));
		driver.findElement(By.id("listprice")).sendKeys(data.get(5));
		driver.findElement(By.id("licenseplatenumber")).sendKeys(data.get(6));
		driver.findElement(By.id("annualmileage")).sendKeys(data.get(7));
	}
}
