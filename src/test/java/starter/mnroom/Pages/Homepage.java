package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://main-room.vercel.app")
public class Homepage extends PageObject {

    @FindBy(id = "btnSignup")
    WebElement registerButton;

    @FindBy(id = "allroom")
    WebElement homepageheader;

    @FindBy(id = "btnLogin")
    WebElement loginbutton;

    @FindBy(xpath = "//*[text()=\"Workspace\"]")
    WebElement workspace;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/img")
    WebElement room;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/nav/div[2]/button[2]/div/span/img")
    WebElement dropdownIcon;

    @FindBy(id = "btnCreate")
    WebElement createButton;

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

    public void clickDropdownIcon(){
        dropdownIcon.click();
    }

    public void selectCreateMenu(){
        createButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}