package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PaymentPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]")
    WebElement paymentHeader;

    @FindBy(id = "btn-confirm-payment")
    WebElement confirmPayButton;

    public String getPaymentHeader(){
        return paymentHeader.getText();
    }

    public void clickConfirmPayButton(){
        confirmPayButton.click();
    }
}
