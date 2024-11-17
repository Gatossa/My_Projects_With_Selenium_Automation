import ProjectPageObjects.*;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


    public class EndToEndTest extends Base {


        public EndToEndTest() throws IOException {
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
        public void endToEndTest() throws InterruptedException {
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
            cont.clickCheckout().click();
            cont.getHavePromo().click();
            cont.getPromoTextbox().sendKeys("20OFF");
            cont.getPromoAddBtn().click();
            cont.getProceedCheckoutBtn().click();
            Thread.sleep(3000);


            PurchaseForm persInfo = new PurchaseForm(driver);
            persInfo.getGenderMs().click();
            persInfo.getFirstNameField().sendKeys("Anna");
            persInfo.getLastnameField().sendKeys("Mellow");
            persInfo.getEmailField().sendKeys("AnnaMellow@test.com");
            persInfo.getTermsConditionsCheckbox().click();
            persInfo.getContinueBtn().click();
            Thread.sleep(3000);

            DeliveryForm shipping= new DeliveryForm(driver);
            shipping.getAddressField().sendKeys("45A Warsaw Street");
            shipping.getCityField().sendKeys("Warsaw");
            Select state = new Select(shipping.getStateDropdown());
            state.selectByVisibleText("Nevada");
            shipping.getPostcodeField().sendKeys("79035");
            shipping.getConfirmBtn().click();
            shipping.getDeliveryMsgTextbox().sendKeys("Please leave my parcel under the stairs in case I am not at home.");
            shipping.getContinueDeliveryBtn().click();
            Thread.sleep(3000);
           
            PaymentForm Payment = new PaymentForm(driver);
           Payment.getPayByCheckRadioBtn().click();
            Payment.getTermsConditionsCheckbox().click();
            Payment.getOrderBtn().click();
        }


        }






