package co.com.sofka.question.automationpractice.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_OK;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_OK_IN_LOGIN;

public class Login implements Question<Boolean> {

    public Login is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                THEN_MESSAGE_OK.resolveFor(actor).containsOnlyText(MESSAGE_ALL_OK_IN_LOGIN.getValue())
                );
    }

    public static Login login(){
        return new Login();
    }
}
