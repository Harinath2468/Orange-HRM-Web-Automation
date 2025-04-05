package cucumber.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber/options",glue="stepdefinitions", 
tags="@LoginValidation", plugin= {"html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
