package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class FormRentPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/h1")
    WebElement formHeader;

//    WebElement startDateInput = getDriver().findElement(By.xpath("//*[@id=\":rg:\"]"));
//    WebElement endDateInput = getDriver().findElement(By.xpath("//*[@id=\":rh:\"]"));

    @FindBy(id = "start_date-label")
    WebElement startDate;

    @FindBy(id = "end_date-label")
    WebElement endDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[2]/div[3]/div/div[2]/input")
    WebElement paymentMethodBCA;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[3]/button")
    WebElement confirmButton;

    public String getFormHeader(){
        return formHeader.getText();
    }

    public void selectStartDate(){
        startDate.sendKeys("07272022");
    }

    public void selectEndDate(){
        endDate.sendKeys("07272022");
    }

//    public void pickStartDate(){
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//
//        getDriver().get("http://demo.guru99.com/test/");
//
//        //Fill date as mm/dd/yyyy as 07/27/2022
//
//        startDateInput.sendKeys("07272022");
//    }
//
//    public void pickEndDate(){
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//
//        getDriver().get("http://demo.guru99.com/test/");
//
//        //Fill date as mm/dd/yyyy as 07/27/2022
//
//
//        endDateInput.sendKeys("07272022");
//    }

    public void selectPayment(){
        paymentMethodBCA.click();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }


}