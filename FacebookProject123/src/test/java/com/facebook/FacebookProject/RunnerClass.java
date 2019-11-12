package com.facebook.FacebookProject;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, glue = "com.facebook.FacebookProject",
monochrome = true, plugin = {"html:target/cucumber-html-report" })

public class RunnerClass {

}
