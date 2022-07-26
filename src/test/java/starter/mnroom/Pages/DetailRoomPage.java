package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DetailRoomPage extends PageObject {

    @FindBy(id = "hotel_name")
    WebElement roomname;

    @FindBy(id = "btn_order")
    WebElement orderButton;

    public String getRoomName(){
        return roomname.getText();
    }

    public void clickOrder(){
        orderButton.click();
    }
}
