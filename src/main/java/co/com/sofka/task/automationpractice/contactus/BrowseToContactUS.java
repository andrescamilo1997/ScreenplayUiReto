package co.com.sofka.task.automationpractice.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.automationpractice.contacus.ContactUs.PRIMARY_ELEMENT_MENU_CONTACTUS;

public class BrowseToContactUS implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRIMARY_ELEMENT_MENU_CONTACTUS),
                Click.on(PRIMARY_ELEMENT_MENU_CONTACTUS)
        );
    }

    public static BrowseToContactUS browseToContactUS(){
        return new BrowseToContactUS();
    }
}
