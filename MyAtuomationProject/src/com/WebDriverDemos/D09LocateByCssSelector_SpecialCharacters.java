package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//^ - Starts with
		WebElement fullName = driver.findElement(By.cssSelector("input[name^='name']"));
		fullName.sendKeys("Dhanashri Thorat");
		WebElement rediffId = driver.findElement(By.cssSelector("input[name^='login']"));
		rediffId.sendKeys("dhanashri");
		
		//$ - Ends With
		WebElement password = driver.findElement(By.cssSelector("input[placeholder$='password'][name^='pass']"));
		password.sendKeys("dhanashri@123");
		
		//* - Contains
		WebElement retypePassword = driver.findElement(By.cssSelector("input[placeholder*='type']"));
		retypePassword.sendKeys("dhanashri@123");
		
		//WebElement username = driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
		
		String str = "Dhana\"shri\"";
		int age = 22;
		System.out.println(str);
		
		System.out.println("My name is " + str + " my age is " + age);
	}

}
