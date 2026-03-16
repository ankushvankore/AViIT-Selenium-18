package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A08EchoechoCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement>products = driver.findElements(By.cssSelector("input[name^='option']"));

		for(WebElement cb : products) {
			System.out.println("------------- Before ------------");
			System.out.println("Selected: " + cb.isSelected());
			System.out.println("Enabled : " + cb.isEnabled());
			System.out.println("Visible : " + cb.isDisplayed());
			
			if(!cb.isSelected() && cb.isEnabled())
				cb.click();
			
			System.out.println("------------- After ------------");
			System.out.println("Selected: " + cb.isSelected());
			System.out.println("Enabled : " + cb.isEnabled());
			System.out.println("Visible : " + cb.isDisplayed());
		}
	}

}
