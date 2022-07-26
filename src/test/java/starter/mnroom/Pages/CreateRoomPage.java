package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://main-room.vercel.app/CreateRoom")
public class CreateRoomPage extends PageObject {

    @FindBy(id = "createRoom")
    WebElement createRoomHeader;

    @FindBy(id = "createRoomName")
    WebElement roomNameField;

    @FindBy(id = "createRoomPrice")
    WebElement priceField;

    @FindBy(id = "createRoomCapacity")
    WebElement capacityField;

    @FindBy(id = "createHotelName")
    WebElement hotelNameField;

    @FindBy(id = "createHotelCity")
    WebElement cityField;

    @FindBy(id = "createHotelAddress")
    WebElement addressField;

    //    @FindBy(id = "dropdownCategory")
    @FindBy(xpath = "//*[@id=\"dropdownCategory\"]")
    WebElement dropdownCategory;

//    @FindBy(xpath = "\"//*[text()=\\\"Ballroom\\\"]\"")
//    WebElement category;

    @FindBy(id = "dropdownFacility")
    WebElement dropdownFacility;

    @FindBy(xpath = "\"//*[text()=\\\"Meja\\\"]\"")
    WebElement mejaFacility;

    @FindBy(xpath = "\"//*[text()=\\\"Kursi\\\"]\"")
    WebElement kursiFacility;

    @FindBy(id = "btnCreateRoom")
    WebElement createButton;

    public String getCreateHeader(){
        return createRoomHeader.getText();
    }

    public void fillRoomName(String room){
        roomNameField.sendKeys(room);
    }

    public void fillPrice(String price){
        priceField.sendKeys(price);
    }

    public void fillCapacity(String capacity){
        capacityField.sendKeys(capacity);
    }

    public void fillHotelName(String hotel){
        hotelNameField.sendKeys(hotel);
    }

    public void fillCity(String city){
        cityField.sendKeys(city);
    }

    public void fillAddress(String address){
        addressField.sendKeys(address);
    }

    public void selectCategory(){
        dropdownCategory.click();
        dropdownCategory.sendKeys("Ballroom");
        dropdownCategory.sendKeys(Keys.ENTER);
    }

    public void selectFacility(){
        dropdownFacility.click();
        mejaFacility.click();
        kursiFacility.click();
    }

    public void clickCreate(){
        createButton.click();
    }
}