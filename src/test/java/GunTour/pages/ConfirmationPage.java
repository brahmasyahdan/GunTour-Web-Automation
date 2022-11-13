package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://guntour.vercel.app/confirm")
public class ConfirmationPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By paymentDesc=By.xpath("/html/body/div/div/div/main/section/h5");
    private final By ticketQuantity=By.xpath("/html/body/div/div/div/main/section/p[1]");
    private final By alertSuccess= By.xpath("//*[@id=\"swal2-title\"]");
    private final By confirmButton = By.id("confirm-booking");
    private final By cancelButton = By.id("cancel-book");

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public boolean isPaymentDescriptionVisible(){
        return driver.findElement(paymentDesc).isDisplayed();
    }
    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void clickCancelButton(){
        driver.findElement(cancelButton).click();
    }
    public String getConfirmationSuccessfulMessage(){
        return driver.findElement(alertSuccess).getText();
    }
}
