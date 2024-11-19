package TestsInProject;

import ProjectPageObjects.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

@Listeners(ProjectListeners.Listeners.class)

public class AddRemoveCartTest extends Base {
    public AddRemoveCartTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }
    @AfterTest
    public void tearDown(){
       driver.close();
        driver = null;
    }

    @Test
    public void addRemoveItem() throws InterruptedException {
    ShopMainPage product=new ShopMainPage(driver);
        product.getTShirt().click();

    ProductPage item=new ProductPage(driver);
    Select option=new Select(item.getSizeOption());
        item.getColour().click();
        option.selectByVisibleText("XL");
        item.getQuantIncrease().click();
        item.getAddToCartBtn().click();

        Thread.sleep(7000);

        ShoppingCart cont=new ShoppingCart(driver);
        cont.clickContinueShopping().click();
        item.getHomepageLink().click();
        product.getTShirtLong().click();
        item.getAddToCartBtn().click();
        cont.clickCheckout().click();
        cont.getDeleteItemTwo().click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(cont.getDeleteItemTwo()));

        System.out.println(cont.getTotalAmount().getText());
        Assert.assertEquals(cont.getTotalAmount().getText(), "$45.24");


}



}
