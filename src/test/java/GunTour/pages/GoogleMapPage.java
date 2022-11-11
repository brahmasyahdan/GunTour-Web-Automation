package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class GoogleMapPage extends PageObject {

    WebDriver driver = getDriver();

    private final By mountGede = By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/h1/span[1]");
    private final By mountGedeDescription = By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[6]/div/div/div[1]/div[1]/span");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isMountGedeDisplayed(){
        return driver.findElement(mountGede).isDisplayed();
    }

    public boolean isMountGedeDescriptionDisplayed(){
        return driver.findElement(mountGedeDescription).isDisplayed();
    }
}