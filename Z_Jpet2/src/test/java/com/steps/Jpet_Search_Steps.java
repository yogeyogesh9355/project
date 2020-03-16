package com.steps;

import java.io.IOException;

import com.main.Jpet_Search;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_Search_Steps {
	Jpet_Search search=new Jpet_Search();
	@Given("launch an chrome browser for search")
	public void launch_browser() {
		search.LaunchBrowser6();
	}
	
	@When("the user opens Jpet homepage for search")
	public void application_homepage2() {
		search.ApplicationHomePage6();
	}
	@Then("enter text in search textbox")
	public void search() {
		search.search();
	}
	@And("take a screenshot of search result")
	public void screenshot() throws IOException {
		search.takescreenshot6("C:\\Users\\Balaji\\Desktop\\Z_Jpet2\\src\\test\\resources\\screenshot\\search.png");
	}
}
