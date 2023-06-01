package runner.browser_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//Clase para instanciar y ejecutar el chrome driver, aqui se le agregó configuraciones para ocultar las notificaciones
//que no dejaban captar algunos elementos web.

public class ChromeDriverManager extends DriverManager {

    @Override
    public  void createDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setAcceptInsecureCerts(true);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--suppress-message-center-popups");
        options.addArguments("--remote-allow-origins=*");
        options.merge(caps);
        driver = new ChromeDriver(options);

    }

}