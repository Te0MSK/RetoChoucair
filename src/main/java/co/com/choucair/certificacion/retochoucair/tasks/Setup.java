package co.com.choucair.certificacion.retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.retochoucair.util.Locators.COMPLETE_BUTTON;

public class Setup implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(COMPLETE_BUTTON)
        );
    }

    public static Setup st(){return Tasks.instrumented(Setup.class);}
}
