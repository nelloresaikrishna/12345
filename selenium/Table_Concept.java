package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("=======Web Table======");
		List<WebElement> all_data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td"));
		for (WebElement data : all_data) {
			System.out.println(data.getText());

		}
		System.out.println("====Particular Row======");
		List<WebElement> p_row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr[3]//td"));
		for (WebElement row : p_row) {
			System.out.println(row.getText());

		}
		System.out.println("====Particular column======");
		List<WebElement> p_col = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td[1]"));
		for (WebElement Col : p_col) {
			System.out.println(Col.getText());

		}

	}

}
