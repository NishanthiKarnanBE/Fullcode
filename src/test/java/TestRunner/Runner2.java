package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Features"},
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = {"StepDefinition", "Hooks"},
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//        plugin = {"pretty", "html:Reports/CucumberReport.html",
//                       "json:Reports/CucumberReport.json",
//                       "junit:Reports/CucumberReport.xml"},
        tags="@Failure"
)
public class Runner2 extends AbstractTestNGCucumberTests {

}
