package co.com.choucair.certification.register.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions ( features = "src/test/resources/features/signinuser.feature",
        glue = "co.com.choucair.certification.register.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SignInUser {

}
