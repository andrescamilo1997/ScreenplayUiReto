package co.com.sofka.task.automationpractice.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.sofka.userinterface.automationpractice.login.Login.*;
import static co.com.sofka.util.ChooseHeading.*;

public class FillLogin implements Task {
    private String email;
    private String password;


    public FillLogin useEmail(String email) {
        this.email = email;
        return this;
    }

    public FillLogin setPassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(BUTTON_LOGIN),
                Click.on(BUTTON_LOGIN)
        );

    }

    public static FillLogin fillLogin(){
        return  new FillLogin();
    }
}
