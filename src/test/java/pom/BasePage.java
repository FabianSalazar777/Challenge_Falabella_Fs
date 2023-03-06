package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/* esta clase es utilizada para el manejo de las funcionalidades de selenium que utilizaremos para los test a
   realizar en cada escenario, esta es una forma de optimizar la mantenibilidad del código en
   un caso que a futuro selenium cambie sus metodos. */

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void click (By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se pudo cliclear sobre el elemento: " + element);
        }
    }
    public void click (WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception e) {
            throw new Exception("No se pudo cliclear sobre el elemento: " + element);
        }
    }

    public boolean isDisplayed (By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar del elemento: " + element);
        }
    }

    public String getText (By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }
    public String getText (WebElement element) throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el título del driver ");
        }
    }


    public WebElement findElement(By element) throws Exception {
        try {
            return driver.findElement(element);
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el título del elemento: " + element);
        }
    }
    public void mouseHover(By element) throws Exception {
        try {
            WebElement mouseHoverElement = driver.findElement(element);
            Actions act = new Actions(driver);
            act.moveToElement(mouseHoverElement).perform();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el título del elemento: " + element);
        }
    }
    public void bajarScroll() throws Exception {
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scroll(0,600)");

        } catch (Exception e) {
            throw new Exception("No se pudo bajar el scroll " );
        }
    }

}


