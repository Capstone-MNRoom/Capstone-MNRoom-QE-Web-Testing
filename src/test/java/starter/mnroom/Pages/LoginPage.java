package starter.mnroom.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://main-room.vercel.app/login")
public class LoginPage extends PageObject {

    @FindBy(id = "Login")
    WebElement loginPageHeader;

    public String getHeaderPage(){
        return loginPageHeader.getText();
    }
}
