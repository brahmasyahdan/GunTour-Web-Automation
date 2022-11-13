package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class BCAKlikPayPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();
    private final By payNowBCA=By.xpath("/html/body/div[2]/div/div/div[5]/button");
    private final By bayarButton = By.xpath("/html/body/div/div[2]/form/div[5]/div/button");
    private final By transactionSuccess= By.xpath("/html/body/div/div[2]/div[2]");
    private final By backToMerchantButton=By.xpath("/html/body/div/div[2]/form/div/div/button");
    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickPayNowBCA(){
        driver.findElement(payNowBCA).click();
    }
    public void clickBayarButton(){
        driver.findElement(bayarButton).click();
    }
    public boolean isTransactionSuccessVisible (){
       return driver.findElement(transactionSuccess).isDisplayed();
    }
    public void clickBackToMerchantButton(){
        driver.findElement(backToMerchantButton).click();
    }
}
