package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://main-room.vercel.app")
public class Homepage extends PageObject {

    @FindBy(id = "allroom")
    WebElement homepageheader;

    @FindBy(id = "btnLogin")
    WebElement loginbutton;

    @FindBy(id = "workspace")
    WebElement workspace;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/img")
    WebElement room;

    public String gethomepageheader(){
        return homepageheader.getText();
    }

    public void clickLoginHomepage(){
        loginbutton.click();
    }

    public void selectWorkspace(){
        workspace.click();
    }

    public void selectRoom(){
        room.click();
    }
}
