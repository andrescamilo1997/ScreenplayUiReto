package co.com.sofka.util;

public enum ChooseHeading {
    HeadingCustomerService("Customer service"),
    HeadingWebmaster("Webmaster"),
    MESSAGEALLOKINCONTACTUS("Your message has been successfully sent to our team."),
    MESSAGEALLOKINREGISTER("Welcome to your account. Here you can manage all of your personal information and orders."),
    MESSAGEALLNOTOKINREGISTER("There is 1 error\n" +
            "firstname is required."),
    CHECKMR("true"),
    CHECKMRS("false"),
    CHECKNEWSLETTER("true"),
    CHECKESPECIALOFFERS("true"),
    MESSAGEALLOKINLOGIN("MY ACCOUNT"),
    MESSAGEALLNOTOKINLOGIN("There is 1 error\n" +
            "Authentication failed.")
    ;

    private final String value;

    public String getValue() {
        return value;
    }

    ChooseHeading(String value) {
        this.value = value;
    }
}
