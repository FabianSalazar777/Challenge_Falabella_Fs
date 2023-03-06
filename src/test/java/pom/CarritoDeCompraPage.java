package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// locators y acciones relacionadas al carrito de compra de falabella

public class CarritoDeCompraPage extends BasePage {

    private By montoDelProductoLocator = By.xpath("//div[@class='jsx-4088728460 price price-2']");
    private By montoFinalCarritoLocator = By.xpath("//span[@data-testid='total-amount']");


    public CarritoDeCompraPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getMonto_producto () throws Exception {
        WebElement listaPrecios = findElement(montoDelProductoLocator);
        List<WebElement> options = listaPrecios.findElements(montoDelProductoLocator);
        return options;
    }
    public List<WebElement> getMonto_FinalCarrito () throws Exception {
        WebElement listaPrecios = findElement(montoFinalCarritoLocator);
        List<WebElement> options = listaPrecios.findElements(montoFinalCarritoLocator);
        return options;
    }

    public String limpiarCaracteres(String element){
        String str = element;
        String charsToRemove = " $.";
        for (char c : charsToRemove.toCharArray()) {
            str = str.replace(String.valueOf(c), "");
        }
        return str;
    }

}



