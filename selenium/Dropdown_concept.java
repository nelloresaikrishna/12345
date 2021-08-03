package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_concept {

	public static void main(String[] args) throws Throwable {

		// 1st program
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize(); driver.get(
		 * "https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en"
		 * ); Thread.sleep(5000); WebElement Passport_office =
		 * driver.findElement(By.id("dcdrLocation"));
		 * 
		 * Select sc = new Select(Passport_office);
		 * 
		 * sc.selectByValue("2");
		 * 
		 * driver.close();
		 * 
		 * // 2nd Program
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver1 = new ChromeDriver();
		 * driver1.manage().window().maximize();
		 * 
		 * driver1.get(
		 * "https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en"
		 * ); driver1.findElement(By.xpath("//tbody/tr[6]/td[2]/img[1]")).click();
		 * Thread.sleep(3000);
		 * 
		 * WebElement month =
		 * driver1.findElement(By.xpath("//select[@class = 'ui-datepicker-month']"));
		 * 
		 * Select sc1 = new Select(month); sc1.selectByValue("2"); Thread.sleep(5000);
		 * 
		 * WebElement year =
		 * driver1.findElement(By.xpath("//select[@class = 'ui-datepicker-year']"));
		 * Select sc2 = new Select(year); sc2.selectByValue("1892"); Thread.sleep(5000);
		 * 
		 * driver1.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		 * driver1.close();
		 * 
		 * // 3rd program
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver2 = new ChromeDriver();
		 * driver2.manage().window().maximize();
		 * driver2.get("https://www.incometaxindiaefiling.gov.in/home");
		 * driver2.findElement(By.xpath("//button[text()='Continue to Homepage']")).
		 * click(); Thread.sleep(3000);
		 * driver2.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		 * WebElement User_type =
		 * driver2.findElement(By.xpath("//select[@id='userTypeSel']"));
		 * Thread.sleep(3000); Select sc4 = new Select(User_type);
		 * sc4.selectByValue("12"); Thread.sleep(3000); driver2.close();
		 * 
		 * // 4th Program System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver3 = new ChromeDriver();
		 * driver3.manage().window().maximize();
		 * driver3.get("https://www.icaionlineregistration.org/Admin_Module/login.aspx")
		 * ; Thread.sleep(3000);
		 * driver3.findElement(By.xpath("//a[contains(text(),'as Studen')]")).click();
		 * driver3.findElement(By.id("txtDob")).click(); WebElement Date1 =
		 * driver3.findElement(By.xpath(
		 * "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")); Select sc5 =
		 * new Select(Date1); sc5.selectByValue("1");
		 * 
		 * Thread.sleep(3000); WebElement year1 = driver3.findElement(By.xpath(
		 * "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")); Select sc6 =
		 * new Select(year1); sc6.selectByValue("1954"); Thread.sleep(3000);
		 * driver3.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		 * driver3.close();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver5 = new ChromeDriver();
		driver5.manage().window().maximize();
		driver5.get(
				"https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Thread.sleep(3000);
		WebElement Passport_office = driver5.findElement(By.id("dcdrLocation"));
		Select sc4 = new Select(Passport_office);
		sc4.selectByValue("5");
		Thread.sleep(3000);
		
		WebElement date_icon = driver5.findElement(By.xpath("//tbody/tr[6]/td[2]/img[1]"));
		date_icon.click();
		WebElement month = driver5.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select sc5 = new Select(month);
		sc5.selectByValue("5");
		Thread.sleep(5000);
		WebElement year = driver5.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
		Select sc6 = new Select(year);
		sc6.selectByValue("1929");
		Thread.sleep(5000);
		driver5.findElement(By.xpath("(//a[@class='ui-state-default'])[16]")).click();
		Thread.sleep(5000);
		
		
	}

}
