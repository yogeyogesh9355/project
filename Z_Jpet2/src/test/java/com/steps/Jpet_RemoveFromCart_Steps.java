package com.steps;

import com.main.Jpet_RemoveFromCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_RemoveFromCart_Steps {
	Jpet_RemoveFromCart cart=new Jpet_RemoveFromCart();
	@Given("launch an chrome browser for add a product to cart as")
	public void launchbrowser() {
		cart.LaunchBrowser5();	
	}
@When("launch application homepage to add to cart and remove")
public void jpethomepage() {
	cart.ApplicationHomePage5();
}
	@Then("Add a product to cart to remove")
	public void addtocart() {
		cart.addtocart5();
	}
	@And("Take a screenshot of cart to remove cart")
	public void RemoveFromCart() {
		cart.removefromcart();
	}
}
