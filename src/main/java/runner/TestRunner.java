package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\002QDA744\\eclipse-workspace\\FreeCRMCucmber\\src\\main\\java\\feature\\login.feature"
		,glue= {"stepDefination"}
		,plugin= {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
			//{"pretty","html:test-output"}
		,monochrome=true
		
		)

public class TestRunner {

}
