package SstepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
	 
		@RunWith(Cucumber.class)
		@CucumberOptions(features="src\\test\\resources\\Features", glue={"SstepDefinition"},
		monochrome= true,
		plugin= {"pretty", "junit:target/JUnitReports/reports.xml"})
		public class TestRunner {

		
	
}
