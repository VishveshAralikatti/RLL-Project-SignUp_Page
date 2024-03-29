package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Mphasis\\SL\\ChilternOak_Automation\\src\\test\\java\\feature\\SignUp.feature",
glue = {"stepdefs"},
plugin = {"pretty","html:target/cucumber/report.html",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		  "timeline:test-output-thread/"},monochrome = true)
public class TestRunner {

	
}
