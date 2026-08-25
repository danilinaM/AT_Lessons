package alfa.lesson19.cucumber.runner;


import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("lesson19")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "alfa.lesson19.cucumber.steps")
@ConfigurationParameter(
        key = Constants.PLUGIN_PROPERTY_NAME,
        value = "pretty, html:build/cucumber-report/lesson19/report.html")
public class RunFormAuthenticationCucumberTest {
}
