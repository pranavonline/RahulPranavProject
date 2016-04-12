package Rahul.BDDProject.Util;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Rahul/BDDProject/Resources/MyFirstFeature.feature"}
		// To execute all features features = {"src/test/java/Rahul/BDDProject/Resources"}
		// To execute specific feature features = {"src/test/java/Rahul/BDDProject/Resources/MyFirstFeature.feature"}
		,plugin = {"pretty","html:target/cucumber"}
		,glue = {"Rahul.BDDProject.Util", "Rahul.BDDProject.StepDefinitions"}
)
public class RunCukeTest {
}