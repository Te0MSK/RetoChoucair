package co.com.choucair.certificacion.retochoucair.util;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Locators {


    public static final Target JOIN_BUTTON = Target.the("Join today button").
            located(By.xpath("//a[contains(text(), 'Join Today')]"));


    public static final Target FIRST_NAME= Target.the("First name field").
            located(By.id("firstName"));

    public static final Target LAST_NAME= Target.the("Last name field").
            located(By.id("lastName"));

    public static final Target EMAIL= Target.the("Email field").
            located(By.id("email"));

    public static final Target MONTH= Target.the("Month field").
            located(By.id("birthMonth"));

    public static final Target MONTH_SELECTED= Target.the("Month selected option").
            located(By.xpath("//option[contains(text(),'July')]"));

    public static final Target DAY= Target.the("Day field").
            located(By.id("birthDay"));

    public static final Target DAY_SELECTED= Target.the("Day selected option").
            located(By.xpath("//select[@id='birthDay']/option[24]"));

    public static final Target YEAR= Target.the("Month field").
            located(By.id("birthYear"));

    public static final Target YEAR_SELECTED= Target.the("Month selected option").
            located(By.xpath("//option[contains(text(),'1985')]"));

    public static final Target LANGUAGES = Target.the("Language field").
            located(By.xpath("//input[@type='search']"));

    public static final Target LANGUAGES_SELECTED = Target.the("Language selected option").
            located(By.xpath("//div[contains(text(),'Czech')]"));

    public static final Target NEXT_BUTTON = Target.the("Next Button").
            located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target CITY= Target.the("City field").
            located(By.id("city"));

    public static final Target CITY_SELECTED= Target.the("City option selected").
            located(By.xpath("//*[contains(text(), 'Bello')]"));

    public static final Target ZIP_CODE= Target.the("Zip code field").
            located(By.id("zip"));

    public static final Target COUNTRY= Target.the("Country field").
            located(By.xpath("//span[@class='ui-select-match-text pull-left']"));

    public static final Target COUNTRY_SELECTED= Target.the("Country selected option").
            located(By.xpath("//div[contains(text(),'Brazil')]"));

    public static final Target NEXT_DEVICES = Target.the("Next Devices Button").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target COMPUTER = Target.the("Your computer field").
            located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']"));

    public static final Target COMPUTER_SELECTED = Target.the("Computer selected option").
            located(By.xpath("//div[contains(text(),'Linux')]"));

    public static final Target VERSION = Target.the("Version field").
            located(By.xpath("//span[contains(text(),'Select a Version')]"));

    public static final Target VERSION_SELECTED = Target.the("Version selected option").
            located(By.xpath("//div[contains(text(),'CentOS')]"));

    public static final Target OS_LANGUAGE = Target.the("OS language field").
            located(By.xpath("//span[contains(text(),'Select OS language')]"));

    public static final Target OS_LANGUAGE_SELECTED = Target.the("OS language selected option").
            located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target BRAND = Target.the("Brand field").
            located(By.xpath("//span[contains(text(),'Select Brand')]"));

    public static final Target BRAND_SELECTED = Target.the("Brand selected option").
            located(By.xpath("//div[contains(text(),'HP')]"));

    public static final Target MODEL = Target.the("Model field").
            located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target MODEL_SELECTED = Target.the("Model selected option").
            located(By.xpath("//div[contains(text(),'Touchpad')]"));

    public static final Target OS = Target.the("Os field").
            located(By.xpath("(//span[@aria-label='Select OS'])[2]"));

    public static final Target OS_SELECTED = Target.the("Os selected option").
            located(By.xpath("//div[contains(text(),'Android 4.2.1')]"));

    public static final Target LAST_BUTTON = Target.the("Last step button").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target PASSWORD= Target.the("Password field").
            located(By.id("password"));

    public static final Target CONFIRM_PASSWORD= Target.the("]Confirm Password field").
            located(By.id("confirmPassword"));

    public static final Target CHECK_INFORMED= Target.the("]Check informed field").
            located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target CHECK_TERMS= Target.the("]Check terms field").
            located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target CHECK_PRIVACY= Target.the("]Check privacy field").
            located(By.xpath("//span[@class='checkmark signup-consent__checkbox error'][1]"));

    public static final Target COMPLETE_BUTTON = Target.the("Complete Button").
            located(By.id("laddaBtn"));

    public static final Target LOGIN_BUTTON = Target.the("login Button").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));

    public static final Target LOGIN_EMAIL = Target.the("login email field").
            located(By.id("username"));

    public static final Target LOGIN_PASSWORD = Target.the("login password field").
            located(By.id("password"));

    public static final Target REMEMBER_CHECK= Target.the("Remember Check").
            located(By.id("rememberMe"));

    public static final Target SIGN_BUTTON= Target.the("Sign in Button").
            located(By.id("kc-login"));

    public static final Target WELCOME_MESSAGE= Target.the("Welcome message").
            located(By.xpath("(//div[@class='instructions'])[1]"));


    public static final Target ERROR_MESSAGE= Target.the("Login invalid message").
            located(By.xpath("//div[@class='alert alert-error']"));

    public static final Target CONFIRM_MESSAGE= Target.the("sign up confirm message").
            located(By.xpath("//div[@class='image-box-header']"));
















}
