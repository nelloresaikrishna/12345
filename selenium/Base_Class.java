package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browerLaunch(String Options) {
		try {

			if (Options.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("//drivers//chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (Options.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("//drivers//firefoxdriver.exe"));
				driver = new FirefoxDriver();

			} else if (Options.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + ("//drivers//msedgedriver.exe"));
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public static void navitageBack() {
		driver.navigate().back();
	}

	public static void navitageForward() {
		driver.navigate().forward();
	}

	public static void navitageRefresh() {
		driver.navigate().refresh();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertSendkeysAccept(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	// findElement
	public static WebElement findElement(int x, String path) {

		WebElement element = null;

		switch (x) {
		case 1:
			element = driver.findElement(By.id(path));

			break;
		case 2:
			element = driver.findElement(By.linkText(path));
			break;
		case 3:
			element = driver.findElement(By.name(path));
			break;
		case 4:
			element = driver.findElement(By.xpath(path));
			break;
		}

		return element;

	}

	// Select
	public static Select select(WebElement element, int x, String value) {
		Select sc = new Select(element);
		switch (x) {
		case 1:
			sc.selectByValue(value);
			break;

		case 2:
			sc.selectByIndex(x);
			break;

		case 3:
			sc.selectByVisibleText(value);
			break;
		}
		return sc;
	}

	// Actions
	public static Actions getAction() {
		Actions ac = new Actions(driver);
		return ac;
	}

	// textBox
	public static void textBox(WebElement element, String text) {
		element.sendKeys(text);

		getAction().sendKeys(text);

	}

	// Mouse over
	public static void mouseOver(WebElement element) {
		getAction().moveToElement(element).build().perform();

	}

	// click
	public static void clickMethod(WebElement element) {
		element.click();

	}

	// windows get titles
	public static Set<String> multipleWindowgetTitle() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String data : allWindows) {
			String title = driver.switchTo().window(data).getTitle();
			System.out.println(title);

		}
		return allWindows;

	}

	// windows handles
	public static Set<String> multipleWindowsText(String text) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String data : allWindows) {
			if (driver.switchTo().window(data).equals(text)) {
				break;
			}

		}
		return allWindows;
	}

	// is Selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	// is enabled
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	// is displayed
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	// getCurrentUrl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// getTitle
	public static String getTitle(String title) {
		String title1 = driver.getTitle();
		return title1;
	}

	// getTakesScreenShot
	public static TakesScreenshot takeScreenshot(String Path) throws Exception {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File target = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File(Path);
		FileUtils.copyFile(target, destination);

		return tc;

	}

	// implicitwait
	public static void implicitwait(int x) {

		driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);

	}

	// robot keyboard arrow action
	public static Robot robotAction(int x) throws Throwable {
		Robot rc = new Robot();
		rc = null;
		switch (x) {
		case 1:
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
			break;
		case 2:
			rc.keyPress(KeyEvent.VK_UP);
			rc.keyRelease(KeyEvent.VK_UP);
			break;

		case 3:
			rc.keyPress(KeyEvent.VK_ENTER);
			rc.keyRelease(KeyEvent.VK_ENTER);
			break;

		}
		return rc;

	}

	public static void close_Window() {
		driver.close();
	}
	
	public static void scrollBy(String scroll_value) {
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript(scroll_value);
	}
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].scrollIntoView();", element);
	}

}
