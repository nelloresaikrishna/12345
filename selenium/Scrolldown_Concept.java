package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_Concept {

	public static void main(String[] args) throws Throwable {
		// 1st program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		WebElement katalon = driver.findElement(By.xpath("//a[text()='Katalon']"));
		Thread.sleep(3000);
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].scrollIntoView();", katalon);
		Thread.sleep(3000);
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Target = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\img2.png");

		FileUtils.copyFile(Target, destination);
		driver.close();

		// 2nd program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement recent_jobs = driver1.findElement(
				By.xpath("(//button[@style='background-color:orange; color:white;padding-bottom: 10px;'])[2]"));
		JavascriptExecutor jc1 = (JavascriptExecutor) driver1;
		jc1.executeScript("arguments[0].scrollIntoView();", recent_jobs);
		Thread.sleep(3000);

		TakesScreenshot tc1 = (TakesScreenshot) driver1;
		File Target1 = tc1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\img3.png");

		FileUtils.copyFile(Target1, destination1);
		driver1.close();

	}

}
