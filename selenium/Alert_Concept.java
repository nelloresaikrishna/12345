package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {

	public static void main(String[] args) throws Throwable {
		// 1st program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		String title = driver.getTitle();
		System.out.println(title);
		//Simple Alert - 1
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//simple Alert -2
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Confirm Alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Chennai Super Kings");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		
		//2nd program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		Thread.sleep(3000);
		WebElement frame1 = driver1.findElement(By.xpath("//frame[@name='login_page']"));
		driver1.switchTo().frame(frame1);
		driver1.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		Thread.sleep(3000);
		driver1.switchTo().alert().accept();
		Thread.sleep(2000);
		driver1.close();
		
	
		

	}

}
