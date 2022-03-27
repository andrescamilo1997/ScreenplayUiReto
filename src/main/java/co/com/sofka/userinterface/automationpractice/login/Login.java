package co.com.sofka.userinterface.automationpractice.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {
    public static final Target EMAIL = Target
            .the("email")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target PASSWORD = Target
            .the("password")
            .located(By.xpath("//*[@id=\"passwd\"]"));

    public static final Target BUTTON_LOGIN = Target
            .the("btn login ")
            .located(By.xpath("//*[@id=\"SubmitLogin\"]"));

    public static final Target THEN_MESSAGE_OK = Target
            .the("mensaje ok")
            .located(By.xpath("//*[@id=\"center_column\"]/h1"));

    public static final Target THEN_MESSAGE_NOT_OK = Target
            .the("mensaje ok")
            .located(By.xpath("//*[@id=\"center_column\"]/div[1]"));

}
