package seleniumgluecode;

//inicializa el hooks para obtener el driver y va a crear los objetos de mis páginas.

import org.openqa.selenium.WebDriver;
import pom.CarritoDeCompraPage;
import pom.HomePageFalabella;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePageFalabella homePage = new HomePageFalabella(driver);
    protected CarritoDeCompraPage carritoDeCompra = new CarritoDeCompraPage(driver);

}