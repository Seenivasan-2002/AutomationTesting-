package day2.staticrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Set the attributes to @CucumberOptions with features, glue, monochrome, publish
@CucumberOptions(features="src/test/java/day2/staticfeature/Static.feature",

//Create a RunnerClass extends AbstractTestNGCucumberTests
glue="day2.staticsteps",publish=true,monochrome=true)
public class Runner extends AbstractTestNGCucumberTests{

}
