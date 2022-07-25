package starter.mnroom.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://main-room.vercel.app/")
public class HomePage extends PageObject {

    @FindBy(id = "btnSignup")
    WebElement registerButton;

    public void clickRegisterButton(){
        registerButton.click();
    }

}
