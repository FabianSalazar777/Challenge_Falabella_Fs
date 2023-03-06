package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

import static cucumber.api.SnippetType.CAMELCASE;

//Esta clase lo que hace es generar un ejecutable utilizando las propiedades de cucumber.

@RunWith(Cucumber.class) //ejecuto con cucumber

//configuraciones para la ejecución de cucumber, donde iré a buscar los feature, que propiedades utilizaré para ejecutarlo(Glue), plugin para el reporte
//con nodejs y un snippets para la creación de los metodos de cucumber en camelcase.

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"seleniumgluecode"},
        plugin = {"json:TestExecution/report/Challenge_report.json"},
        tags = {"@Ejecutalo","~@NoEjecutar"},
        snippets = CAMELCASE

)
public class TestRunner {
    // creación del log.
    private static final Logger LOGGER = LogHelper.getLogger(TestRunner.class);

    @BeforeClass()
    public static void setUp(){
        LOGGER.log(Level.INFO, "La ejecución del test comenzó...");
    }

    //luego de la ejecución de esta clase, se corre el reporte atraves de nodejs con esos comandos en la cmd.
    @AfterClass
    public static void teardown(){
        try {
            LOGGER.log(Level.INFO, "Generando el reporte...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "Reporte creado exitosamente!");
        }catch (Exception ex){
            LOGGER.log(Level.WARNING, "No se pudo generar el reporte");
            ex.printStackTrace();
        }
    }

}