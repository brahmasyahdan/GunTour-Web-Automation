package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@DefaultUrl("https://guntour.vercel.app/")
public class HomePageAnonym extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By errorBookNowAnonymPopUpText = By.xpath("//*[@id=\"swal2-title\"]");
    private final By errorBookNowAnonymButton = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private final By buttonBookNowProduct1 = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/section[1]/div/div/div");
    private final By buttonBookNowProduct2 = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/section[2]/div/div/div");
    private final By buttonBookNowProduct3 = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/section[3]/div/div/div");
    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String errorBookNowPopUpText(){
       return driver.findElement(errorBookNowAnonymPopUpText).getText();
    }

    public void clickErrorBookNowPopUpButton(){
        driver.findElement(errorBookNowAnonymButton).click();
        wait(5000);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void clickButtonBookNowProduct(){
        driver.findElement(buttonBookNowProduct1).click();
        wait(5000);
    }
    public void clickButtonBookNowProduct2(){
        driver.findElement(buttonBookNowProduct2).click();
        wait(5000);
    }
    public void clickButtonBookNowProduct3(){
        driver.findElement(buttonBookNowProduct3).click();
        wait(5000);
    }
}
