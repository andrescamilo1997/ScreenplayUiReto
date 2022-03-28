package co.com.sofka.stepDefinitions.automationpractice;

import co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch;
import co.com.sofka.models.automationpractice.AutomationPracticeModel;
import co.com.sofka.stepDefinitions.automationpractice.setUp.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.exceptions.automationpractice.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.question.automationpractice.login.Login.login;
import static co.com.sofka.question.automationpractice.login.LoginFail.loginFail;
import static co.com.sofka.task.automationpractice.createanaccount.BrowseToCreateAnAccount.createAnAccount;
import static co.com.sofka.task.automationpractice.createanaccount.FillCreatedAnAccount.fillCreatedAnAccount;
import static co.com.sofka.task.automationpractice.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.automationpractice.login.BrowseToCreateAnAccountForLogin.createAnAccountForLogin;
import static co.com.sofka.task.automationpractice.login.FillLogin.fillLogin;
import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_NOT_OK;
import static co.com.sofka.userinterface.automationpractice.login.Login.THEN_MESSAGE_OK;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_NOT_OK_IN_LOGIN;
import static co.com.sofka.util.Comparators.MESSAGE_ALL_OK_IN_LOGIN;
import static co.com.sofka.util.GeneralContacts.generalContacts;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition extends SetUp {
    private static final    Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);
    private static final    String ACTOR_NAME = "User";
    private final           AutomationPracticeModel automationPracticeModel = generalContacts();


    @Given("como usuario quiero porder registrarme para poder ingresar con mis credenciales a la plataforma")
    public void comoUsuarioQuieroPorderRegistrarmeParaPoderIngresarConMisCredencialesALaPlataforma() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage(),
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
                            .useCompany                 (automationPracticeModel.getCompany                 ())
                            .useAddress                 (automationPracticeModel.getAddress                 ())
                            .useCity                    (automationPracticeModel.getCity                    ())
                            .useAddress2                (automationPracticeModel.getAddressL2               ())
                            .useState                   (automationPracticeModel.getState                   ())
                            .useZipPostal               (automationPracticeModel.getZipPostalCode           ())
                            .useCountry                 (automationPracticeModel.getCountry                 ())
                            .useAdditionalInformation   (automationPracticeModel.getAdditionalInformation   ())
                            .useHomePhone               (automationPracticeModel.getHomePhone               ())
                            .useMobilePhone             (automationPracticeModel.getMobilePhone             ()),
                    createAnAccountForLogin()


            );
        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @When("con las credenciales, accedo a mi cuenta en la plataforma")
    public void conLasCredencialesAccedoAMiCuentaEnLaPlataforma() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    fillLogin()
                            .useEmail   (automationPracticeModel.getEmail       ())
                            .setPassword(automationPracticeModel.getPassword    ())
            );

        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @Then("entro a mi cuenta")
    public void entroAMiCuenta() {
        theActorInTheSpotlight().should(
                seeThat(
                        login()
                                .is(), equalTo(true)
                )
                        .orComplainWith(ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome()))
        );
    }

    private String compareInWithSystemOutcome(){
        return "\n"
                + "Data for test : System outcome" + "\n"
                + MESSAGE_ALL_OK_IN_LOGIN.getValue() + " : "
                + THEN_MESSAGE_OK.resolveFor(theActorInTheSpotlight()).getText();
    }




    @Given("como usuario trato de ingresar con mis credenciales a la plataforma, pero no me he registrado")
    public void comoUsuarioTratoDeIngresarConMisCredencialesALaPlataformaPeroNoMeHeRegistrado() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage(),
                    createAnAccountForLogin()


            );
        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @When("con las credenciales, accedo a mi correo no registrado en la plataforma")
    public void conLasCredencialesAccedoAMiCorreoNoRegistradoEnLaPlataforma() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    fillLogin()
                            .useEmail   (automationPracticeModel.getEmail       ())
                            .setPassword(automationPracticeModel.getPassword    ())
            );

        }catch (Exception exception){
            LOGGER.warn(exception.getMessage());
        }
    }

    @Then("mensaje de error There is one error Authentication failed.")
    public void mensajeDeErrorThereIsOneErrorAuthenticationFailed(){
        theActorInTheSpotlight().should(
                seeThat(
                        loginFail()
                                .is(), equalTo(true)
                )
                        .orComplainWith(ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcomeNotLogin()))
        );
    }

    private String compareInWithSystemOutcomeNotLogin(){
        return "\n"
                + "Data for test : System outcome" + "\n"
                + MESSAGE_ALL_NOT_OK_IN_LOGIN.getValue() + " : "
                + THEN_MESSAGE_NOT_OK.resolveFor(theActorInTheSpotlight()).getText();
    }

}
