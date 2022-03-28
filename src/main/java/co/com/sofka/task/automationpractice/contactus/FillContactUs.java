package co.com.sofka.task.automationpractice.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterface.automationpractice.contacus.ContactUs.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillContactUs implements Task {
    private String email;
    private String message;
    private String heading;


    public FillContactUs useTheEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactUs useTheMessage(String message) {
        this.message = message;
        return this;
    }

    public FillContactUs useTheHeading(String heading) {
        this.heading = heading;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(EMAIL,isVisible()).forNoMoreThan(10).seconds(),

                Scroll.to(CHOOSE_HEADING),
                Click.on(CHOOSE_HEADING),

                SelectFromOptions.byVisibleText(heading).from(CHOOSE_HEADING),

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),

                Scroll.to(SUBMIT_MESSAGE),
                Click.on(SUBMIT_MESSAGE)



        );
    }

    public static FillContactUs fillContactUs(){
        return new FillContactUs();
    }
}
