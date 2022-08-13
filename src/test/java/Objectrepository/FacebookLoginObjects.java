package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginObjects {
    WebDriver driver;

    public FacebookLoginObjects(WebDriver driver) {
        this.driver=driver;
    }

    //Page objects
    By userName = By.id("email");
    By password = By.id("pass");
    By loginButton = By.xpath("//button[@type='submit']");

    //Page methods
    public WebElement userNameTextField() {
       return driver.findElement(userName);
    }

    public WebElement passwordTextField() {
        return driver.findElement((password));
    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }
}