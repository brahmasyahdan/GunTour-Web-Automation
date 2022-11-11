package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://guntour.vercel.app/confirm")
public class ConfirmationPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By paymentDesc=By.xpath("/html/body/div/div/div/main/section/h5");
    private final By ticketQuantity=By.xpath("/html/body/div/div/div/main/section/p[1]");
    private final By confirmButton = By.id("confirm-booking");
    private final By cancelButton = By.id("cancel-book");
    
}
