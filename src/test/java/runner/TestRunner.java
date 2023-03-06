package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"seleniumgluecode"},
        plugin = {"json:TestExecution/report/Challenge_report.json"},
        snippets = CAMELCASE

)
public class TestRunner {


    @AfterClass
    public static void teardown(){
        try {
            //LOGGER.log(Level.INFO, "Generating report...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            //LOGGER.log(Level.INFO, "Report successfully generated!");
        }catch (Exception ex){
            //LOGGER.log(Level.WARNING, "The report could not be generated.");
            ex.printStackTrace();
        }
    }

}