package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://guntour.vercel.app/admin")
public class adminRangerPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();
}
