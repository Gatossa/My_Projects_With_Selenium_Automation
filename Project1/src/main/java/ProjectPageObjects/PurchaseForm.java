package ProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseForm {

    public WebDriver driver;

    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("input#field-email"); //ADDDED 2024-03-15
    By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");
    By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    By continueDeliveryBtn = By.cssSelector("[name='confirmDeliveryOption']");




    public PurchaseForm(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGenderMr() {
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMs() {
        return driver.findElement(genderMs);
    }

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() {
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getBirthDateField() {
        return driver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() {
        return driver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() {
        return driver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() {
        return driver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }


    public WebElement getDeliveryMsgTextbox() {
        return driver.findElement(deliveryMsgTextbox);
    }

    public WebElement getContinueDeliveryBtn() {
        return driver.findElement(continueDeliveryBtn);
    }

}

