package com.selenium;

import com.pom.concept.Add_To_Cart_Page;
import com.pom.concept.Confirm_Payment_Page;
import com.pom.concept.Dresses_Selection_Page;
import com.pom.concept.Home_Page;
import com.pom.concept.Payment_Method;
import com.pom.concept.Proceed_To_Cart1;
import com.pom.concept.Proceed_To_Cart2;
import com.pom.concept.Proceed_To_Cart3;
import com.pom.concept.Proceed_To_Cart4;
import com.pom.concept.Sign_In_Page;

public class Automation_Practice extends Base_Class {

	public static void main(String[] args) throws Exception {
		browerLaunch("chrome");
		geturl("http://automationpractice.com/index.php");
		implicitwait(10);
		Home_Page hc = new Home_Page(driver);
		clickMethod(hc.getSignin());
		Sign_In_Page sp = new Sign_In_Page(driver);
		textBox(sp.getEmailId(), "nelloresaikrishnacse@gmail.com");
		textBox(sp.getPassword(), "saiCSE123");
		clickMethod(sp.getSignInButton());
		Dresses_Selection_Page ds = new Dresses_Selection_Page(driver);
		getAction();
		mouseOver(ds.getDresses());
		mouseOver(ds.getCasualDresses());
		clickMethod(ds.getCasualDresses());
		mouseOver(ds.getImage());
		mouseOver(ds.getMore());
		clickMethod(ds.getMore());
		Add_To_Cart_Page cart = new Add_To_Cart_Page(driver);
		clickMethod(cart.getPlus_Icon_Button());
		select(cart.getSize(), 1, "2");
		clickMethod(cart.getAddToCart());
		Proceed_To_Cart1 pc1 = new Proceed_To_Cart1(driver);
		clickMethod(pc1.getProceed_1());
		Proceed_To_Cart2 pc2 = new Proceed_To_Cart2(driver);
		clickMethod(pc2.getProceed_2());
		Proceed_To_Cart3 pc3 = new Proceed_To_Cart3(driver);
		textBox(pc3.getText_area(), "Thank you");
		clickMethod(pc3.getProceed_3());
		Proceed_To_Cart4 pc4 = new Proceed_To_Cart4(driver);
		clickMethod(pc4.getAgree());
		clickMethod(pc4.getProoceed_4());
		Payment_Method payment = new Payment_Method(driver);
		clickMethod(payment.getCheque());
		Confirm_Payment_Page Confirm_Payment = new Confirm_Payment_Page(driver);
		clickMethod(Confirm_Payment.getConfirmPayment());
		close_Window();
	
		

	}

}
