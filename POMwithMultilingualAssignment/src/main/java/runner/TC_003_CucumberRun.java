package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/AccountandLead.feature",
glue="pages",publish=true,monochrome=true)

public class TC_003_CucumberRun extends ProjectSpecificMethod {

}
