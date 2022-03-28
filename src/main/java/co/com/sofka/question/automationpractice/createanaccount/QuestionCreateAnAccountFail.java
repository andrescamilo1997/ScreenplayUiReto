package co.com.sofka.question.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.MSG_ALL_NOT_OK_IN_REGISTER;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_NOT_OK_IN_REGISTER;

public class QuestionCreateAnAccountFail implements Question<Boolean> {

    public QuestionCreateAnAccountFail is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                MSG_ALL_NOT_OK_IN_REGISTER.resolveFor(actor).containsOnlyText(MESSAGE_ALL_NOT_OK_IN_REGISTER.getValue())
                );
    }

    public static QuestionCreateAnAccountFail questionCreateAnAccountFail(){
        return new QuestionCreateAnAccountFail();
    }
}
