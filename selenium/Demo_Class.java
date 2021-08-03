package com.selenium;

import org.openqa.selenium.WebElement;

public class Demo_Class extends Base_Class {

	public static void main(String[] args) {

		browerLaunch("chrome");
		geturl("http://automationpractice.com/index.php");
		WebElement login = findElement(4, "//a[@class='login']");
		implicitwait(10);
		clickMethod(login);
		WebElement email = findElement(1, "email");
		textBox(email, "nelloresaikrishnacse@gmail.com");
		WebElement password = findElement(1, "passwd");
		textBox(password, "saiCSE123");
		WebElement login1 = findElement(1, "SubmitLogin");
		clickMethod(login1);
		WebElement dresses = findElement(4, "(//a[@title='Dresses'])[2]");
		getAction();
		mouseOver(dresses);
		WebElement casual_dresses = findElement(4, "(//a[@title='Casual Dresses'])[2]");
		mouseOver(casual_dresses);
		clickMethod(casual_dresses);
		WebElement image = findElement(4, "//img[@title='Printed Dress']");
		mouseOver(image);
		WebElement more = findElement(4, "//a[@title='View']");
		mouseOver(more);
		clickMethod(more);
		WebElement plus_button = findElement(4, "//i[@class='icon-plus']");
		clickMethod(plus_button);
		WebElement size = findElement(1, "group_1");
		select(size, 1, "2");
		WebElement Add_to_cart = findElement(4, "(//button[@type='submit'])[3]");
		clickMethod(Add_to_cart);
		WebElement proceed_1 = findElement(2, "Proceed to checkout");
		clickMethod(proceed_1);
		WebElement proceed_2 = findElement(2, "Proceed to checkout");
		clickMethod(proceed_2);
		WebElement text_area = findElement(4, "//textarea[@class='form-control']");
		textBox(text_area, "Thank you");
		WebElement proceed_3 = findElement(4, "//*[@id=\"center_column\"]/form/p/button/span");
		clickMethod(proceed_3);
		WebElement agree = findElement(1, "cgv");
		clickMethod(agree);
		WebElement proceed_4 = findElement(4, "(//button[@type='submit'])[2]");
		clickMethod(proceed_4);
		WebElement cheque = findElement(4, "//a[@class='cheque']");
		clickMethod(cheque);
		WebElement confirm_my_order = findElement(4, "(//button[@type='submit'])[2]");
		clickMethod(confirm_my_order);
		close_Window();
		
		
		
		
	

	}

}
