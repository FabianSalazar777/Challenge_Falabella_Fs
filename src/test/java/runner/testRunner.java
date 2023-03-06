package runner; //punto de partida para que se ejecuten nuestras automatizaciones


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"seleniumgluecode"}
)



public class testRunner {

}
