package co.com.sofka.question.automationpractice.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_NOT_OK;
import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_OK;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLNOTOKINLOGIN;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLOKINLOGIN;

public class LoginFail implements Question<Boolean> {

    public LoginFail is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                THEN_MESSAGE_NOT_OK.resolveFor(actor).containsOnlyText(MESSAGEALLNOTOKINLOGIN.getValue())
                );
    }

    public static LoginFail loginFail(){
        return new LoginFail();
    }
}
