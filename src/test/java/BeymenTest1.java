import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

import java.util.List;
import java.util.Random;

public class BeymenTest1 extends BaseTest{

    private JavascriptExecutor js;

    @Test
    public void setName() throws InterruptedException {
        driver.get("https://www.beymen.com/");
        boolean assertsEnabled = Assert.ASSERTS_ENABLED;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(By.id("moreContentButton"));

        public void selectRandomProduct(){

            // Find and click on a random product
            List<WebElement> allProducts = driver.findElements(new By.ByClassName(".o-productList"));
            Random rand = new Random();
            int randomProduct = rand.nextInt(((List<?>) allProducts).size());
            allProducts.get(randomProduct).click();


    }

    private void clickElement(By moreContentButton) {
    }

    private void sendKeys(By.ByClassName byClassName) {
    }
}

    }
