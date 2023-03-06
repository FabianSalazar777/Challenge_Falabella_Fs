package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//Ejecución del caso de prueba que agrega un producto al carro de compra.

public class TestAgregarProducto extends TestBase{

    @Given("^El usuario se encuentra en la página home de Falabella$")
    public void elUsuarioSeEncuentraEnLaPáginaHomeDeFalabella() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnVentanaEmergente();
        Assert.assertTrue("No se redirecciono correctamente al home", homePage.homePageIsDisplayed());

    }

    @When("^Hace clic sobre el botón del menú en el home$")
    public void haceClicSobreElBotónDelMenúEnElHome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnMenu();

    }

    @Then("^Se debe poder seleccionar un producto de la categoría seleccionada$")
    public void seDebePoderSeleccionarUnProductoDeLaCategoríaSeleccionada() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.mouseHoverCategoriaCelularPlanes();
        homePage.clickOnCategoriaCelularesSmartphones();
        homePage.clickOnProducto();
        homePage.clickOnAgregarAlCarro();

    }


}