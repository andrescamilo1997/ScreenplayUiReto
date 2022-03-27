package co.com.sofka.runner.automationpractice;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/automationpractice/login/login.feature"},
        glue = {"co.com.sofka.stepDefinitions.automationpractice"}
)

public class LoginRunner {
}
