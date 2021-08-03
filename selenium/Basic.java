package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.youtube.com/c/NelloreSaikrishnaTeluguTech");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com");
		driver1.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().refresh();
		String currentUrl1 = driver1.getCurrentUrl();
		System.out.println(currentUrl1);
		String title1 = driver1.getTitle();
		System.out.println(title1);
		driver1.close();
	
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.navigate().to("https://www.youtube.com");
		Thread.sleep(3000);
		driver2.navigate().back();
		driver2.navigate().forward();
		driver2.navigate().refresh();
		String currentUrl2 = driver2.getCurrentUrl();
		System.out.println(currentUrl2);
		String title2 = driver2.getTitle();
		System.out.println(title2);
		driver2.close();
		driver2.quit();


	}

}
