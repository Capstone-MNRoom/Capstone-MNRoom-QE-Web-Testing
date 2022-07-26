package starter.mnroom.Steps;

import starter.mnroom.Pages.CreateRoomPage;
import starter.mnroom.Pages.Homepage;

import static org.junit.Assert.assertTrue;

public class CreateRoomStep {

    Homepage homepage;
    CreateRoomPage createRoomPage;

    public void clickLogoDropdown(){
        homepage.clickDropdownIcon();
    }

    public void openCreateRoom(){
        homepage.selectCreateMenu();
    }

    public void verifyCreateRoomPage(){
        String header = createRoomPage.getCreateHeader();
        assertTrue(header.equalsIgnoreCase("Create Room"));
    }

    public void fillRoomName(String room){
        createRoomPage.fillRoomName(room);
    }

    public void fillPrice(String price){
        createRoomPage.fillPrice(price);
    }

    public void fillCapacity(String capacity){
        createRoomPage.fillCapacity(capacity);
    }

    public void fillHotelName(String hotel){
        createRoomPage.fillHotelName(hotel);
    }

    public void fillCity(String city){
        createRoomPage.fillCity(city);
    }

    public void fillAddress(String address){
        createRoomPage.fillAddress(address);
    }

    public void selectCategoryBallroom(){
        createRoomPage.selectCategory();
    }

    public void selectFacility(){
        createRoomPage.selectFacility();
    }

    public void clickCreateButton(){
        createRoomPage.clickCreate();
    }
}