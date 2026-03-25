package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D38Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/");
        
        driver.findElement(By.linkText("Slider")).click();
        driver.switchTo().frame(0);

        WebElement slider = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));
        int x = slider.getLocation().x;
        int y = slider.getLocation().y;
        
        Actions act = new Actions(driver);
        act.dragAndDropBy(slider, x+100, y).perform();

        Thread.sleep(2000);
        
        TakesScreenshot ss = (TakesScreenshot) driver;
        File f1 = ss.getScreenshotAs(OutputType.FILE);
        //f1 object holds the screenshot
        FileHandler.copy(f1, new File("Screenshots\\JQuryScreenshot.jpeg"));
        //FileHandler.copy() will store the file physically at the path
        
        System.out.println("Screenshot captured!!!");
        driver.close();
	}

}
