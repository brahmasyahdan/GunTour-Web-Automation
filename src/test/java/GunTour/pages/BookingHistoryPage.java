package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://guntour.vercel.app/history")
public class BookingHistoryPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By imageHeaders= By.xpath("/html/body/div/div/div/header/img");
    private final By buttonPayNow= By.xpath("/html/body/div/div/div/section[1]/div/div/a/button");
    private final By deleteButton= By.xpath("/html/body/div/div/div/section[1]/div/div/div");
    private final By statusProduct=By.xpath("/html/body/div/div/div/section[1]/div/p[2]");
    private final By yesDeleteit= By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    //
    private final By popUpSuccessAddProduct = By.id("swal2-title");

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void clickPayNowButton(){
        driver.findElement(buttonPayNow).click();
    }
    public String statusBookingProduct(){
        return driver.findElement(statusProduct).getText();
    }
    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }
    public void clickYesDeleteIt(){
        driver.findElement(yesDeleteit).click();
    }
    public boolean isPayNowButtonVisible(){
       return driver.findElements(buttonPayNow).isEmpty();
    }
}
