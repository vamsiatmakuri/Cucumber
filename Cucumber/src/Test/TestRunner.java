package Test;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Testfeature"
		,glue={"stepDefinition.Test"}
		)
 
public class TestRunner {
 
}