package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handles_Method {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/");
		Thread.sleep(2000);
		// Time_Sale
		WebElement Time_Sale = driver.findElement(By.linkText("Time Sale"));
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.contextClick(Time_Sale).build().perform();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// Food_Beverage
		WebElement Food_Beverage = driver.findElement(By.linkText("Food & Beverage"));
		Thread.sleep(2000);
		ac.contextClick(Food_Beverage).build().perform();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> ALL_WINDOWS = driver.getWindowHandles();
		for (String at : ALL_WINDOWS) {
			System.out.println(at);
			String title = driver.switchTo().window(at).getTitle();
			System.out.println(title);
		}
		Thread.sleep(2000);
		String Shopclues_main = "Online Shopping Site India - Shop Online for men, women and kids fashion, home, kitchen, health, sports and more products at ShopClues";
		for (String at : ALL_WINDOWS) {
			if (driver.switchTo().window(at).getTitle().equals(Shopclues_main)) {
				break;
			}
		}
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();

	}

}
