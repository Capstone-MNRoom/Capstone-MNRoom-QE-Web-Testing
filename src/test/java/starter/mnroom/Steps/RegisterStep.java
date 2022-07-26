package starter.mnroom.Steps;

import net.thucydides.core.annotations.Step;
import starter.mnroom.Pages.HomePage;
import starter.mnroom.Pages.LoginPage;
import starter.mnroom.Pages.RegisterPage;
import static org.junit.Assert.*;

public class RegisterStep {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Step
    public void openHomePage(){
        homePage.open();
    }

    @Step
    public void clickRegisterButton(){
        homePage.clickRegisterButton();
    }

    @Step
    public void verifyRegisterPage(){
        String headerPage = registerPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("sign up"));
    }

    @Step
    public void fillUsernameField(String username){
        registerPage.fillUsername(username);
    }

    @Step
    public void fillEmailField(String email){
        registerPage.fillEmail(email);
    }

    @Step
    public void fillPasswordField(String password){
        registerPage.fillPassword(password);
    }

    @Step
    public void fillPhoneField(String phone){
        registerPage.fillPhone(phone);
    }

    @Step
    public void fillAddressField(String address){
        registerPage.fillAddress(address);
    }

    @Step
    public void clickSignupButton(){
        registerPage.clickSignupButton();
    }

    @Step
    public void verifyLoginPage(){
        String headerPage = loginPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("login"));
    }
}
