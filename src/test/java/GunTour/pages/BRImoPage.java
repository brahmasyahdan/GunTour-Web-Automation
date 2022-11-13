package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BRImoPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By payNow=By.xpath("/html/body/div[2]/div/div/div[5]/button");
    private final By inputUserBRImo=By.id("inputMerchantId");
    private final By bayarButton=By.xpath("/html/body/div/div[2]/form/div[3]/div/div/button[1]");
    private final By alertSuccess= By.xpath("/html/body/div[2]/div[2]");
    private final By backToMerchant=By.xpath("/html/body/div[2]/form/div/div/button");


    public void clickPayNowBRImo(){
        driver.findElement(payNow).click();
    }
    public void inputUserBRImo(String username){
        driver.findElement(inputUserBRImo).sendKeys(username);
    }
    public void clickBayarButton(){
        driver.findElement(bayarButton).click();
    }
    public void clickBackToWebsiteMerchant(){
        driver.findElement(backToMerchant).click();
    }
    public boolean isSuccessMessageVisible(){
        return driver.findElement(alertSuccess).isDisplayed();
    }
}
