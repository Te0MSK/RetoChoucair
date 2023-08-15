package co.com.choucair.certificacion.retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.border.EmptyBorder;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

import static co.com.choucair.certificacion.retochoucair.util.Locators.*;

public class FillForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRST_NAME),
                Enter.theValue("Mateo").into(FIRST_NAME),
                Click.on(LAST_NAME),
                Enter.theValue("Ortiz Jaramillo").into(LAST_NAME),
                Click.on(EMAIL),
                Enter.theValue("TEO123@MAIL.COM").into(EMAIL),
                Click.on(MONTH),
                Click.on(MONTH_SELECTED),
                Click.on(DAY),
                Click.on(DAY_SELECTED),
                Click.on(YEAR),
                Click.on(YEAR_SELECTED),
                Click.on(LANGUAGES),
                Click.on(LANGUAGES_SELECTED),
                Click.on(NEXT_BUTTON),
                Click.on(CITY),
                Enter.theValue("Bello").into(CITY),
                Click.on(CITY_SELECTED),
                Click.on(ZIP_CODE),
                Enter.theValue("056431").into(ZIP_CODE),
                Click.on(COUNTRY),
                Click.on(COUNTRY_SELECTED),
                Click.on(NEXT_DEVICES),
                Click.on(COMPUTER),
                Click.on(COMPUTER_SELECTED),
                Click.on(VERSION),
                Click.on(VERSION_SELECTED),
                Click.on(OS_LANGUAGE),
                Click.on(OS_LANGUAGE_SELECTED),
                Click.on(BRAND),
                Click.on(BRAND_SELECTED),
                Click.on(MODEL),
                Click.on(MODEL_SELECTED),
                Click.on(OS),
                Click.on(OS_SELECTED),
                Click.on(LAST_BUTTON),
                Click.on(PASSWORD),
                Enter.theValue("Teo98122305627*").into(PASSWORD),
                Click.on(CONFIRM_PASSWORD),
                Enter.theValue("Teo98122305627*").into(CONFIRM_PASSWORD),
                Click.on(CHECK_INFORMED),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY)
                );


    }
    public static FillForm frm(){return Tasks.instrumented(FillForm.class);}
}
