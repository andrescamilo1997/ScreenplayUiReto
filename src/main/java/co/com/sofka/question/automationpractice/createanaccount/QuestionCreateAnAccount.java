package co.com.sofka.question.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.MSG_ALL_OK_IN_REGISTER;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLOKINREGISTER;

public class QuestionCreateAnAccount implements Question<Boolean> {

    public QuestionCreateAnAccount is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                MSG_ALL_OK_IN_REGISTER.resolveFor(actor).containsOnlyText(MESSAGEALLOKINREGISTER.getValue())
                );
    }

    public static QuestionCreateAnAccount questionCreateAnAccount(){
        return new QuestionCreateAnAccount();
    }
}
