package week6.Assignment1.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Set the attributes to @CucumberOptions with features, glue, monochrome, publish
@CucumberOptions(features="./src/test/java/week6/Assignment1/feature/Cumcumber.feature",
glue="week6.Assignment1.Steps",publish=true,monochrome=true)

//Create a RunnerClass extends AbstractTestNGCucumberTests
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
