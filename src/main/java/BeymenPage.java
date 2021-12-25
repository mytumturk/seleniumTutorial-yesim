import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BeymenPage {

    private WebDriver driver;
    private WebElement aramaKutucugu = driver.findElement(new By.ByClassName(".default-input"));
    private By dahaFazlaGosterButonu = By.id("moreContentButton");
    JavascriptExecutor js;

    public BeymenPage(WebDriver driver){
        this.driver = driver;

        public void setName nameAsString {
            WebElement aramaKutucuguSpace = driver.findElement((By) aramaKutucugu);
            aramaKutucuguSpace.click();
            aramaKutucuguSpace.sendKeys(By.class('.default-input'));



        }
    }
}
