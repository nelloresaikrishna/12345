package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Implicit_Concept_2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Sign_in = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		Sign_in.click();

		// Sign in
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nelloresaikrishnacse@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("saiCSE123");

		WebElement Login = driver.findElement(By.id("SubmitLogin"));
		Login.click();

		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Dresses).build().perform();

		WebElement Casual_Dresses = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		ac.moveToElement(Casual_Dresses).click().build().perform();

		WebElement Image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		ac.moveToElement(Image).build().perform();

		WebElement more = driver.findElement(By.xpath("//a[@title='View']"));
		ac.moveToElement(more).click().build().perform();

		WebElement Plus_option = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		Plus_option.click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select sc = new Select(size);
		sc.selectByValue("2");

		WebElement Add_to_cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		Add_to_cart.click();

		WebElement Proceed_To_Checkout = driver
				.findElement(By.linkText("Proceed to checkout"));
		Proceed_To_Checkout.click();

		WebElement Proceed_To_Checkout1 = driver
				.findElement(By.linkText("Proceed to checkout"));
		Proceed_To_Checkout1.click();
		
		WebElement text_area = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		text_area.sendKeys("Hello sai");
		
		WebElement proceed_before_agree = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		proceed_before_agree.click();
		

		WebElement Agree = driver.findElement(By.id("cgv"));
		Agree.click();
		
		WebElement Proceed_To_Checkout3 = driver
				.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Proceed_To_Checkout3.click();

		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		cheque.click();

		WebElement confirm_my_order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm_my_order.click();
		
		
		driver.close();


	}

}
