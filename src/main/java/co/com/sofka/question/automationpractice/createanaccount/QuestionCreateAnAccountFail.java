package co.com.sofka.question.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.MSG_ALL_NOT_OK_IN_REGISTER;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLNOTOKINREGISTER;

public class QuestionCreateAnAccountFail implements Question<Boolean> {

    public QuestionCreateAnAccountFail is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                MSG_ALL_NOT_OK_IN_REGISTER.resolveFor(actor).containsOnlyText(MESSAGEALLNOTOKINREGISTER.getValue())
                );
    }

    public static QuestionCreateAnAccountFail questionCreateAnAccountFail(){
        return new QuestionCreateAnAccountFail();
    }
}
