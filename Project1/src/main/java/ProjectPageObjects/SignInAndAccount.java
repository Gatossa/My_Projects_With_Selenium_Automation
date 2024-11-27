package ProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInAndAccount {


    public WebDriver driver;
    By signInBtn = By.cssSelector(".user-info .hidden-sm-down");
    By emailField = By.cssSelector("input#field-email");
    By passwordField = By.cssSelector("input#field-password");
    By singInBtn2 = By.cssSelector( "button#submit-login");
    By heading =By.cssSelector( "h1");
    By signOutBtn =By.cssSelector( ".hidden-sm-down.logout");


    public SignInAndAccount(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickSignIn() {
        return driver.findElement(signInBtn);
    }

    public WebElement fillInEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement fiiInPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement clickBtn2() {
        return driver.findElement(singInBtn2);
    }

    public WebElement clickHeading() {
        return driver.findElement(heading);
    }


    public WebElement clickSignOut() {
        return driver.findElement(signOutBtn);
    }

}