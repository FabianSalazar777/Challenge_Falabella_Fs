package runner.browser_manager;

//manejador de navegadores, si quisiera incorporar otros drivermanager, solo debo agregar en los case
//y además agregarlo en los drivertype, claramente debe estar su ejecutable correspondiente a dicho navegador.

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            default:
                System.out.println("invalid browser selected");
                break;
        }
        return driverManager;
    }

}