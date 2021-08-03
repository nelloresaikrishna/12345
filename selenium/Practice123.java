package com.selenium;

import org.openqa.selenium.WebElement;

public class Practice123 extends Base_Class {
	
	public static void main(String[] args) {
		
		browerLaunch("edge");
		geturl("https://www.facebook.com");
		WebElement email = findElement(1, "email");
		textBox(email, "hello sai");
		
		
	}
	

	
	
	
	

}
