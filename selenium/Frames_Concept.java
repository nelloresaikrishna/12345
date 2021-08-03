package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Concept {

	private static Object CONTINUE;

	public static void main(String[] args) throws Throwable {

		// 1st program
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://retail.onlinesbi.com/retail/login.htm");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("Button2")).click();
		 * Thread.sleep(2000); driver.switchTo().alert().accept(); driver.close();
		 * 
		 * // 2nd program System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver1 = new ChromeDriver();
		 * driver1.manage().window().maximize();
		 * driver1.get("https://netbanking.hdfcbank.com/netbanking/");
		 * Thread.sleep(2000); WebElement frame_1 =
		 * driver1.findElement(By.xpath("//frame[@name='login_page']"));
		 * driver1.switchTo().frame(frame_1);
		 * driver1.findElement(By.name("fldLoginUserId")).sendKeys("saiCSE");
		 * Thread.sleep(2000);
		 * driver1.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		 * Thread.sleep(2000);
		 * driver1.findElement(By.name("fldPassword")).sendKeys("saiCSE");
		 * Thread.sleep(2000);
		 * driver1.findElement(By.xpath("(//img[@alt='Login'])")).click();
		 * Thread.sleep(2000); driver1.close();
		 * 
		 * //3rd program System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver2 = new ChromeDriver();
		 * driver2.manage().window().maximize(); driver2.get("https://paytm.com/");
		 * Thread.sleep(3000);
		 * driver2.findElement(By.xpath("//div[@data-reactid='46']")).click();
		 * driver2.close();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI%20NOTE:%20Enter%20the%20userId,Enter%20password.");
		Thread.sleep(3000);
		driver3.findElement(By.xpath("//a[contains(text(),'click here')]")).click();
		
		Thread.sleep(3000);
		driver3.findElement(By.id("DUMMY1")).sendKeys("saiCSE");
		Thread.sleep(3000);
		driver3.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("saiCSE");
		Thread.sleep(3000);
		driver3.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		Thread.sleep(3000);

	}

}
