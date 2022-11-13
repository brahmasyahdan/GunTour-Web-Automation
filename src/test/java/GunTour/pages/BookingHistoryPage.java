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
    //
    private final By popUpSuccessAddProduct = By.id("swal2-title");
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
