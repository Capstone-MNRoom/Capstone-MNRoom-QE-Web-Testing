package starter.mnroom.Steps;

import starter.mnroom.Pages.*;
import net.thucydides.core.annotations.Step;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RentRoomStep {

    LoginPage loginPage;
    Homepage homepage;
    DetailRoomPage detailRoomPage;
    FormRentPage formRentPage;
    PaymentPage paymentPage;

    @Step
    public void beforeStepBelow() {
        homepage.open();
        homepage.clickLoginHomepage();

        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickLoginButton();
    }

    @Step
    public void selectCategory(){
        homepage.selectWorkspace();
    }

    @Step
    public void selectRoom(){
        homepage.selectRoom();
    }

    @Step
    public void verifyDetailRoomPage(){
        String header  = detailRoomPage.getRoomName();
        assertTrue(header.equalsIgnoreCase("Arjuna"));
    }

    @Step
    public void clickOrderButton(){
        detailRoomPage.clickOrder();
    }

    @Step
    public void verifyFormRentPage(){
        String header = formRentPage.getFormHeader();
        assertTrue(header.equalsIgnoreCase("Form Rent Room"));
    }

    @Step
    public void selectStartDate(){
        formRentPage.selectStartDate();
    }

    @Step
    public void selectEndDate(){
        formRentPage.selectEndDate();
    }

    @Step
    public void selectPaymentMethod(){
        formRentPage.selectPayment();
    }

    @Step
    public void clickConfirm(){
        formRentPage.clickConfirmButton();
    }

    @Step
    public void verifyPaymentPage(){
        paymentPage.getPaymentHeader();
    }

    @Step
    public void clickConfirmPay(){
        paymentPage.clickConfirmPayButton();
    }
}
