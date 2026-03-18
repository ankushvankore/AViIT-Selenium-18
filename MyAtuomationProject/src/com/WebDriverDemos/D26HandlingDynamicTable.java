package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingDynamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        
        List<WebElement>names = driver.findElements(By.xpath("//tbody[@id=\"rows\"]/tr/td[1]"));
        int rowIndex = 1;
        
        for(WebElement n : names) {
        	if(n.getText().equals("Chrome")) {
        		break;
        	}
        	rowIndex++;
        }
        System.out.println("Row Index: " + rowIndex);
        
        List<WebElement>headers = driver.findElements(By.xpath("//table[@id=\"taskTable\"]/thead/tr/th"));
        
        int colIndex = 1;
        for(WebElement h : headers) {
        	if(h.getText().equals("CPU (%)")) {
        		break;
        	}
        	colIndex++;
        }
        System.out.println("Column Index: " + colIndex);
        
        String expValue = driver.findElement(By.xpath("//*[@id=\"displayValues\"]/p[1]/strong")).getText();
        
        String actValue = driver.findElement(By.xpath("//tbody[@id=\"rows\"]/tr["+rowIndex+"]/td["+colIndex+"]")).getText();
        System.out.println(actValue);
        
        if(expValue.equals(actValue))
        	System.out.println("Both values matches!!! Test case pass");
        else
        	System.out.println("Values are not matching!!! Test case fail");
        
        driver.close();
	}

}
