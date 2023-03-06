package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

//Instacia del driver para crear el ambiente para la ejecución de los casos de prueba.

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    //antes de la ejecución del hooks instancia el driver, también se contabiliza que caso de prueba es,
    @Before
    public void setUp()  {

        numberOfCase++;
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        System.out.println("Se está ejecutando el escenario nro: "+numberOfCase);
        driver = driverManager.getDriver();
        driver.get("https://www.falabella.com/falabella-cl");

    }
 //luego de la ejecución del escenario, si falla el caso saca un screenshot y si es exitosa la ejecución también.

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