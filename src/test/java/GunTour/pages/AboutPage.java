package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class AboutPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By sejarahGunungTittle = By.xpath("//*[@id=\"root\"]/div/div/main[1]/article/h1");
    private final By visiDanMisiTittle = By.xpath("//*[@id=\"root\"]/div/div/main[2]/article/h1");
    private final By selengkapnyaButton = By.xpath("//*[@id=\" button-selengkapnya \"]/span");
    private final By mountGedeLogo = By.xpath("/html/body/div/div[2]/header[1]/div[1]/div/div[2]/div/div/a/img[3]");
    private final By sejarahTittle = By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[2]/div/div/h3");


    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isSejarahGunungTittleDisplayed(){
        return driver.findElement(sejarahGunungTittle).isDisplayed();
    }

    public boolean isVisiDanMisiTittleVisible(){
        return driver.findElement(visiDanMisiTittle).isDisplayed();
    }

    public void clickSelengkapNyaButton(){
        driver.findElement(selengkapnyaButton).click();
        wait(5000);
    }

    public boolean isMountGedeLogoDisplayed(){
        return driver.findElement(mountGedeLogo).isDisplayed();
    }

    public boolean isSejarahTittleDisplayed(){
        return driver.findElement(sejarahTittle).isDisplayed();
    }
}
