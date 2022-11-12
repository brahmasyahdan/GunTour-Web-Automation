package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailProductPage extends PageObject {

    WebDriver driver = getDriver();

    private final By descriptionProduct = By.xpath("//*[@id=\"root\"]/div/div/main/article/section/div[2]/h5");
    private final By warningProductNote = By.xpath("//*[@id=\"root\"]/div/div/main/article/section/div[3]/h5");


    public boolean isDescriptionProductVisible(){
        return driver.findElement(descriptionProduct).isDisplayed();
    }
    public boolean isWarningProductNote(){
        return driver.findElement(warningProductNote).isDisplayed();
    }
}
