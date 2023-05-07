package stepDefinitions;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hook extends Config {
    WebDriver driver;
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");
    //QA : http://www.qa.taltektc.com
    //Stage: http://www.stage.taltektc.com
    //PROD: http://www.prod.taltektc.com

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = setupBrowser(driverType);
        switch(envType){
            case "qa":
                url ="https://ecommerce-playground.lambdatest.io/index.php?route=common/home";
                break;
            case "stage":
                url ="http://www.stage.taltektc.com";
                break;
            case "prod":
                url ="http://www.prod.taltektc.com";
                break;
        }
        driver.get(url);

    }

    @After
    public void afterTest(){
        //driver.quit();
    }

}
