package co.com.sofka.stepDefinitions.automationpractice;

import co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch;
import co.com.sofka.models.automationpractice.AutomationPracticeModel;
import co.com.sofka.stepDefinitions.automationpractice.setUp.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.question.automationpractice.contactus.QuestionContactUs.questionContactUs;
import static co.com.sofka.question.automationpractice.contactus.QuestionContactUsFail.questionContactUsFail;
import static co.com.sofka.task.automationpractice.contactus.BrowseToContactUS.browseToContactUS;
import static co.com.sofka.task.automationpractice.contactus.FillContactUs.fillContactUs;
import static co.com.sofka.task.automationpractice.contactus.FillContactUsAll.fillContactUsAll;
import static co.com.sofka.task.automationpractice.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterface.automationpractice.contacus.contactUs.MSG_ALL_OK;
import static co.com.sofka.util.ChooseHeading.HeadingCustomerService;
import static co.com.sofka.util.ChooseHeading.MESSAGEALLOKINCONTACTUS;
import static co.com.sofka.util.GeneralContacts.generalContacts;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ContactUsAutomationPracticeStepDefinition extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(ContactUsAutomationPracticeStepDefinition.class);
    private static final String ACTOR_NAME = "User";
    private AutomationPracticeModel automationPracticeModel;

    //fillAll
    @Given("Como usuario le gustaria contactarse con la aplicacion")
    public void comoUsuarioLeGustariaContactarseConLaAplicacion() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
        }catch (Exception exception){
            LOGGER.error(exception.getMessage(),exception);
        }
    }

    @When("Enviaria un mensaje con su Subject Heading, Email address, Order reference, Attach File")
    public void enviariaUnMensajeConSuSubjectHeadingEmailAddressOrderReferenceAttachFile() {
        try {
            automationPracticeModel = generalContacts();

            theActorInTheSpotlight().attemptsTo(
                    browseToContactUS(),
                    fillContactUsAll()
                            .useTheEmail(automationPracticeModel.getEmail())
                            .useTheHeading(HeadingCustomerService.getValue())
                            .useTheOrderReference(automationPracticeModel.getOrderReference())
                            .useTheMessage(automationPracticeModel.getMessage())
            );
        }catch (Exception exception){
            LOGGER.error(exception.getMessage(),exception);
        }
    }
    @Then("Recibe una respuesta, Your message has been successfully sent to our team.")
    public void recibeUnaRespuestaYourMessageHasBeenSuccessfullySentToOurTeam() {
            theActorInTheSpotlight().should(
                    seeThat(
                            questionContactUs()
                                    .is(), equalTo(true)
                    )
                            .orComplainWith(ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome()))
            );

    }

    private String compareInWithSystemOutcome(){
        return "\n"
                + "Data for test : System outcome" + "\n"
                + MESSAGEALLOKINCONTACTUS.getValue() + " : "
                + MSG_ALL_OK.resolveFor(theActorInTheSpotlight()).getText();
    }

    //NotFilAll
    @When("Enviaria un mensaje con su Subject Heading, Email address")
    public void enviariaUnMensajeConSuSubjectHeadingEmailAddress() {
        try {
            automationPracticeModel = generalContacts();
            theActorInTheSpotlight().attemptsTo(
                    browseToContactUS(),
                    fillContactUs()
                            .useTheEmail(automationPracticeModel.getEmail())
                            .useTheHeading(HeadingCustomerService.getValue())
                            .useTheMessage(automationPracticeModel.getMessage())

            );
        }catch (Exception exception){
            LOGGER.error(exception.getMessage(),exception);
        }
    }
    @Then("Recibe un mensaje se respuesta, Your message has been successfully sent to our team.")
    public void recibeUnMensajeSeRespuestaYourMessageHasBeenSuccessfullySentToOurTeam() {

            theActorInTheSpotlight().should(
                    seeThat(
                            questionContactUsFail()
                                    .is(), equalTo(true)
                    )
                            .orComplainWith(ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcomeNotOk()))
            );
    }

    private String compareInWithSystemOutcomeNotOk(){
        return "\n"
                + "Data for test : System outcome" + "\n"
                + MESSAGEALLOKINCONTACTUS.getValue() + " : "
                + MSG_ALL_OK.resolveFor(theActorInTheSpotlight()).getText();


    }

}
