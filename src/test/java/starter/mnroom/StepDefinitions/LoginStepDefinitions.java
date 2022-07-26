package starter.mnroom.StepDefinitions;

import starter.mnroom.Steps.LoginStep;
import starter.mnroom.Steps.RentRoomStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class LoginStepDefinitions {

    @Steps
    LoginStep loginStep;

//    @Given("user already on homepage")
//    public void userAlreadyOnHomepage() {
//        loginStep.verifyHomepage();
//    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginStep.clickLoginHomepage();
    }

    @Then("login page should be appear")
    public void loginPageShouldBeAppear() {
        loginStep.verifyLoginPage();
    }

    @When("user input email with valid email")
    public void userInputEmailWithValidEmail() {
        loginStep.fillEmail();
    }

    @And("user input password with valid password")
    public void userInputPasswordWithValidPassword() {
        loginStep.fillPassword();
    }

    @And("user click login button on login page")
    public void userClickLoginButtonOnLoginPage() throws AWTException {
        loginStep.clickLoginButton();
    }

    @Then("homepage should be appear")
    public void homepageShouldBeAppear() {
        loginStep.verifyHomepage();
    }
}
