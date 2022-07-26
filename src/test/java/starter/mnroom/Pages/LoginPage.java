package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DefaultUrl("https://main-room.vercel.app/login")
public class LoginPage extends PageObject {
    @FindBy(id = "Login")
    WebElement loginheader;

    @FindBy(id = "loginEmail")
    WebElement emailfield;

    @FindBy(id = "loginPassword")
    WebElement passwordfield;

    @FindBy(id = "btnLogin")
    WebElement loginclick;

    public String getLoginHeader(){
        return loginheader.getText();
    }

    public void fillEmail(){
        emailfield.sendKeys("hannah@gmail.com");
    }

    public void fillPassword(){
        passwordfield.sendKeys("hannahbahn");
    }

    public void clickLoginButton(){
        loginclick.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Switching to Alert
        Alert alert = getDriver().switchTo().alert();

        // Capturing alert message.
        String alertMessage = getDriver().switchTo().alert().getText();

        // Accepting alert
        alert.accept();
    }
}