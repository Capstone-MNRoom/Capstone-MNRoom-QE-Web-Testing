package starter.mnroom.Steps;

import starter.mnroom.Pages.Homepage;
import starter.mnroom.Pages.LoginPage;
import net.thucydides.core.annotations.Step;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {

    Homepage homepage;
    LoginPage loginPage;

    @Step
    public void verifyHomepage(){
        homepage.open();
        String header  = homepage.gethomepageheader();
        assertTrue(header.equalsIgnoreCase("All"));
    }

    @Step
    public void clickLoginHomepage(){
        homepage.clickLoginHomepage();
    }

    @Step
    public void verifyLoginPage(){
        String header  = loginPage.getLoginHeader();
        assertTrue(header.equalsIgnoreCase("LOGIN"));
    }

    @Step
    public void fillEmail(){
        loginPage.fillEmail();
    }

    @Step
    public void fillPassword(){
        loginPage.fillPassword();
    }

    @Step
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
}
