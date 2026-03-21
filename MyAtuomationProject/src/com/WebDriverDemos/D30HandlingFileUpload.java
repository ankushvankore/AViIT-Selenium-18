package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        driver.findElement(By.id("firstName")).sendKeys("Dhanashri");
        driver.findElement(By.id("lastName")).sendKeys("Thorat");
        driver.findElement(By.id("userEmail")).sendKeys("dhanashri@gmail.com");
        driver.findElement(By.id("gender-radio-2")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9898989898");
        
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("30 Mar 2000", Keys.ENTER);
        
        driver.findElement(By.id("subjectsInput")).sendKeys("H");
        driver.findElement(By.id("react-select-2-option-0")).click();
        
        js.executeScript("window.scrollBy(0, 400)", "");
        
        driver.findElement(By.id("hobbies-checkbox-3")).click();
        WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
        fileUpload.sendKeys("D:\\AViIT\\Demos\\Selenium_18\\Core Java Basics.pdf");
        
        js.executeScript("arguments[0].style.border='3px solid red'", fileUpload);
        
        driver.findElement(By.id("currentAddress")).sendKeys("Kasaba Bawada");
        
        WebElement stateDD = driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div"));
        js.executeScript("arguments[0].click()", stateDD);
        stateDD.click();
        
        //driver.findElement(By.id("react-select-3-option-2")).click();
        js.executeScript("arguments[0].click()", driver.findElement(By.id("react-select-3-option-2")));
	}

}
