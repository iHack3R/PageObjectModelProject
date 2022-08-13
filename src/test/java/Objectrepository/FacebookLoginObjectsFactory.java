package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginObjectsFactory {
    WebDriver driver;

    public FacebookLoginObjectsFactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    WebElement userName;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public WebElement userNameTextField() {
       return userName;
    }

    public WebElement passwordTextField() {
        return password;
    }

    public WebElement loginButton() {
        return loginButton;
    }
}