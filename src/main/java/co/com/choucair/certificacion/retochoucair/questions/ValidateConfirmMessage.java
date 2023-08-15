package co.com.choucair.certificacion.retochoucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certificacion.retochoucair.util.Locators.CONFIRM_MESSAGE;


public class ValidateConfirmMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(CONFIRM_MESSAGE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds();
        return Text.of(CONFIRM_MESSAGE).viewedBy(actor).asString();
    }

    public static ValidateConfirmMessage vlm(){return new ValidateConfirmMessage();}
}
