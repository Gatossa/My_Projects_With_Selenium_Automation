import ProjectPageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpodoTest extends Base {
    public OpodoTest() throws IOException {
        super();
    }

    @Test (priority = 1)
    public void findingCities() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.id("didomi-notice-agree-button")).click();
        driver.findElement(By.xpath("//input[@test-id='input-airport' and @placeholder='Skąd?']")).click();
        driver.findElement(By.cssSelector(".odf-input.odf-input-inline.odf-input-inline-first.odf-input-m.odf-text-ellipsis.odf-text-lg")).sendKeys("London");

        List<WebElement> listaLotniskZ = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div//ul/li/div[2]/span[1]")));
        for (WebElement lotniska : listaLotniskZ) {
            //System.out.println(lotniska.getText());

            if (lotniska.getText().contains("STN")) {
                System.out.print("Lista lotnisk z   " + lotniska.getText());
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                lotniska.click();
                break;  //to avoid StaleException
            }
        }

        driver.findElement(By.xpath("//input[@test-id='input-airport' and @placeholder='Dokąd?']")).click();
        driver.findElement(By.cssSelector("[test-id='airport-destination'] [type]")).sendKeys("Berlin");

        List<WebElement> listaLotniskDo = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                       (By.xpath("//div/ul/li/div/span[1]")));
        for (WebElement lotniska2 : listaLotniskDo) {
            System.out.println("Lista lotnisk do   " + lotniska2.getText());// Print each element's text on a new line
            if (lotniska2.getText().contains("BER"));
            lotniska2.click();
            break;

        }
        }

        @Test (priority = 2)
    public void choosingDates(){
        driver.findElement(By.xpath("//div[@class='odf-calendar-day' and text()='8']")).click();
        driver.findElement(By.xpath("//div[@class='odf-calendar-day' and text()='13']")).click();
        driver.findElement(By.cssSelector("[data-testid='pax-selector-summary']")).click();
        driver.findElement(By.cssSelector(" [class] [data-testid='pax-selector-item']:nth-of-type(1) .odf-icon-plus")).click();
        driver.findElement(By.cssSelector(" [class] [data-testid='pax-selector-item']:nth-of-type(2) .odf-icon-plus")).click();
        driver.findElement(By.cssSelector(".odf-input-group [type='button']")).click();






    }
}















