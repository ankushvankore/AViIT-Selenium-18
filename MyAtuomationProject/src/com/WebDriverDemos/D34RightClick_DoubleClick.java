package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D34RightClick_DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        Actions act = new Actions(driver);
        
        WebElement rightClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
        //act.moveToElement(rightClickBtn).contextClick().perform();
        act.contextClick(rightClickBtn).perform();
        
        //Will click on the blank area on this page, and this will invisible the menu which is 
        //displayed in earlier step.
        driver.findElement(By.id("authentication")).click();
        
        WebElement doubleClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        //act.moveToElement(doubleClickBtn).doubleClick().perform();
        act.doubleClick(doubleClickBtn).perform();
        
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
        
        driver.close();
	}

}
