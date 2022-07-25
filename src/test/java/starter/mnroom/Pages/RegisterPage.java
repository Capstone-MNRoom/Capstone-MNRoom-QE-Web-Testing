package starter.mnroom.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://main-room.vercel.app/register")
public class RegisterPage extends PageObject {

    @FindBy(id = "Signup")
    WebElement signupHeader;

    @FindBy(id = "registerName")
    WebElement usernameField;

    @FindBy(id = "registerEmail")
    WebElement emailField;

    @FindBy(id = "registerPassword")
    WebElement passwordField;

    @FindBy(id = "registerPhone")
    WebElement phoneField;

    @FindBy(id = "registerAddress")
    WebElement addressField;

    @FindBy(id = "btnSignup")
    WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/form/a")
    WebElement loginLink;

    @FindBy(id = "__next-route-announcer__")
    WebElement registerSuccess;


    public String getHeaderPage(){
        return signupHeader.getText();
    }

    public void fillUsername(String username){
        usernameField.sendKeys(username);
    }

    public void fillEmail(String email){
        emailField.sendKeys(email);
    }

    public void fillPassword(String password){
        passwordField.sendKeys(password);
    }

    public void fillPhone(String phone){
        phoneField.sendKeys(phone);
    }

    public void fillAddress(String address){
        addressField.sendKeys(address);
    }

    public void clickSignupButton(){
        signupButton.click();
    }

    public void clickRegisterAlert(){
        registerSuccess.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }




}
