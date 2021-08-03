package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {

	public static void main(String[] args) throws Throwable {

		// Drag and Drop Program
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("http://demo.guru99.com/test/drag_drop.html"); Thread.sleep(2000);
		 * 
		 * WebElement Bank =
		 * driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		 * Thread.sleep(2000); WebElement Debit_Side_Account =
		 * driver.findElement(By.xpath("(//li[@class='placeholder'])[1]")); Actions ac =
		 * new Actions(driver); Thread.sleep(2000); ac.dragAndDrop(Bank,
		 * Debit_Side_Account).build().perform(); Thread.sleep(2000);
		 * 
		 * WebElement R5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		 * Thread.sleep(2000); WebElement Amount_Debit =
		 * driver.findElement(By.id("amt7")); Thread.sleep(2000); ac.dragAndDrop(R5000,
		 * Amount_Debit).build().perform(); Thread.sleep(2000);
		 * 
		 * WebElement Sales =
		 * driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		 * Thread.sleep(2000); WebElement Credit_Side_Account =
		 * driver.findElement(By.id("loan")); Thread.sleep(2000); ac.dragAndDrop(Sales,
		 * Credit_Side_Account).build().perform(); Thread.sleep(2000);
		 * 
		 * WebElement Amount_5000_Credit =
		 * driver.findElement(By.xpath("//a[text()=' 5000 ']")); Thread.sleep(2000);
		 * WebElement Credit_Side_Amount = driver.findElement(By.id("amt8"));
		 * Thread.sleep(2000); ac.dragAndDrop(Amount_5000_Credit,
		 * Credit_Side_Amount).build().perform(); Thread.sleep(2000);
		 * 
		 * // MouseOver Program System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver1 = new ChromeDriver();
		 * driver1.manage().window().maximize(); driver1.get("https://www.amazon.in/");
		 * Thread.sleep(3000); WebElement Mobiles =
		 * driver1.findElement(By.xpath("//a[text()='Mobiles']")); Thread.sleep(3000);
		 * Mobiles.click(); Thread.sleep(3000); WebElement Mobile_Accessories =
		 * driver1.findElement(By.xpath("(//span[@class='nav-a-content'])[2]")); Actions
		 * ac1 = new Actions(driver1); Thread.sleep(3000);
		 * ac1.moveToElement(Mobile_Accessories).build().perform(); Thread.sleep(3000);
		 * WebElement powerbanks =
		 * driver1.findElement(By.xpath("//a[text()='Power Banks']"));
		 * ac1.moveToElement(powerbanks).build().perform(); Thread.sleep(3000);
		 * ac1.moveToElement(powerbanks).click().build().perform();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("http://www.flipkart.com");
		Thread.sleep(5000);
		driver3.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement home = driver3.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]/div[1]/img[1]"));
		Actions ac4 = new Actions(driver3);
		ac4.moveToElement(home);
		Thread.sleep(3000);
		WebElement appliances = driver3.findElement(By.xpath("//a[@xpath='1']"));
		ac4.moveToElement(appliances).click();
		Thread.sleep(3000);
		driver3.findElement(By.xpath("//a[contains(text(),'Dyson Pure Cool Desk Portable Room Air Purifier')]")).click();
		
		
	}

}
