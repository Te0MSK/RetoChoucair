package co.com.choucair.certificacion.retochoucair.stepdefinitions;

import co.com.choucair.certificacion.retochoucair.questions.ValidateConfirmMessage;
import co.com.choucair.certificacion.retochoucair.questions.ValidateLoginMessage;
import co.com.choucair.certificacion.retochoucair.questions.ValidateWelcomeMessage;
import co.com.choucair.certificacion.retochoucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.choucair.certificacion.retochoucair.questions.ValidateWelcomeMessage.*;

public class NewAccountStepDefinitions {

    @Managed(clearCookies = ClearCookiesPolicy.BeforeEachTest)
    private WebDriver hisBrowser;

    @Before
    public void setup(){

        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("user");
    }

    @Given("^The user is on the main page of Utest$")
    public void theUserIsOnTheMainPageOfUtest() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com"));
    }

    @When("^The user clicks on the Join Today button$")
    public void theUserClicksOnTheJoinTodayButton() {
    OnStage.theActorInTheSpotlight().attemptsTo(JoinTodayButton.log());


    }

    @When("^Fill out all the information in the form$")
    public void fillOutAllTheInformationInTheForm() {
     OnStage.theActorInTheSpotlight().attemptsTo(FillForm.frm());
    }

    @Then("^Click the Complete Setup button and should see the confirmation message (.*)$")
    public void clickTheCompleteSetupButtonAndShouldSeeTheConfirmationMessage(String msj) {
        OnStage.theActorInTheSpotlight().attemptsTo(Setup.st());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateConfirmMessage.vlm(),Matchers.containsString(msj)));
    }

    @When("^The user clicks the Log In button$")
    public void theUserClicksTheLogInButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.lg());
    }

    @When("^Fill in the fields for username and password and click the Sign In button$")
    public void fillInTheFieldsForUsernameAndPasswordAndClickTheSignInButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillLogin.fl());
    }

    @Then("^The user should see the confirmation message (.*)$")
    public void theUserWillSeeTheConfirmationMessage(String msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateWelcomeMessage.message(),Matchers.containsString(msj)));
    }


    @And("^Fill in the username field correctly but enter the password incorrectly then click the Sign In button$")
    public void fillInTheUsernameFieldCorrectlyButEnterThePasswordIncorrectlyThenClickTheSignInButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillBadLogin.bd());
    }

    @Then("^The user should see the error message (.*)$")
    public void theUserWillSeeTheErrorMessage(String msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLoginMessage.msg(),Matchers.containsString(msj)));
    }



}
