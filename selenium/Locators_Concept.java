package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Concept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("9989145700");
		driver.findElement(By.name("pass")).sendKeys("9989145700");
		driver.findElement(By.name("login")).click();
		driver.close();

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.redbus.in/");
		Thread.sleep(5000);
		driver1.findElement(By.id("src")).sendKeys("Nellore");
		driver1.findElement(By.id("dest")).sendKeys("Chennai");
		driver1.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com/");
		Thread.sleep(5000);
		driver2.findElement(By.name("q")).sendKeys("Greens technology");
		driver2.close();*/
		
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(10000);
		driver3.findElement(By.id("login_username|input")).sendKeys("saiCSE");
		driver3.findElement(By.id("login_password|input")).sendKeys("saiCSE");
		driver3.close();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.get("https://infinity.icicibank.com/corp/Login.jsp");
		Thread.sleep(10000);
		driver4.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("9989145700");
		driver4.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("9989145700");
		driver4.close();
		
		/*WebDriver driver5 = new ChromeDriver();
		driver5.manage().window().maximize();
		driver5.get("https://twitter.com/login");
		Thread.sleep(5000);
		driver5.findElement(By.name("session[username_or_email]")).sendKeys("9989145700");
		driver5.findElement(By.name("session[password]")).sendKeys("9989145700");
		driver5.close();*/
		
		WebDriver driver6 = new ChromeDriver();
		driver6.manage().window().maximize();
		driver6.get("https://netbanking.hdfcbank.com/");
		Thread.sleep(10000);
		driver6.findElement(By.name("fldLoginUserId")).sendKeys("9989145700");
		driver6.close();
		
		/*WebDriver driver7 = new ChromeDriver();
		driver7.manage().window().maximize();
		driver7.get("https://www.swiggy.com");
		Thread.sleep(5000);
		driver7.findElement(By.id("location")).sendKeys("nellore");
		driver7.close();
		
		WebDriver driver8 = new ChromeDriver();
		driver8.manage().window().maximize();
		driver8.get("https://www.snapdeal.com/login");
		Thread.sleep(5000);
		driver8.findElement(By.id("userName")).sendKeys("9989145700");
		driver8.close();
		
		
		WebDriver driver9 = new ChromeDriver();
		driver9.manage().window().maximize();
		driver9.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(5000);
		driver9.findElement(By.name("username")).sendKeys("9989145700");
		driver9.findElement(By.name("password")).sendKeys("9989145700");
		driver9.close();
		
		WebDriver driver10 = new ChromeDriver();
		driver10.manage().window().maximize();
		driver10.get("https://www.irctc.co.in/");
		Thread.sleep(5000);
		driver10.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver10.close();*/
		

		
		
		
		

	}

}
