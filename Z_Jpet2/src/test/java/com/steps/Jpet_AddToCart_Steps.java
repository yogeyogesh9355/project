package com.steps;

import java.io.IOException;

import com.main.Jpet_AddToCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_AddToCart_Steps {
	Jpet_AddToCart cart=new Jpet_AddToCart();
	@Given("launch an chrome browser for add a product to cart to")
	public void launchbrowser11() {
		cart.LaunchBrowser1();	
	}
@When("launch application homepage for add to cart from")
public void jpethomepage11() {
	cart.ApplicationHomePage1();
}
	@Then("Add a product to cart")
	public void addtocart11() {
		cart.addtocart1();
	}
	@And("Take a screenshot for add to cart")
	public void screenshott11() throws IOException {
		cart.takescreenshot1("C:\\Users\\Balaji\\Desktop\\Z_Jpet2\\src\\test\\resources\\screenshot\\addtocart.png");
	}
}
