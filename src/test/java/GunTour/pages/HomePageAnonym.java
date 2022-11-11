package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://guntour.vercel.app/")
public class HomePageAnonym extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By productTittleAnonym = By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/h5/span");
    private final By bookingIconAnonym = By.xpath("//*[@id=\"root\"]/div/nav/div/div[1]/a/p");
    private final By loginSuccessPopUpAnonym = By.xpath("/html/body/div[2]/div");
    private final By rightArrowProductAnonym = By.xpath("//*[@id=\"root\"]/div/div/div[3]/button[2]");
    private final By leftArrowProductAnonym = By.xpath("//*[@id=\"root\"]/div/div/div[3]/button[1]");
    private final By communityPictureAnonym = By.xpath("//*[@id=\"root\"]/div/div/section[3]/div/div[2]/img");
    private final By googleMapAnonym = By.xpath("//*[@id=\"mapDiv\"]/div/div/div[2]/div[2]");

}
