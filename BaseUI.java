import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI{
    //webDriver here
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //make a window big!
        driver.get(Data.MAIN_URL);
    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }
}
