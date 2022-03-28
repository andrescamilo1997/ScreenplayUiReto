package co.com.sofka.userinterface.automationpractice.contacus;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class ContactUs extends PageObject {

    public static final Target PRIMARY_ELEMENT_MENU_CONTACTUS = Target
            .the("Elements")
            .located(By.xpath("//*[@id=\"contact-link\"]/a"));

    public static final Target CHOOSE_HEADING = Target
            .the("Choose Heading customer")
            .located(By.xpath("//*[@id=\"id_contact\"]"));

    public static final Target EMAIL = Target
            .the("email")
            .located(By.id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order Reference")
            .located(By.xpath("//*[@id=\"id_order\"]"));

    public static final Target MESSAGE = Target
            .the("message")
            .located(By.xpath("//*[@id=\"message\"]"));

    public static final Target SUBMIT_MESSAGE = Target
            .the("submit message")
            .located(By.xpath("//*[@id=\"submitMessage\"]"));

    public static final Target MSG_ALL_OK = Target
            .the("Message All Ok")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));


}
