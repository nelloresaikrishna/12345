package com.selenium;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.pom.adactin.Final_Receipt_Page1;
import com.pom.adactin.Hotel_Availability_Page;
import com.pom.adactin.Hotel_Booking_Page;
import com.pom.adactin.Login_Page;
import com.pom.adactin.Search_Hotel_Page;

public class Adactin_Automation_Practice extends Base_Class {

	public static void main(String[] args) throws Throwable {
		
		browerLaunch("chrome");
		geturl("https://adactinhotelapp.com/");
		implicitwait(10);
		Login_Page lp = new Login_Page(driver);
		textBox(lp.getUsername(), "saiCSE12");
		textBox(lp.getPassword(), "saiCSE12");
		clickMethod(lp.getLoginButton());
		Search_Hotel_Page sh = new Search_Hotel_Page(driver);
		select(sh.getLocation(), 1, "Melbourne");
		select(sh.getHotels(), 1, "Hotel Sunshine");
		select(sh.getRoom_type(), 1, "Super Deluxe");
		select(sh.getRoom_nos(), 1, "4");
		textBox(sh.getCheck_In(), "09/05/2021");
		textBox(sh.getCheck_Out(), "12/05/2021");
		select(sh.getAdult_room(), 1, "3");
		select(sh.getChild_room(), 1, "3");
		clickMethod(sh.getSubmit());
		Hotel_Availability_Page hap = new Hotel_Availability_Page(driver);
		clickMethod(hap.getSelect_Radio_button());
		clickMethod(hap.getContinue_Button());
		Hotel_Booking_Page hbp = new Hotel_Booking_Page(driver);
		textBox(hbp.getFirst_name(), "Nellore");
		textBox(hbp.getLast_name(), "Saikrishna");
		textBox(hbp.getAddress(), "Nellore");
		textBox(hbp.getCc_num(), "1234567890123456");
		select(hbp.getCc_type(), 1, "VISA");
		select(hbp.getCc_exp_month(), 1, "3");
		select(hbp.getCc_exp_year(), 1, "2013");
		textBox(hbp.getCc_cvv(), "234");
		clickMethod(hbp.getBook_now());
		Final_Receipt_Page1 frp = new Final_Receipt_Page1(driver);
		scrollBy("window.scrollBy(0,400)");
		scrollToElement(frp.getOrder_id());
		takeScreenshot("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Selenium\\Screenshot\\hotelorderid.png");
		clickMethod(frp.getLogout());
		close_Window();
		
		
		
		
		
		
		
	
		
		
		
		
		
	

	}

}
