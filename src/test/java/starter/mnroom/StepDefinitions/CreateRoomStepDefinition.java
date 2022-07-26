package starter.mnroom.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mnroom.Steps.CreateRoomStep;

public class CreateRoomStepDefinition {

    @Steps
    CreateRoomStep createRoomStep;

    @When("user click on logo icon")
    public void userClickOnLogoIcon() {
        createRoomStep.clickLogoDropdown();
    }

    @And("user click on create room menu")
    public void userClickOnCreateRoomMenu() {
        createRoomStep.openCreateRoom();
    }


    @Then("create menu page should be appear")
    public void createMenuPageShouldBeAppear() {
        createRoomStep.verifyCreateRoomPage();
    }

    @When("user input valid name room {string}")
    public void userInputValidNameRoom(String roomname) {
        createRoomStep.fillRoomName(roomname);
    }

    @And("user input valid price {string}")
    public void userInputValidPrice(String price) {
        createRoomStep.fillPrice(price);
    }

    @And("user input valid capacity {string}")
    public void userInputValidCapacity(String capacity) {
        createRoomStep.fillCapacity(capacity);
    }

    @And("user input valid hotel name {string}")
    public void userInputValidHotelName(String hotelname) {
        createRoomStep.fillHotelName(hotelname);
    }

    @And("user input valid city {string}")
    public void userInputValidCity(String city) {
        createRoomStep.fillCity(city);
    }

    @And("user input valid address {string}")
    public void userInputValidAddress(String address) {
        createRoomStep.fillAddress(address);
    }

    @And("user select ballroom category")
    public void userSelectBallroomCategory() {
        createRoomStep.selectCategoryBallroom();
    }

    @And("user select facilities")
    public void userSelectFacilities() {
        createRoomStep.selectFacility();
    }

    @And("user click create button")
    public void userClickCreateButton() {
        createRoomStep.clickCreateButton();
    }

    @Then("room should be created")
    public void roomShouldBeCreated() {
    }
}