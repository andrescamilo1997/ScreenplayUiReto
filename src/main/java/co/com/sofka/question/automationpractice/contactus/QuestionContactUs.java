package co.com.sofka.question.automationpractice.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.contacus.ContactUs.MSG_ALL_OK;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_OK_IN_CONTACT_US;

public class QuestionContactUs implements Question<Boolean> {

    public QuestionContactUs is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                MSG_ALL_OK.resolveFor(actor).containsOnlyText(MESSAGE_ALL_OK_IN_CONTACT_US.getValue())
                );
    }

    public static QuestionContactUs questionContactUs(){
        return new QuestionContactUs();
    }
}
