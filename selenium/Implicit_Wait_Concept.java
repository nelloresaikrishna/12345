package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicit_Wait_Concept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Sign_in = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		Sign_in.click();
		
		WebElement Enter_mail_address = driver.findElement(By.id("email_create"));
		Enter_mail_address.sendKeys("nelloresaikrishnacse@gmail.com");
		
		WebElement Create_account = driver.findElement(By.id("SubmitCreate"));
		Create_account.click();
		
		WebElement Radio_button = driver.findElement(By.id("id_gender1"));
		Radio_button.click();
		
		WebElement First_name = driver.findElement(By.id("customer_firstname"));
		First_name.sendKeys("Nellore");
		
		WebElement Last_name = driver.findElement(By.id("customer_lastname"));
		Last_name.sendKeys("Saikrishna");
		
		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("saiCSE123");
		
		WebElement Day = driver.findElement(By.id("days"));
		Select sc = new Select(Day);
		sc.selectByValue("16");
		
		WebElement Month = driver.findElement(By.id("months"));
		Select sc1 = new Select(Month);
		sc1.selectByValue("10");
		
		WebElement Year = driver.findElement(By.id("years"));
		Select sc2 = new Select(Year);
		sc2.selectByValue("1996");
		
		//Address
		WebElement A_Firstname = driver.findElement(By.id("firstname"));
		A_Firstname.sendKeys("Nellore");
		
		WebElement A_lastname = driver.findElement(By.id("lastname"));
		A_lastname.sendKeys("Saikrishna");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("NELLORE SAIKRISHNA TELUGU TECH");
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("Vegur");
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("kovur");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Nellore");
		
		WebElement State = driver.findElement(By.id("id_state"));
		Select Sc3 = new Select(State);
		Sc3.selectByValue("47");
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("98001")
		;
		WebElement Country = driver.findElement(By.id("id_country"));
		Select Sc4 = new Select(Country);
		Sc4.selectByValue("21");
		
		WebElement other = driver.findElement(By.id("other"));
		other.sendKeys("USA");
		
		WebElement Home_phone = driver.findElement(By.id("phone"));
		Home_phone.sendKeys("9989145700");
		
		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("8072077747");
		
		WebElement Register = driver.findElement(By.id("submitAccount"));
		Register.click();
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File target = tc.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\img123.png");
		FileUtils.copyDirectory(target, Destination);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
