package co.com.sofka.question.automationpractice.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_OK;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLOKINLOGIN;

public class Login implements Question<Boolean> {

    public Login is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                THEN_MESSAGE_OK.resolveFor(actor).containsOnlyText(MESSAGEALLOKINLOGIN.getValue())
                );
    }

    public static Login login(){
        return new Login();
    }
}
