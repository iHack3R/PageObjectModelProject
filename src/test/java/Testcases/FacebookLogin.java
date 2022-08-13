package Testcases;

import Objectrepository.FacebookLoginObjects;
import Objectrepository.FacebookLoginObjectsFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
    String url = "https://en-gb.facebook.com/";
    String username = "udit247@gmail.com";
    String password = "1234567890";

    @Test
    public void login() {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +  "/BrowserDrivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get(url);

        //FacebookLoginObjects loginObjects = new FacebookLoginObjects(driver);

        //loginObjects.userNameTextField().sendKeys(username);
        //loginObjects.passwordTextField().sendKeys(password);
        //loginObjects.loginButton().click();

        FacebookLoginObjectsFactory loginObjectsFactory = new FacebookLoginObjectsFactory(driver);

        loginObjectsFactory.userNameTextField().sendKeys(username);
        loginObjectsFactory.passwordTextField().sendKeys(password);
        loginObjectsFactory.loginButton().click();
        driver.close();
    }
}