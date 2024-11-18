package ProjectPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


    public class ShopMainPage {

        public WebDriver driver;

        By  Frame= By.cssSelector("[alt='The best is yet to come\\' Framed poster']");
        By  TShirt=By.cssSelector(".products.row [alt='Hummingbird printed t-shirt']");
        By  TShirtLong=By.cssSelector(".products.row [data-id-product='2']");
        public ShopMainPage(WebDriver driver){
            this.driver = driver;}

        public WebElement getFrame(){
            return driver.findElement(Frame);

        }

        public WebElement getTShirt(){
            return driver.findElement(TShirt);
        }

        public WebElement getTShirtLong(){
            return driver.findElement(TShirtLong);
        }
    }



