package com.runner;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Reuse.Base;
import com.property.ConfigHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/feature",
glue={"hooks","com.stepdefinition"},tags="@Test",
plugin={"html:target/org.html","json:target/org.json"})
public class api_runner {


}
