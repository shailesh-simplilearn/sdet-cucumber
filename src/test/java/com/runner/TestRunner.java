package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Scenario",
glue = {"stepdef"}
/*plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}*/

)

public class TestRunner {
	/*
	 * @AfterClass public static void writeReport() { Reporter.loadXMLConfig(new
	 * File(
	 * "/home/shailthesweeter/eclipse-workspace/temp-cucumber/extent-config.xml"));
	 * }
	 */

}
