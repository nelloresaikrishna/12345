package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {

	public static void main(String[] args) throws Throwable {

		// 1st Program

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Target = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\img.png");
		FileUtils.copyFile(Target, destination);
		driver.close();

		// 2nd Program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement SearchBox = driver1.findElement(By.xpath(
				"//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		SearchBox.sendKeys("iphone12");
		driver1.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver1.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot) driver1;
		File target1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\img1.png");
		FileUtils.copyFile(target1, destination1);
		String title = driver1.getTitle();
		System.out.println(title);
		driver1.close();

	}

}
