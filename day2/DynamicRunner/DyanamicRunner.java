package day2.DynamicRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Set the attributes to @CucumberOptions with features, glue, monochrome, publish
@CucumberOptions(features="src/test/java/day2/Dynamicfeature/Dynamic.feature",
glue="day2.DynamicSteps",publish=true,monochrome=true)

//Create a RunnerClass extends AbstractTestNGCucumberTests
public class DyanamicRunner extends AbstractTestNGCucumberTests{

}
