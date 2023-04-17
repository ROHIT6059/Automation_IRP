
 package com.example.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

 @CucumberOptions(  features = "src/test/resources/Features/sinupp.feature",   
  glue = "src/test/java/com/example/definitions/sinup",   
//  plugin = { "pretty", "html:target/cucumber-reports", 
//  
//  
//
//		  //plugin = {  "pretty", "html:target/htmlreports",
//				  
//				 // "pretty", "json:target/cucumber-reports/Cucumber.json",
//					"junit:target/cucumber-reports/Cucumber.xml",
//					"html:target/cucumber"
//					},
//		  
//		   monochrome = true)



plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
monochrome = true )


 
 public class sinupRunTest {  
 } 
 
 