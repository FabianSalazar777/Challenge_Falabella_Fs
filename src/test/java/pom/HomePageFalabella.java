package pom;

import static java.lang.Thread.sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// locators y acciones relacionadas al home de falabella

public class HomePageFalabella extends BasePage {


    private By logoHomePageLocators = By.id("testId-logo-btn");
    private By ventanaEmergenteLocator = By.className("dy-lb-close");
    private By homeMenuLocator = By.cssSelector(".MarketplaceHamburgerBtn-module_title__2KG47");
    private By menuCategoriaCelularPlanesLocator = By.xpath("//div[text()='Celulares y planes']");
    private By menuSubCategoriaCelularesSmartphones = By.xpath("//a[text()='Smartphones']");
    private By celularSeleccionLocator = By.id("testId-pod-displaySubTitle-121217397");
    private By botonAgregarAlCarroLocator = By.id("buttonForCustomers");
    private By botonLiberadoLocator = By.id("testId-Operator-Liberado");
    private By botonIrAlCarro = By.id("linkButton");


// Instancia de la página home con Webdriver
    public HomePageFalabella(WebDriver driver) {

        super(driver);
    }

    //acciones que se utilizarán dentro de la página home de falabella (métodos)

    public boolean homePageIsDisplayed() throws Exception {
        sleep(500);
        return this.isDisplayed(logoHomePageLocators);
    }

    public void clickOnVentanaEmergente() throws Exception {
        sleep(500);
        this.mouseHover(ventanaEmergenteLocator);
        this.click(ventanaEmergenteLocator);
    }
    public void clickOnMenu() throws Exception {
        sleep(500);
        this.click(homeMenuLocator);
    }
    public void mouseHoverCategoriaCelularPlanes() throws Exception {
        sleep(500);
        this.mouseHover(menuCategoriaCelularPlanesLocator);
    }

    public void clickOnCategoriaCelularesSmartphones() throws Exception {
        sleep(500);
        this.click(menuSubCategoriaCelularesSmartphones);
    }

    public void clickOnProducto() throws Exception {
        this.bajarScroll();
        sleep(500);
        this.mouseHover(celularSeleccionLocator);
        sleep(500);
        this.click(celularSeleccionLocator);
    }
    public void clickOnAgregarAlCarro() throws Exception {
        this.bajarScroll();
        sleep(500);
        this.click(botonLiberadoLocator);
        sleep(500);
        this.mouseHover(botonAgregarAlCarroLocator);
        this.click(botonAgregarAlCarroLocator);
        sleep(2000);
        this.click(botonIrAlCarro);
    }


}