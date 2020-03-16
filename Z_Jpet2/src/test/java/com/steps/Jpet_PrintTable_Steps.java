package com.steps;

import com.main.Jpet_PrintTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Jpet_PrintTable_Steps {
	Jpet_PrintTable print=new Jpet_PrintTable();
@Given("launch an chrome browser for print table")
public void launchbrowser() {
	print.LaunchBrowser4();
}
@When("the user opens Jpet homepage for print table")
public void Application_homepage() {
	print.ApplicationHomePage4();
}
@And("print the product list table")
public void printtable() {
	print.print_table();
}
}
