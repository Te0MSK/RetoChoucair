package co.com.choucair.certificacion.retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certificacion.retochoucair.util.Locators.*;
import static co.com.choucair.certificacion.retochoucair.util.Locators.SIGN_BUTTON;

public class FillBadLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_EMAIL),
                Enter.theValue("TEO123@MAIL.COM").into(LOGIN_EMAIL),
                Click.on(LOGIN_PASSWORD),
                Enter.theValue("Teo123").into(LOGIN_PASSWORD),
                Click.on(REMEMBER_CHECK),
                Click.on(SIGN_BUTTON));
    }

    public static FillBadLogin bd(){return Tasks.instrumented(FillBadLogin.class);}

    }

