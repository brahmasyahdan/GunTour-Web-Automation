package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@DefaultUrl("https://guntour.vercel.app/register")
public class RegisterPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By registerTittleElement= By.xpath("//*[@id=\"root\"]/main/section/article/h1");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrlRegister(){
        return driver.getCurrentUrl();
    }

    public String getRegisterTittle(){
        return driver.findElement(registerTittleElement).getText();
    }
}
