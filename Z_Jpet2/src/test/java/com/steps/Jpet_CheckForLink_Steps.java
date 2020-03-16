package com.steps;

import com.main.Jpet_CheckForLink;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Jpet_CheckForLink_Steps {
	Jpet_CheckForLink link = new Jpet_CheckForLink();
	@Given("launch an chrome browser for check")
	public void launchbrowser() {
		link.LaunchBrowser2();
	}
	@When("the user opens Jpet homepage for check")
	public void Application_homepage1() {
		link.ApplicationHomePage2();
	}
	@And("The user checks for link")
	public void printtable() {
		link.checkforlink();
	}
}
