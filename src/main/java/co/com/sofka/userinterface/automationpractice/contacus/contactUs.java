package co.com.sofka.userinterface.automationpractice.contacus;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class contactUs extends PageObject {
    public static final Target PRIMARY_ELEMENT_MENU_CONTACTUS = Target
            .the("Elements")
            .located(By.xpath("//*[@id=\"contact-link\"]/a"));
    public static final Target CHOOSE_HEADING = Target
            .the("Choose Heading customer")
            .located(By.xpath("//*[@id=\"id_contact\"]"));
    public static final Target CHOOSE_HEADING_CUSTOMER_SERVICE = Target
            .the("Choose Heading customer")
            .located(By.xpath("//*[@id=\"id_contact\"]/option[2]"));
    public static final Target CHOOSE_HEADING_WEBMASTER = Target
            .the("Choose Heading webmaster")
            .located(By.xpath("//*[@id=\"id_contact\"]/option[3]"));
    public static final Target EMAIL = Target
            .the("email")
            .located(By.id("email"));
    public static final Target ORDERREFERENCE = Target
            .the("Order Reference")
            .located(By.xpath("//*[@id=\"id_order\"]"));
    public static final Target CHOOSE_FILE = Target
            .the("Choose file")
            .located(By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]"));
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
