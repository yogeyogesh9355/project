package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.LinkedIn_login;

public class LinkedIn_login_steps {
	LinkedIn_login login= new LinkedIn_login();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser()  {
		login.googlepage()
	    // Write code here that turns the phrase above into concrete actions
	    ;
	}

	@When("^the user opens LinkedIn homepage$")
	public void the_user_opens_LinkedIn_homepage() throws InterruptedException  {
		login.LinkedIn_loginuser();
	    // Write code here that turns the phrase above into concrete actions
  
	}

	@When("^the user enters the user name and password$")
	public void the_user_enters_the_user_name_and_password() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		login.LinkedIn_loginpwd();
	}

	@Then("^the user should click on sign in button$")
	public void the_user_should_click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.signin();
	}

}
