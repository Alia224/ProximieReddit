package com.proximie.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features/",

		glue = "com.proximie.steps",

		dryRun = false,

		plugin = {

				"pretty",

				"html:target/cucumber-default-report.html",

				"json:target/cucumber.json",

				"rerun:target/failed.txt", })

public class TestRunner {

}
