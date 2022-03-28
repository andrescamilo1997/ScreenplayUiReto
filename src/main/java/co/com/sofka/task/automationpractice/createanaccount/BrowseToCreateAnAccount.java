package co.com.sofka.task.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.PRIMARY_ELEMENT_MENU_LOGIN;

public class BrowseToCreateAnAccount implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRIMARY_ELEMENT_MENU_LOGIN),
                Click.on(PRIMARY_ELEMENT_MENU_LOGIN)

        );
    }

    public static BrowseToCreateAnAccount createAnAccount(){
        return new BrowseToCreateAnAccount();
    }
}
