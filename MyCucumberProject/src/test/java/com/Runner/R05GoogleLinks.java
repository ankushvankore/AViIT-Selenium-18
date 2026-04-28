package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05GoogleLink.feature", 
					glue = "com.StepDefinition",
					tags = "@AllLinks")
public class R05GoogleLinks {
	/*
	 * Execute Single Scenario:			tags = "@GmailLink"
	 * Execute Multiple Scenarios:		tags = "@GmailLink or @AboutLink"
	 * Skip Single Scenario:			tags = "not @StoreLink"
	 * Skip Multiple Scenarios:			tags = "not @StoreLink and not @ImagesLink"
	 * Execute All Scenarios:			tags = "@AllLinks"			
	 */
}
