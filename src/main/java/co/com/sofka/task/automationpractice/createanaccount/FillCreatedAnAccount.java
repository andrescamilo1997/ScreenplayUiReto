package co.com.sofka.task.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.*;
import static co.com.sofka.util.Comparators.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCreatedAnAccount implements Task {
    private String email;
    private String title;
    private String firstName;
    private String lastName;
    private String password;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String checkNewsLetter;
    private String checkEspecialOffers;
    private String company;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipPostal;
    private String country;
    private String additionalInformation;
    private String homePhone;
    private String mobilePhone;

    public FillCreatedAnAccount useEmail(String email) {
        this.email = email;
        return this;
    }

    public FillCreatedAnAccount useTitle(String title) {
        this.title = title;
        return this;
    }

    public FillCreatedAnAccount useFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillCreatedAnAccount useLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillCreatedAnAccount usePassword(String password) {
        this.password = password;
        return this;
    }



    public FillCreatedAnAccount useDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public FillCreatedAnAccount useMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
        return this;
    }

    public FillCreatedAnAccount useYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public FillCreatedAnAccount useCompany(String company) {
        this.company = company;
        return this;
    }

    public FillCreatedAnAccount useAddress(String address) {
        this.address = address;
        return this;
    }

    public FillCreatedAnAccount useAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public FillCreatedAnAccount useCity(String city) {
        this.city = city;
        return this;
    }

    public FillCreatedAnAccount useState(String state) {
        this.state = state;
        return this;
    }

    public FillCreatedAnAccount useZipPostal(String zipPostal) {
        this.zipPostal = zipPostal;
        return this;
    }

    public FillCreatedAnAccount useCountry(String country) {
        this.country = country;
        return this;
    }

    public FillCreatedAnAccount useAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public FillCreatedAnAccount useHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public FillCreatedAnAccount useMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public FillCreatedAnAccount useCheckNewsLetter(String checkNewsLetter) {
        this.checkNewsLetter = checkNewsLetter;
        return this;
    }

    public FillCreatedAnAccount useCheckEspecialOffers(String checkEspecialOffers) {
        this.checkEspecialOffers = checkEspecialOffers;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL,isVisible()).forNoMoreThan(10).seconds(),

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(BUTTON_SEND_FIRST_EMAIL),
                Click.on(BUTTON_SEND_FIRST_EMAIL),


                Check.whether(title.equals(CHECK_MR.getValue()))
                        .andIfSo(
                                Scroll.to(RADIOBUTTON_MR),
                                Click.on(RADIOBUTTON_MR)
                        )
                        .otherwise(
                                Check.whether(title.equals(CHECK_MRS.getValue()))
                                        .andIfSo(
                                                Scroll.to(RADIOBUTTON_MRS),
                                                Click.on(RADIOBUTTON_MRS)
                                        )
                        ),
                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(DAYS),
                SelectFromOptions.byValue(dayOfBirth).from(DAYS),

                Scroll.to(MONTH),
                SelectFromOptions.byValue(monthOfBirth).from(MONTH),

                Scroll.to(YEAR),
                SelectFromOptions.byValue(yearOfBirth).from(YEAR),


                Check.whether(CHECK_NEWS_LETTER.getValue().equals(checkNewsLetter))
                        .andIfSo(
                                Scroll.to(CHECK_NEWSLETTER),
                                Click.on(CHECK_NEWSLETTER)
                        ),
                Check.whether(CHECK_ALL_ESPECIAL_OFFERS.getValue().equals(checkEspecialOffers))
                        .andIfSo(
                                Scroll.to(CHECK_ESPECIAL_OFFERS),
                                Click.on(CHECK_ESPECIAL_OFFERS)
                        ),

                Scroll.to(COMPANY),
                Enter.theValue(company).into(COMPANY),

                Scroll.to(ADDRESS),
                Enter.theValue(address).into(ADDRESS),

                Scroll.to(ADDRESS2),
                Enter.theValue(address2).into(ADDRESS2),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),

                Scroll.to(STATE),
                SelectFromOptions.byVisibleText(state).from(STATE),

                Scroll.to(Zip_CODE),
                Enter.theValue(zipPostal).into(Zip_CODE),

                Scroll.to(COUNTRY),
                SelectFromOptions.byVisibleText(country).from(COUNTRY),

                Scroll.to(OTHER_INFORMATION),
                Enter.theValue(additionalInformation).into(OTHER_INFORMATION),

                Scroll.to(HOME_PHONE),
                Enter.theValue(homePhone).into(HOME_PHONE),

                Scroll.to(MOBILE_PHONE),
                Enter.theValue(mobilePhone).into(MOBILE_PHONE),

                Scroll.to(END_BUTTON_FOR_REGISTER),
                Click.on(END_BUTTON_FOR_REGISTER)

        );

    }

    public static FillCreatedAnAccount fillCreatedAnAccount(){
        return  new FillCreatedAnAccount();
    }
}
