package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");
        
        driver.findElement(By.id("firstName")).sendKeys("Dhanashri");
        driver.findElement(By.id("lastName")).sendKeys("Thorat");
        driver.findElement(By.id("userEmail")).sendKeys("dhanashri@gmail.com");
        driver.findElement(By.id("gender-radio-2")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9898989898");
        
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("30 Mar 2000", Keys.ENTER);
        
        driver.findElement(By.id("subjectsInput")).sendKeys("H");
        driver.findElement(By.id("react-select-2-option-0")).click();
        
        driver.findElement(By.id("hobbies-checkbox-3")).click();
	}

}
