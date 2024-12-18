package day2.HooksRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Set the attributes to @CucumberOptions with features, glue, monochrome, publish
@CucumberOptions(features="src/test/java/day2/Hooksfeature/CreateLead.feature",
glue={"day2.StepDifinition","day2.Hooks"},publish=true,monochrome=true)

//Create a RunnerClass extends AbstractTestNGCucumberTests
public class CreateRunner extends AbstractTestNGCucumberTests{

}
	