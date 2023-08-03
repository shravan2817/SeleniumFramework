package com.proName.registrationtests;

import org.testng.annotations.Test;

import com.tests.BaseClass;

import Elements.RegistrationPage2;

public class RegistrationTest extends BaseClass {
	@Test
	public void checkReg() {
		//steps
		RegistrationPage2 rp=new RegistrationPage2();
		rp.getFirstName().sendKeys("jgc");
		

		if(driver.getPageSource().contains("Dear shravan Sunny Thankyou for registering")){
			System.out.println("Logged in ");
		}

	}

}
