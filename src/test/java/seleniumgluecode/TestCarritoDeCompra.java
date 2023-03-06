package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class TestCarritoDeCompra extends TestBase{

    @Given("^El usuario selecciona un producto$")
    public void elUsuarioSeleccionaUnProducto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnVentanaEmergente();
        homePage.clickOnMenu();
        homePage.mouseHoverCategoriaCelularPlanes();
        homePage.clickOnCategoriaCelularesSmartphones();
        homePage.clickOnProducto();
    }

    @When("^Hace clic en añadir al carro el producto$")
    public void haceClicEnAñadirAlCarroElProducto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnAgregarAlCarro();
    }

    @Then("^Se debe validar que el precio del producto es igual al total del carro de compras$")
    public void seDebeValidarQueElPrecioDelProductoEsIgualAlTotalDelCarroDeCompras() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        carritoDeCompra.getMonto_producto();
        carritoDeCompra.getMonto_FinalCarrito();
        Assert.assertEquals("los precios no son iguales", carritoDeCompra.limpiarCaracteres(carritoDeCompra.getMonto_FinalCarrito().get(0).getText()),carritoDeCompra.limpiarCaracteres(carritoDeCompra.getMonto_producto().get(0).getText()));

    }

}