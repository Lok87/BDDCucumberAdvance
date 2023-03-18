package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\resources\\features\\login.feature", glue = {
	 "steps" },
	 dryRun = false,
	 monochrome = true,
	 plugin = {"pretty", "pretty","html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json"}
	 )
	public class LoginRunner {
	}

