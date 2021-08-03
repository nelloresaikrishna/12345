package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);

		WebElement Bank = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		Thread.sleep(2000);
		WebElement Debit_Side_Account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.dragAndDrop(Bank, Debit_Side_Account).build().perform();
		Thread.sleep(2000);
		
		WebElement R5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Thread.sleep(2000);
		WebElement Amount_Debit = driver.findElement(By.id("amt7"));
		Thread.sleep(2000);
		ac.dragAndDrop(R5000, Amount_Debit).build().perform();
		Thread.sleep(2000);

	}

}
