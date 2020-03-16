package com.steps;

import com.main.Jpet_PrintBill;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_PrintBill_Steps {
	Jpet_PrintBill print=new Jpet_PrintBill();
	@Given("launch an chrome browser for print bill")
	public void launchbrowser() {
		print.LaunchBrowser3();
	}
	@When("the user opens Jpet homepage for print bill")
	public void Application_homepage() {
		print.ApplicationHomePage3();
}
	@Then("the user proceeds to buy the product")
	public void proceedstoby() {
		print.ProceedToCheckout();
	}
	@And("Print the bill")
	public void printbill() {
		print.PrintBill();
	}
}
