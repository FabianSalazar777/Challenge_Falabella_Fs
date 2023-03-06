package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.CarritoDeCompraPage;
import pom.HomePageFalabella;

//inicializa el hooks para obtener el driver que va a crear los objetos de mis páginas.

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePageFalabella homePage = new HomePageFalabella(driver);
    protected CarritoDeCompraPage carritoDeCompra = new CarritoDeCompraPage(driver);

}