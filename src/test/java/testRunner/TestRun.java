package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Features"},glue="stepDefinations", dryRun=false,
plugin={"pretty","html:test-output/htmlreport.html"})
public class TestRun extends AbstractTestNGCucumberTests{

}
