package co.com.sofka.question.automationpractice.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.contacus.ContactUs.MSG_ALL_OK;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_OK_IN_CONTACT_US;

public class QuestionContactUsFail implements Question<Boolean> {

    public QuestionContactUsFail is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                MSG_ALL_OK.resolveFor(actor).containsOnlyText(MESSAGE_ALL_OK_IN_CONTACT_US.getValue())
                );
    }

    public static QuestionContactUsFail questionContactUsFail(){
        return new QuestionContactUsFail();
    }
}
