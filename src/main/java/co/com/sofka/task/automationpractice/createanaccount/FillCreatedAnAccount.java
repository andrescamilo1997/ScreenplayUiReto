package co.com.sofka.task.automationpractice.createanaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.*;
import static co.com.sofka.util.ChooseHeading.*;

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
    private String State;
    private String zipPostal;
    private String country;
    private String additionalInformation;
    private String homePhone;
    private String mobilePhone;
    private String aliasForReference;

    public FillCreatedAnAccount useEmail(String email) {
        this.email = email;
        return this;
    }

    public FillCreatedAnAccount setTitle(String title) {
        this.title = title;
        return this;
    }

    public FillCreatedAnAccount setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillCreatedAnAccount setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillCreatedAnAccount setPassword(String password) {
        this.password = password;
        return this;
    }



    public FillCreatedAnAccount setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public FillCreatedAnAccount setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
        return this;
    }

    public FillCreatedAnAccount setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public FillCreatedAnAccount setCompany(String company) {
        this.company = company;
        return this;
    }

    public FillCreatedAnAccount setAddress(String address) {
        this.address = address;
        return this;
    }

    public FillCreatedAnAccount setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public FillCreatedAnAccount setCity(String city) {
        this.city = city;
        return this;
    }

    public FillCreatedAnAccount setState(String state) {
        State = state;
        return this;
    }

    public FillCreatedAnAccount setZipPostal(String zipPostal) {
        this.zipPostal = zipPostal;
        return this;
    }

    public FillCreatedAnAccount setCountry(String country) {
        this.country = country;
        return this;
    }

    public FillCreatedAnAccount setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public FillCreatedAnAccount setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public FillCreatedAnAccount setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public FillCreatedAnAccount setAliasForReference(String aliasForReference) {
        this.aliasForReference = aliasForReference;
        return this;
    }

    public FillCreatedAnAccount setCheckNewsLetter(String checkNewsLetter) {
        this.checkNewsLetter = checkNewsLetter;
        return this;
    }

    public FillCreatedAnAccount setCheckEspecialOffers(String checkEspecialOffers) {
        this.checkEspecialOffers = checkEspecialOffers;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(BUTTON_SEND_FIRST_EMAIL),
                Click.on(BUTTON_SEND_FIRST_EMAIL),


                Check.whether(title.equals(CHECKMR.getValue()))
                        .andIfSo(
                                Scroll.to(RADIOBUTTON_MR),
                                Click.on(RADIOBUTTON_MR)
                        )
                        .otherwise(
                                Check.whether(title.equals(CHECKMRS.getValue()))
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


                Check.whether(CHECKNEWSLETTER.getValue().equals(checkNewsLetter))
                        .andIfSo(
                                Scroll.to(CHECK_NEWSLETTER),
                                Click.on(CHECK_NEWSLETTER)
                        ),
                Check.whether(CHECKESPECIALOFFERS.getValue().equals(checkEspecialOffers))
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
                SelectFromOptions.byVisibleText(State).from(STATE),

                Scroll.to(Zip_CODE),
                Enter.theValue(zipPostal).into(Zip_CODE),

                Scroll.to(COUNTRY),
                SelectFromOptions.byVisibleText(country).from(COUNTRY),

                Scroll.to(OTHER_INFORMATION),
                Enter.theValue(additionalInformation).into(OTHER_INFORMATION),

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
