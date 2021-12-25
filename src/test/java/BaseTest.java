import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    BeymenPage beymenPage;


    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/mytumturk/Documents/Selenium Libraries/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        beymenPage = new BeymenPage(driver);

    }

    @AfterAll
    public void tearDown (){
        driver.quit();
        }
    }


}
