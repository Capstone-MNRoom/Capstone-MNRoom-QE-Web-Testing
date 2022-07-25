package starter.mnroom.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mnroom.Steps.RegisterStep;

public class RegisterStepDefinition {

    @Steps
    RegisterStep registerStep;

    @Given("user already on homepage")
    public void userAlreadyOnHomepage(){
        registerStep.openHomePage();
    }

    @When("user click register button")
    public void userClickRegisterButton() {
        registerStep.clickRegisterButton();
    }

    @Then("register page appear")
    public void registerPageAppear() {
        registerStep.verifyRegisterPage();
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
        registerStep.fillUsernameField(username);

    }

    @And("user input email with {string}")
    public void userInputEmailWith(String email) {
        registerStep.fillEmailField(email);

    }

    @And("user input password with with {string}")
    public void userInputPasswordWithWith(String password) {
        registerStep.fillPasswordField(password);
    }

    @And("user input phone number with {string}")
    public void userInputPhoneNumberWith(String phone) {
        registerStep.fillPhoneField(phone);

    }

    @And("user input address with {string}")
    public void userInputAddressWith(String address) {
        registerStep.fillAddressField(address);

    }

    @And("user click signup button")
    public void userClickSignupButton() {
        registerStep.clickSignupButton();

    }

    @Then("login page appear")
    public void loginPageAppear() {
        registerStep.verifyLoginPage();
    }
}
