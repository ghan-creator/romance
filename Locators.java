//don't work from here for me
import org.openqa.selenium.By;

public class Locators {

    public static final By NAVIGATION = By.cssSelector(".nav-link");


    public static final By BUTTON_SIGN_IN = By.xpath("//div[@class='form-group']//button[@class='btn btn-primary']");
    public static final By MY_TWO_LINKS_TO_EMAIL = By.xpath("//div[@class='form-group']//input[@id='email']");
    public static final By MY_TWO_LINKS_TO_PASSWORD = By.xpath("//div[@class='form-group']//input[@id='password'] ");
    public static final By LINK_SIGN_IN =By.xpath("//a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']");

    public static final By TITLE = By.xpath("//h1");
    public static final By PRETTY = By.xpath("//body[@class='site-page']");
    public static final By LINK_XPATH = By.xpath("//ul/li/a");
    public static final By TESTLINK = By.xpath("//a[contains(.,headString)]");
    public static final By LINK_BLOG = By.xpath("//a[text()='BLOG']");
    public static final By ID_AJAX_LOGIN = By.id("ajax_login_link");
    public static final By ID_EMAIL = By.id("email");

    public static final By ID_PASSWORD = By.id("password");
    public static final By ADVERT = By.cssSelector(".wwa");
    public static final By GIFT_PRODUCT = By.xpath("//div[@id='result_products_block']");

    public static final By BUTTON_SWIFTS_GIFTS_SEARCH = By.xpath("//div[@class='store-search-block']//input[@id='search_product']");
    public static final By REGISTRATION = By.xpath("//div[@id='third-registration-page']/div/div[2]/div[2]/div[4]/div/div/div/input");
    public static final By BLOG_ORDER_GIRLS = By.xpath("//a[@href='https://romanceabroad.com/content/view/mail-order-girls']");
    public static final By LOOKING_FOR_GIFTS = By.xpath("//body[@class='site-page']//button[@class='btn btn-primary']");
    public static final By HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By REGISTRATION2 = (By.xpath("//div[@id='second-registration-page']/div/div[2]/div[2]/div[3]/div/button"));
    public static final By REGISTRATION_POPUP = By.cssSelector("#show-registration-block");
    public static final By BUTTON_JOIN = By.xpath("//button[contains(.,'JOIN FOR FREE NOW')]");
    public static final By EMAIL_JOIN = By.xpath("//input[@id='email']");
    public static final By PART_OF_JOIN_FORM = By.cssSelector(".btn");
    public static final By YEAR_JOIN_FORM = By.cssSelector("a");

    public static final By PHONE_INPUT_FORM = By.cssSelector(".phone-block .form-control");
    public static final By FORM_TEXT_YEAR = By.xpath("//a[contains(text(),'2000')]");
    public static final By PASSWORD_JOIN_INPUT = By.xpath("//input[@id='password']");
    public static final By NICKNAME =By.cssSelector("#nickname");


}

