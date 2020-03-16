package com.steps;

import java.io.IOException;

import com.main.Jpet_SignIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_SignIn_Steps {
	Jpet_SignIn google = new Jpet_SignIn();
@Given("launch an chrome browser for signin")
public void LaunchBrowser() {
	google.LaunchBrowser7();
}
@When("launch application homepage for signin")
public void applicationhomepage() {
	 google.ApplicationHomePage7();
}

@Then("enter username and password in signin page")
public void signin() throws IOException, InterruptedException {
	google.EnterSignInDetails();
}
}