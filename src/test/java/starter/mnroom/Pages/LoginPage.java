package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
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
//        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        // Switching to Alert
//        Alert alert = driver.switchTo().alert();
//
//        // Capturing alert message.
//        String alertMessage = driver.switchTo().alert().getText();
//        assertTrue(alertMessage.equalsIgnoreCase("success"));
//
//        // Accepting alert
//        alert.accept();
    }

    public void alertAcceptWithEnter() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER); //press enter key
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
