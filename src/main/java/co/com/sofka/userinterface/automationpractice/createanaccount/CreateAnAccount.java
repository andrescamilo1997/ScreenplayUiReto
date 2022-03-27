package co.com.sofka.userinterface.automationpractice.createanaccount;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class CreateAnAccount extends PageObject {


    public static final Target PRIMARY_ELEMENT_MENU_LOGIN = Target
            .the("Elements")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));

    public static final Target EMAIL = Target
            .the("email")
            .located(By.id("email_create"));

    public static final Target BUTTON_SEND_FIRST_EMAIL = Target
            .the("Button send")
            .located(By.xpath("//*[@id=\"SubmitCreate\"]"));

    public static final Target RADIOBUTTON_MR = Target
            .the("Radio Button MR")
            .located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label"));

    public static final Target RADIOBUTTON_MRS = Target
            .the("Radio Button MRS")
            .located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]"));

    public static final Target FIRST_NAME = Target
            .the("First name")
            .located(By.id("customer_firstname"));

    public static final Target LAST_NAME = Target
            .the("Last name")
            .located(By.id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("pass")
            .located(By.id("passwd"));

    public static final Target DAYS = Target
            .the("Day")
            .located(By.id("days"));

    public static final Target SELECTOR_DAYS = Target
            .the("Day")
            .located(By.xpath("//*[@id=\"days\"]/option"));

    public static final Target MONTH = Target
            .the("Month")
            .located(By.id("months"));

    public static final Target SELECTOR_MONTH = Target
            .the("Month")
            .located(By.xpath("//*[@id=\"months\"]/option"));

    public static final Target YEAR = Target
            .the("Year")
            .located(By.id("years"));

    public static final Target SELECTOR_YEAR = Target
            .the("Month")
            .located(By.xpath("//*[@value=\""));

    public static final Target CHECK_NEWSLETTER = Target
            .the("Check Newsletter")
            .located(By.id("newsletter"));

    public static final Target CHECK_ESPECIAL_OFFERS = Target
            .the("Check Especial Offers")
            .located(By.id("optin"));

    public static final Target COMPANY = Target
            .the("Company")
            .located(By.id("company"));

    public static final Target ADDRESS = Target
            .the("Address")
            .located(By.id("address1"));

    public static final Target ADDRESS2 = Target
            .the("Address")
            .located(By.id("address2"));

    public static final Target CITY = Target
            .the("city")
            .located(By.id("city"));

    public static final Target STATE = Target
            .the("State")
            .located(By.id("id_state"));

    public static final Target Zip_CODE = Target
            .the("Zip Code")
            .located(By.id("postcode"));

    public static final Target COUNTRY = Target
            .the("Country")
            .located(By.id("id_country"));

    public static final Target OTHER_INFORMATION = Target
            .the("Other information")
            .located(By.id("other"));

    public static final Target HOME_PHONE = Target
            .the("Home phone")
            .located(By.id("phone"));

    public static final Target MOBILE_PHONE = Target
            .the("Mobile phone")
            .located(By.xpath("//*[@id=\"phone_mobile\"]"));

    public static final Target ALIAS_FOR_REFERENCE = Target
            .the("Alias for reference")
            .located(By.id("alias"));

    public static final Target END_BUTTON_FOR_REGISTER = Target
            .the("End button for Register")
            .located(By.id("submitAccount"));

    public static final Target MSG_ALL_OK_IN_REGISTER = Target
            .the("End button for Register")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));

    public static final Target MSG_ALL_NOT_OK_IN_REGISTER = Target
            .the("End button for Register")
            .located(By.xpath("//*[@id=\"center_column\"]/div[1]"));

    public static final Target LOG_OUT = Target
            .the("Log out")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]"));
}
