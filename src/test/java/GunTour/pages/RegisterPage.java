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
    private final By inputFullNameElement=By.xpath("//*[@id=\"fullname\"]");
    private final By inputEmailElement=By.xpath("//*[@id=\"email\"]");
    private final By inputPasswordElement=By.xpath("//*[@id=\"password\"]");
    private final By buttonRegisterAccountElement=By.xpath("//*[@id=\"register\"]");
    private final By popUpRegisterButtonSuccesElement=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private final By popUpPleaseEnterFullNameElement=By.xpath("/html/body/div[2]/div");
    private final By popUpDataCantBeEmptyElement=By.xpath("/html/body/div[2]/div");
    private final By loginLinkElement=By.xpath("//*[@id=\"login\"]");

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

    public void inputFullNameElement(String fullname){
        driver.findElement(inputFullNameElement).sendKeys(fullname);
        wait(1000);
    }

    public void inputEmailElement(String email){
        driver.findElement(inputEmailElement).sendKeys(email);
        wait(1000);
    }

    public void inputPassword(String password){
        driver.findElement(inputPasswordElement).sendKeys(password);
        wait(1000);
    }

    public void clickButtonRegisterAccount(){

        driver.findElement(buttonRegisterAccountElement).click();
        wait(1000);
    }
    public void clickButtonPopUpSuccesRegister(){
        driver.findElement(popUpRegisterButtonSuccesElement).click();
        wait(1000);
    }
    public void popUpPleaseEnterFullNameElement(){
        driver.findElement(popUpPleaseEnterFullNameElement).isDisplayed();
    }
    public void popUpDataCantBeEmptyElement(){
        driver.findElement(popUpDataCantBeEmptyElement).isDisplayed();
    }

    public void loginLinkElement(){
        driver.findElement(loginLinkElement).click();
    }
}
