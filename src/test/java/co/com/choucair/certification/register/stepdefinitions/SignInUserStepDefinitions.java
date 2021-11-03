package co.com.choucair.certification.register.stepdefinitions;

import co.com.choucair.certification.register.tasks.Address;
import co.com.choucair.certification.register.tasks.Devices;
import co.com.choucair.certification.register.tasks.LastTask;
import co.com.choucair.certification.register.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SignInUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Laura");
    }
    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight()
                .wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^user create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUser.makeinformation());
        theActorInTheSpotlight().attemptsTo(Address.addressinformation());
        theActorInTheSpotlight().attemptsTo(Devices.devicesinformation());
        theActorInTheSpotlight().attemptsTo(LastTask.lastinformation());
    }


    @Then("^user sees its username$")
    public void userSeesItsUsername() {}
}
