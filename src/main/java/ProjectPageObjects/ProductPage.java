package ProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductPage {



        public WebDriver driver;

        By sizeOption = By.cssSelector("select#group_1");
        By colour =By.cssSelector("[aria-label='Black'] [type]");
        By quantityIncrease = By.cssSelector(".touchspin-up");
        By quantityDecrease = By.cssSelector(".touchspin-down");
        By addToCartBtn = By.cssSelector("[data-button-action]");
        By homepageLink = By.xpath("//span[.='Home']");


        public ProductPage(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement getSizeOption() {
            return driver.findElement(sizeOption);
        }

    public WebElement getColour() {
        return driver.findElement(colour);
    }
        public WebElement getQuantIncrease() {
            return driver.findElement(quantityIncrease);
        }

        public WebElement getQuantDecrease() {
            return driver.findElement(quantityDecrease);
        }

        public WebElement getAddToCartBtn() {
            return driver.findElement(addToCartBtn);
        }

        public WebElement getHomepageLink() {
            return driver.findElement(homepageLink);
        }

    }
