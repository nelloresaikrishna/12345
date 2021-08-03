package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("======Web Table data =======");
		List<WebElement> all_data = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		for (WebElement data : all_data) {
			System.out.println(data.getText());
			
		}
		System.out.println("===== Particular Row");
		List<WebElement> P_row = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]//td"));
		for (WebElement row : P_row) {
			System.out.println(row.getText());
			
		}
		System.out.println("===== Particular Column");
		List<WebElement> P_col = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[2]"));
		for (WebElement col : P_col) {
			System.out.println(col.getText());
			
		}
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("window.scrollBy(0, 400)");
		
		
		

	}

}
