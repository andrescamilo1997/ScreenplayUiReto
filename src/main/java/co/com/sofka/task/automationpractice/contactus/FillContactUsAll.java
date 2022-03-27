package co.com.sofka.task.automationpractice.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterface.automationpractice.contacus.contactUs.*;

public class FillContactUsAll implements Task {
    private String email;
    private String message;
    private String heading;
    private String OrderReference;


    public FillContactUsAll useTheEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactUsAll useTheMessage(String message) {
        this.message = message;
        return this;
    }

    public FillContactUsAll useTheHeading(String heading) {
        this.heading = heading;
        return this;
    }

    public FillContactUsAll useTheOrderReference(String OrderReference) {
        this.OrderReference = OrderReference;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(CHOOSE_HEADING),
                SelectFromOptions.byVisibleText(heading).from(CHOOSE_HEADING),

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),



                Scroll.to(ORDERREFERENCE),
                Enter.theValue(OrderReference).into(ORDERREFERENCE),




                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),
                Scroll.to(PRIMARY_ELEMENT_MENU_CONTACTUS),

                Scroll.to(SUBMIT_MESSAGE),
                Click.on(SUBMIT_MESSAGE)


        );
    }


    public static FillContactUsAll fillContactUsAll(){
        return new FillContactUsAll();
    }
}
