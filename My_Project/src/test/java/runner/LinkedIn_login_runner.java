package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/LinkedIn.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@test1"},
		glue = {"steps"},
		monochrome = true
		
		)
public class LinkedIn_login_runner {

}
