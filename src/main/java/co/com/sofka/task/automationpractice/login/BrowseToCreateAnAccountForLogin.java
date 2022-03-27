package co.com.sofka.task.automationpractice.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.LOG_OUT;
import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.PRIMARY_ELEMENT_MENU_LOGIN;

public class BrowseToCreateAnAccountForLogin implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LOG_OUT),
                Click.on(LOG_OUT),

                Scroll.to(PRIMARY_ELEMENT_MENU_LOGIN),
                Click.on(PRIMARY_ELEMENT_MENU_LOGIN)

        );
    }

    public static BrowseToCreateAnAccountForLogin createAnAccountForLogin(){
        return new BrowseToCreateAnAccountForLogin();
    }
}
