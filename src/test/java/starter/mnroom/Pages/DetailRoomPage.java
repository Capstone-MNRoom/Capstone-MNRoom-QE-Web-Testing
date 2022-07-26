package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DetailRoomPage extends PageObject {

    @FindBy(id = "hotel_name")
    WebElement roomname;

//    @FindBy(id = "btn_order")
//    WebElement orderButton;

    public String getRoomName(){
        return roomname.getText();
    }

    public void clickOrder(){
//        getDriver().findElement(By.className("bg-orange-600 hover:bg-orange-400 font-bold py-2 px-2 mb-3 rounded text-white")).click();
        getDriver().findElement(By.cssSelector("#btn_order")).click();
    }
}
