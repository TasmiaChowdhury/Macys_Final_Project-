package Runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Rubyat_Test_Runner {
	@CucumberOptions( features = {"src/test/resources/Features" }, 
			glue = { "Macys_Final_Project.step_defination" }, monochrome = true)

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
