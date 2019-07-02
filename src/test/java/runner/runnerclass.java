package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sample5.feature"},
glue="stepdefinition", 
//plugin="html:target/htmlreporter")
//plugin="json:target/cucumber.json",
plugin="junit:target/xmlreport.xml")
//tags={"@aishu"," @appu"})
//tags={"@appu"})
public class runnerclass 
{
}
