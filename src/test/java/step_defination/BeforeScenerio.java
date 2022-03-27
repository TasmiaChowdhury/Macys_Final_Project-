package step_defination;

import Utilities.Set_Drivers;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeScenerio {
	@Before
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			Set_Drivers.setupChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}

	}
}
