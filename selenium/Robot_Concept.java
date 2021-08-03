package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Concept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		// Best_Seller
		WebElement Best_Seller = driver.findElement(By.linkText("Best Sellers"));
		Actions ac = new Actions(driver);
		ac.contextClick(Best_Seller).build().perform();
		Thread.sleep(3000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Mobiles
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(Mobiles).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Todays_Deals
		WebElement Todays_Deals = driver.findElement(By.linkText("Today's Deals"));
		ac1.contextClick(Todays_Deals).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Fashion
		WebElement Fashion = driver.findElement(By.linkText("Fashion"));
		ac1.contextClick(Fashion).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Prime
		WebElement Prime = driver.findElement(By.linkText("Prime"));
		ac1.contextClick(Prime).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// New_Releases
		WebElement New_Releases = driver.findElement(By.linkText("New Releases"));
		ac1.contextClick(New_Releases).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Electronics
		WebElement Electronics = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		ac1.contextClick(Electronics).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// Customer_Service
		WebElement Customer_Service = driver.findElement(By.linkText("Customer Service"));
		ac1.contextClick(Customer_Service).build().perform();
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	
		
		
		
		

	}

}
