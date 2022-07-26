package starter.mnroom.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class FormRentPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/h1")
    WebElement formHeader;

//    @FindBy(xpath = "//*[@id=\":r8:\"]")
//    WebElement startDate;

    WebElement startDateInput = getDriver().findElement(By.xpath("//*[@id=\":rg:\"]"));
    WebElement endDateInput = getDriver().findElement(By.xpath("//*[@id=\":rh:\"]"));

//    @FindBy(xpath = "//*[@id=\":r9:\"]")
//    WebElement endDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[2]/div[3]/div/div[2]/input")
    WebElement paymentMethodBCA;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[3]/button")
    WebElement confirmButton;

    public String getFormHeader(){
        return formHeader.getText();
    }

//    public void selectStartDate(){
//        startDate.click();
//    }
//
//    public void selectEndDate(){
//        endDate.click();
//    }

    public void pickStartDate(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        getDriver().get("http://demo.guru99.com/test/");

        //Fill date as mm/dd/yyyy as 07/27/2022

        startDateInput.sendKeys("07272022");
    }

    public void pickEndDate(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        getDriver().get("http://demo.guru99.com/test/");

        //Fill date as mm/dd/yyyy as 07/27/2022


        endDateInput.sendKeys("07272022");
    }

    public void selectPayment(){
        paymentMethodBCA.click();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }


}
