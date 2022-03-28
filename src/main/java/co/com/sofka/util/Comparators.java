package co.com.sofka.util;

public enum Comparators {
    HEADING_CUSTOMER_SERVICE("Customer service"),
    HEADING_WEB_MASTER("Webmaster"),
    MESSAGE_ALL_OK_IN_CONTACT_US("Your message has been successfully sent to our team."),
    MESSAGE_ALL_OK_IN_REGISTER("Welcome to your account. " +
            "Here you can manage all of your personal information and orders."),
    MESSAGE_ALL_NOT_OK_IN_REGISTER("There is 1 error\n" +
            "firstname is required."),
    CHECK_MR("true"),
    CHECK_MRS("false"),
    CHECK_NEWS_LETTER("true"),
    CHECK_ALL_ESPECIAL_OFFERS("true"),
    MESSAGE_ALL_OK_IN_LOGIN("MY ACCOUNT"),
    MESSAGE_ALL_NOT_OK_IN_LOGIN("There is 1 error\n" +
            "Authentication failed.")
    ;

    private final String value;

    public String getValue() {
        return value;
    }

    Comparators(String value) {
        this.value = value;
    }
}
