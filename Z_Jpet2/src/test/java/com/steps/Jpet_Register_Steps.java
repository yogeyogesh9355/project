package com.steps;

import java.io.IOException;

import com.main.Jpet_Register;

import cucumber.api.java.en.Given;

public class Jpet_Register_Steps {
	Jpet_Register google = new Jpet_Register ();

	@Given("enter all user details in register page")
	public void register() throws InterruptedException, IOException  {
		google.register();
	}
//	@And("click on save account information button")
//	public void SaveAccount() {
//		google.SaveAcc();
//	}
}
