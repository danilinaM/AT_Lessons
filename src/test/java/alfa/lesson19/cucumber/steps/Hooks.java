package alfa.lesson19.cucumber.steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
    }

    @Before
    public void printScenarioName(Scenario scenario) {
        System.out.println("Имя сценария : " + scenario.getName());
    }
}
