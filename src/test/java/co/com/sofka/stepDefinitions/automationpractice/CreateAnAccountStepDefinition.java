package co.com.sofka.stepDefinitions.automationpractice;

import co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch;
import co.com.sofka.models.automationpractice.AutomationPracticeModel;
import co.com.sofka.stepDefinitions.automationpractice.setUp.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.question.automationpractice.createanaccount.QuestionCreateAnAccount.questionCreateAnAccount;
import static co.com.sofka.question.automationpractice.createanaccount.QuestionCreateAnAccountFail.questionCreateAnAccountFail;
import static co.com.sofka.task.automationpractice.createanaccount.BrowseToCreateAnAccount.createAnAccount;
import static co.com.sofka.task.automationpractice.createanaccount.FillCreatedAnAccount.fillCreatedAnAccount;
import static co.com.sofka.task.automationpractice.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterface.automationpractice.createanaccount.CreateAnAccount.MSG_ALL_NOT_OK_IN_REGISTER;
import static co.com.sofka.util.Comparators.*;
import static co.com.sofka.util.GeneralContacts.generalContacts;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAnAccountStepDefinition extends SetUp {
    private static final    Logger LOGGER = Logger.getLogger(CreateAnAccountStepDefinition.class);
    private static final    String ACTOR_NAME = "User";
    private                 AutomationPracticeModel automationPracticeModel;

    @Given("Como usuario le gustaría registrarse en la aplicacion")
    public void comoUsuarioLeGustariaRegistrarseEnLaAplicacion() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight()
                    .wasAbleTo(openLandingPage());
        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @When("Llenarìa un formulario de registro completo")
    public void llenariaUnFormularioDeRegistroCompleto() {

        automationPracticeModel = generalContacts();

        try {
            theActorInTheSpotlight().attemptsTo(
                    createAnAccount(),
                    fillCreatedAnAccount()
                            .useEmail                   (automationPracticeModel.getEmail                   ())
                            .useTitle                   (automationPracticeModel.getTitle                   ())
                            .useFirstName               (automationPracticeModel.getFirstName               ())
                            .useLastName                (automationPracticeModel.getLastName                ())
                            .usePassword                (automationPracticeModel.getPassword                ())
                            .useDayOfBirth              (automationPracticeModel.getDayOfBrith              ())
                            .useMonthOfBirth            (automationPracticeModel.getMonthOfBirth            ())
                            .useYearOfBirth             (automationPracticeModel.getYearOfBirth             ())
                            .useCheckNewsLetter         (automationPracticeModel.getCheckNewsLetter         ())
                            .useCheckEspecialOffers     (automationPracticeModel.getReceiveSpecialOffers    ())
                            .useCompany                 (automationPracticeModel.getCompany                 ())
                            .useAddress                 (automationPracticeModel.getAddress                 ())
                            .useCity                    (automationPracticeModel.getCity                    ())
                            .useAddress2                (automationPracticeModel.getAddressL2               ())
                            .useState                   (automationPracticeModel.getState                   ())
                            .useZipPostal               (automationPracticeModel.getZipPostalCode           ())
                            .useCountry                 (automationPracticeModel.getCountry                 ())
                            .useAdditionalInformation   (automationPracticeModel.getAdditionalInformation   ())
                            .useHomePhone               (automationPracticeModel.getHomePhone               ())
                            .useMobilePhone             (automationPracticeModel.getMobilePhone             ())

            );

        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @Then("Recibe un mensaje se respuesta, Welcome to your account. Here you can manage all of your personal information and orders.")
    public void recibeUnMensajeSeRespuestaWelcomeToYourAccountHereYouCanManageAllOfYourPersonalInformationAndOrders() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            questionCreateAnAccount()
                                    .is(), equalTo(true)
                    )
                            .orComplainWith(ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome()))
            );

        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }




    @When("Llenaria el formulario, pero no llena de los campos obligatorios First name")
    public void llenariaElFormularioPeroNoLlenaDeLosCamposObligatoriosFirstName() {

        try {
            automationPracticeModel = generalContacts();
            theActorInTheSpotlight().attemptsTo(
                    createAnAccount(),
                    fillCreatedAnAccount()
                            .useEmail                   (automationPracticeModel.getEmail                   ())
                            .useTitle                   (automationPracticeModel.getTitle                   ())
                            .useFirstName               ("")
                            .useLastName                (automationPracticeModel.getLastName                ())
                            .usePassword                (automationPracticeModel.getPassword                ())
                            .useDayOfBirth              (automationPracticeModel.getDayOfBrith              ())
                            .useMonthOfBirth            (automationPracticeModel.getMonthOfBirth            ())
                            .useYearOfBirth             (automationPracticeModel.getYearOfBirth             ())
                            .useCheckNewsLetter         (automationPracticeModel.getCheckNewsLetter         ())
                            .useCheckEspecialOffers     (automationPracticeModel.getReceiveSpecialOffers    ())
                            .useCompany                 (automationPracticeModel.getCompany                 ())
                            .useAddress                 (automationPracticeModel.getAddress                 ())
                            .useCity                    (automationPracticeModel.getCity                    ())
                            .useAddress2                (automationPracticeModel.getAddressL2               ())
                            .useState                   (automationPracticeModel.getState                   ())
                            .useZipPostal               (automationPracticeModel.getZipPostalCode           ())
                            .useCountry                 (automationPracticeModel.getCountry                 ())
                            .useAdditionalInformation   (automationPracticeModel.getAdditionalInformation   ())
                            .useMobilePhone             (automationPracticeModel.getMobilePhone             ())
                            .useHomePhone               (automationPracticeModel.getHomePhone               ())

            );

        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @Then("Recibe un mensaje se respuesta, First name is required.")
    public void recibeUnMensajeSeRespuestaFirstNameIsRequired() {

        theActorInTheSpotlight().should(
                seeThat(
                        questionCreateAnAccountFail()
                                .is(), equalTo(true)
                )
                        .orComplainWith(ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome()))
        );

    }

    private String compareInWithSystemOutcome(){
        return "\n"
                + "Data for test : System outcome" + "\n"
                + MESSAGE_ALL_NOT_OK_IN_REGISTER.getValue() + " : "
                + MSG_ALL_NOT_OK_IN_REGISTER.resolveFor(theActorInTheSpotlight()).getText();
    }

}
