package com.selenium.Seleniumpractise;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Firstseleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement imagesLink = driver.findElement(By.linkText("Images"));
		imagesLink.click();
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("Unicorn");
		searchInput.sendKeys(Keys.ENTER);
		WebElement Button = driver.findElement(By.className("YmvwI"));
		Button.click();
		WebElement Button1 = driver.findElement(By.className("eKjLze"));
		Button1.click();
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Unicorn Store - The best place to buy your favourite Apple Products | Apple Premium Reseller";
		//Assert.assertEquals(Actualtitle,Expectedtitle);
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("The actual and expected title are same....!");
		}
		else{
			System.out.println("Error title not found...");
		}
		

	}

}
