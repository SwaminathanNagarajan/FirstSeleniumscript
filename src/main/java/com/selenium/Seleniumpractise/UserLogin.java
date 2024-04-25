package com.selenium.Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement SearchInput = driver.findElement(By.name("q"));
		SearchInput.sendKeys("linkedin");
		SearchInput.sendKeys(Keys.ENTER);
		WebElement linkedin = driver.findElement(By.className("yuRUbf"));
		linkedin.click();	
		//login page
		WebElement userid = driver.findElement(By.id("session_key"));
		userid.sendKeys("user@gmail.com");
		WebElement pwd = driver.findElement(By.id("session_password"));
		pwd.sendKeys("ANCD1234");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		//After trying to login and taking screenshot
		TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
		File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("google_screenshot.png");
		try {
            // Copy the screenshot file to the desired destination
            FileHandler.copy(screenshotFile, destinationFile);
            System.out.println("Screenshot saved to " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
		//trying to search a content in youtube
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("En Iniya Pon Nilave");
		search.sendKeys(Keys.ENTER);
		
		WebElement result = driver.findElement(By.xpath("(//ytd-thumbnail/a)[1]"));
		result.click();
		
		
		//driver.quit();
		

	}

}
