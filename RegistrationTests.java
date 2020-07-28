import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI{
    int indexLinkSignIn = 0;

    @Test
    public void testSignIn() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.MY_TWO_LINKS_TO_EMAIL).sendKeys(Data.emailMyCredentials);
        driver.findElement(Locators.MY_TWO_LINKS_TO_PASSWORD).sendKeys(Data.passwordMyCredentials);
        driver.findElement(Locators.BUTTON_SIGN_IN).click();
    }

    @Test
    public void testRegistration() {
        driver.findElement(Locators.LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.REGISTRATION_POPUP).click();
        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();

        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.REGISTRATION2).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
        driver.findElement(Locators.PART_OF_JOIN_FORM).sendKeys(" ");
        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);

        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
        driver.findElement(Locators.REGISTRATION).isDisplayed();
        driver.findElement(Locators.PART_OF_JOIN_FORM).isDisplayed();

        driver.navigate().to(Data.MAIN_URL);
        System.out.print((Data.MAIN_URL.toString()));
        String MUrl = Data.MAIN_URL.toString();
        Assert.assertEquals( Data.MAIN_URL, MUrl);
    }
}