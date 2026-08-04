package alfa.lesson16.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void printScenarioName(Scenario scenario) {
        System.out.println("Имя сценария : " + scenario.getName());
    }

    @After
    public void printScenarioStatus(Scenario scenario) {
        System.out.println("Сценарий прошел : " + !scenario.isFailed());
    }
}
