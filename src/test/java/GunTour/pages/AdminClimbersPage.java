package GunTour.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
import static net.serenitybdd.core.Serenity.getDriver;

@DefaultUrl("https://guntour.vercel.app/users")
public class AdminClimbersPage {
    @Managed
    WebDriver driver = getDriver();

    private final By getClimbersTitle= By.xpath("//*[@id=\"root\"]/main/section/p[1]");
    private final By editClimbersButton = By.id("button-AdminUser");
    private final By closeButton = By.xpath("//*[@id=\"root\"]/main/section/div[3]/div/div/div/label/div");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean getClimbersTitle() {
        return driver.findElement(getClimbersTitle).isDisplayed();
    }
    public void clickEditClimbers() {
        driver.findElement(editClimbersButton).click();
        wait(2000);
    }
    public void clickCloseButton() {
        driver.findElement(closeButton).click();
        wait(2000);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
