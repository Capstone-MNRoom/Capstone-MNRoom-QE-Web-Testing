package starter.mnroom.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mnroom.Steps.LoginStep;
import starter.mnroom.Steps.RentRoomStep;

import java.awt.*;

public class RentRoomStepDefinition {
    @Steps
    RentRoomStep rentRoomStep;

    @Given("user already login")
    public void userAlreadyLogin() {
        rentRoomStep.beforeStepBelow();
    }

    @When("user select category")
    public void userSelectCategory() {
        rentRoomStep.selectCategory();
    }

    @And("user select a room")
    public void userSelectARoom() {
        rentRoomStep.selectRoom();
    }

    @Then("detail room page should be appear")
    public void detailRoomPageShouldBeAppear() {
        rentRoomStep.verifyDetailRoomPage();
    }

    @When("user click on order button")
    public void userClickOnOrderButton() {
        rentRoomStep.clickOrderButton();
    }

    @Then("rent form page should be appear")
    public void rentFormPageShouldBeAppear() {
        rentRoomStep.verifyFormRentPage();
    }

    @When("user select valid start date")
    public void userSelectValidStartDate() {
        rentRoomStep.selectStartDate();
    }

    @And("user select valid end date")
    public void userSelectValidEndDate() {
        rentRoomStep.selectEndDate();
    }

    @And("user select payment method")
    public void userSelectPaymentMethod() {
        rentRoomStep.selectPaymentMethod();
    }

    @When("user click on confirm button")
    public void userClickOnConfirmButton() {
        rentRoomStep.clickConfirm();
    }

    @Then("confirmation payment page should be appear")
    public void confirmationPaymentPageShouldBeAppear() {
        rentRoomStep.verifyPaymentPage();
    }

    @Then("history page should be appear")
    public void historyPageShouldBeAppear() {
        rentRoomStep.clickConfirmPay();
    }
}
