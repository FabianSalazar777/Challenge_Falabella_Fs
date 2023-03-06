package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;


public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;


    @Before
    public void setUp()  {
        numberOfCase++;
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        System.out.println("Se está ejecutando el escenario nro: "+numberOfCase);
        driver = driverManager.getDriver();
        driver.get("https://www.falabella.com/falabella-cl");




    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }


}