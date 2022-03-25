package Runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner_class {

	@CucumberOptions(features = {
	"src/test/resources/Features/Search_Macys" }, glue = { "Macys_Final_Project.step_defination" }, tags = { "@chrome", "@smoke" }, plugin = {"pretty", "html:target/maven-status/maven-compiler-plugin/testCompile/default-testCompile" }, monochrome = true)

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
