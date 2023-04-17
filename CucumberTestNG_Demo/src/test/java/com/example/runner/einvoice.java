
 package com.example.runner;  
 import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;  
 

 @RunWith(Cucumber.class)

 @CucumberOptions(  features = "src/test/resources/Features/E-invoice.feature",   
  glue = "src/test/java/com/example/definitions/Einvoice.java",   
//  plugin = { "pretty", "html:target/cucumber-report" }, 
  
  

		  plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
					"html:target/cucumber"},
		  
		   monochrome = true)
 
 public class einvoice {  
 } 
 
 