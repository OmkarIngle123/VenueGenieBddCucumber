package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {

	@CucumberOptions(
			features = {"./src/test/java"},
			glue = "stepDefinations",
			dryRun = false,
			monochrome = true,
			
			 plugin = {
							"pretty","html:target/HTMLReport/report.html"
					}	
			)
	public class runner extends AbstractTestNGCucumberTests{

	}
	
}
