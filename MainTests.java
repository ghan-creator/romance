import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests extends BaseUI{
    String currentUrlSearch;

    @Test
   public void testMainPageTabHomeCssNavURL() {
        driver.findElement(Locators.NAVIGATION).click();
        currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals( currentUrlSearch, Data.possibleUrlSearch);
    }
}
