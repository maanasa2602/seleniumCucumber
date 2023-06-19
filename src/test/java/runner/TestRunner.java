package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/LoginTest.feature", glue = "runner")
public class TestRunner {

}










//This page depicts the runner file of this cucumber project