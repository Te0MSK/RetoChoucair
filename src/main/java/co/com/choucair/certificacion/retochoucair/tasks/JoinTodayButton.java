package co.com.choucair.certificacion.retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.retochoucair.util.Locators.JOIN_BUTTON;

public class JoinTodayButton  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_BUTTON));
    }
    public static JoinTodayButton log(){return Tasks.instrumented(JoinTodayButton.class);}
}
