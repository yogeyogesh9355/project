package com.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Z_Jpet2/src/main/resources/Jpet.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"tc02_Jpet_SignIn"},
		glue = {"steps"},
		monochrome = true
		)
public class Jpet_SignIn_Runner {

}
