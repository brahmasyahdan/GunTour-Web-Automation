package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class MidtransPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By selectMethod=By.xpath("/html/body/div[2]/div/div/div");
    private final By merchantName=By.xpath("/html/body/div[2]/div/nav/div[1]/div/div");
    private final By bcaKlikPay = By.xpath("/html/body/div[2]/div/div/a[2]/div[2]");
    private final By brimo= By.xpath("/html/body/div[2]/div/div/a[3]/div[2]");
    private final By bankTransfer= By.xpath("/html/body/div[2]/div/div/a[6]/div[2]");
    private final By permataBank=By.xpath("/html/body/div[2]/div/div/div[2]/a[2]/div");
    private final By vaField= By.id("vaField");
    private final By backToMerchant=By.xpath("/html/body/div[2]/div/div/div/div[2]/div/button");

    public boolean isSelectMethodVisible(){
        return driver.findElement(selectMethod).isDisplayed();
    }
    public boolean isMerchantNameVisible(){
        return driver.findElement(merchantName).isDisplayed();
    }
    public void clickBCAKlikPay(){
        driver.findElement(bcaKlikPay).click();
    }
    public void selectBankTransfer(){
        driver.findElement(bankTransfer).click();
    }
    public void clickPermataBank(){
        driver.findElement(permataBank).click();
    }
    public boolean isVirtualAccountVisible(){
        return driver.findElement(vaField).isDisplayed();
    }
    public void clickBackToMerchant(){
        driver.findElement(backToMerchant).click();
    }
    public void clickBRImo(){
        driver.findElement(brimo).click();
    }
}
