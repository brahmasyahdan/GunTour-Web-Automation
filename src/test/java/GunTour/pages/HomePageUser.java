package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;
@DefaultUrl("https://guntour.vercel.app/home")
public class HomePageUser extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By productTittle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/h5/span");
    private final By bookedNowNavbar = By.id("Booking-navbar");
    private final By loginSuccessPopUp = By.xpath("/html/body/div[2]/div");
    private final By rightArrowProduct = By.id("arrow-right");
    private final By leftArrowProduct = By.id("arrow-left");
    private final By communityPicture = By.xpath("//*[@id=\"root\"]/div/div/section[3]/div/div[2]/img");
    private final By googleMap = By.xpath("//*[@id=\"mapDiv\"]/div/div/div[2]/div[2]");
    private final By loginSuccessPopUpOk = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private final By messageSuccessLogin = By.id("swal2-title");
    private final By guideNavbar = By.id("guide");
    private final By aboutNavbar = By.id("about");
    private final By avatarDropDownMenu = By.id("dropdown-menu");
    private final By heroNextImageRight = By.id("hero-next2");
    private final By heroPreviousImageLeft =By.id("hero-previous4");
    private final By imageSlide2 = By.id("slide2");
    private final By imageSlide4 = By.id("slide4");
    private final By imageDetailProduct1 =By.xpath("/html/body/div/div/div/section[1]/div/section[1]/figure");
    private final By buttonBookNowProduct1 = By.xpath("/html/body/div/div/div/section[1]/div/section[1]/div/div/div");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getProductTittle(){
        return driver.findElement(productTittle).getText();
    }

    public boolean isBookedNowNavbarVisible(){
        return driver.findElement(bookedNowNavbar).isDisplayed();
    }

    public boolean isPopUpVisible(){
        return driver.findElement(loginSuccessPopUp).isDisplayed();
    }

    public boolean isCommunityPictureVisible(){
        return driver.findElement(communityPicture).isDisplayed();
    }

    public void clickPopUpLoginSuccess(){
        driver.findElement(loginSuccessPopUpOk).click();
        wait(1000);
    }

    public void clickMap(){
        driver.findElement(googleMap).click();
        wait(1000);
    }
    public String messageLoginSuccess(){
       return driver.findElement(messageSuccessLogin).getText();
    }
    public String messagePrompPopUp(){
        return driver.switchTo().alert().getText();
    }
    public void clickOKPromptPopUpButton(){
        driver.switchTo().alert().accept();
    }
    public void selectDropDownMenu(String menu){
        WebElement selectElement = driver.findElement(avatarDropDownMenu);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(menu);
    }
    public void clickNextImageRight(){
        driver.findElement(heroNextImageRight).click();
    }
    public void clickPreviousImageLeft(){
        driver.findElement(heroPreviousImageLeft).click();
    }
    public void clickGuideNavbar(){
        driver.findElement(guideNavbar).click();
    }
    public void clickAboutNavbar(){
        driver.findElement(aboutNavbar).click();
    }
    public void clickBookedNowNavabr(){
        driver.findElement(bookedNowNavbar).click();
    }
    public void clickRightArrowProduct(){
        driver.findElement(rightArrowProduct).click();
    }
    public void clickLeftArrowProduct(){
        driver.findElement(leftArrowProduct).click();
    }
    public boolean isImageSLide2IsVisible(){
        return driver.findElement(imageSlide2).isDisplayed();
    }
    public boolean isImageSLide4IsVisible(){
        return driver.findElement(imageSlide4).isDisplayed();
    }
    public void clickImageToRedirectDetailPage(){
        driver.findElement(imageDetailProduct1).click();
    }
    public void clickButtonBookNowProduct(){
        driver.findElement(buttonBookNowProduct1).click();
    }

}
