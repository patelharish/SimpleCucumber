package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/SearchDemo.feature", 
glue= {"StepDefinations"},
monochrome= false,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
				"html:target/HtmlReports"}
		)


public class TestRunner {

}
