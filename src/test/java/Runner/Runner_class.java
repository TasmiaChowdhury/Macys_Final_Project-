package Runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner_class {

	@CucumberOptions(plugin = { "pretty", "html:target/reports/report.html", "json:target/reports/report.json" }, features = {
	"src/test/resources/Features" }, glue = { "Macys_Final_Project.step_defination" }, tags = { "@chrome" }, monochrome = true)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

@BeforeTest
public void beforeTest() {
	System.out.println("... Test STarted ...");
}

@AfterTest
public void afterTest() {
	System.out.println("... Test Completed ...");
}
}
}
