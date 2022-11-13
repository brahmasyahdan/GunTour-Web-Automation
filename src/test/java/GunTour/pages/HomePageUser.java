package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
@DefaultUrl("https://guntour.vercel.app/home")
public class HomePageUser extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerProduct = By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/h5/span");
    private final By bookedNowNavbar = By.id("Booking-navbar");
    private final By loginSuccessPopUp = By.xpath("/html/body/div[2]/div");
    private final By rightArrowProduct = By.id("arrow-right");
    private final By leftArrowProduct = By.id("arrow-left");
    private final By communityPicture = By.xpath("//*[@id=\"root\"]/div/div/section[3]/div/div[2]/img");
    private final By googleMap = By.cssSelector("//a[contains(text(),'View larger map')]");
    private final By loginSuccessPopUpOk = By.xpath("/html/body/div[2]/div/div[6]/button[1]");

    private final By messageSuccessLogin = By.id("swal2-title");
    private final By guideNavbar = By.id("guide");
    private final By aboutNavbar = By.id("about");
    private final By avatarDropDownMenu = By.id("dropdown-menu");
    private final By heroNextImageRight = By.id("hero-next2");
    private final By heroPreviousImageLeft =By.id("hero-previous4");
    private final By imageSlide2 = By.id("slide2");
    private final By imageSlide4 = By.id("slide4");
    private final By imageDetailProduct1 = By.xpath("//*[@id=\"root\"]/div/div/section[1]/div/section[1]/figure");
    private final By imageDetailProduct2 = By.xpath("//*[@id=\"root\"]/div/div/section[1]/div/section[2]/figure");
    private final By imageDetailProduct3 = By.xpath("//*[@id=\"root\"]/div/div/section[1]/div/section[3]/figure");
    private final By buttonBookNowProduct1 = By.xpath("/html/body/div/div/div/section[1]/div/section[1]/div/div/div");
    private final By buttonBookNowProduct2 = By.xpath("//*[@id=\"root\"]/div/div/section[1]/div/section[2]/div/div/div");
    private final By buttonBookNowProduct3 = By.xpath("//*[@id=\"root\"]/div/div/section[1]/div/section[3]/div/div/div");
    private final By joinCommunityButton = By.id("join");
    private final By myBookingDropDown = By.id("mybooking-dropdown");
    private final By becomeRangerDropDown = By.id("become-ranger-dropdown");
    private final By logOutDropDown = By.id("logout-dropdown");
    private final By successBookingProductPopUp = By.id("swal2-title");
    private final By popUpSuccessAddProduct = By.id("swal2-title");
    private final By myBooking =By.xpath("//*[@id=\"mybooking-dropdown\"]/p");

    public String isSuccessBookingProductPopUpDisplayed(){
        return driver.findElement(successBookingProductPopUp).getText();
    }

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

    public void selectMyBookingDropDown(){
        driver.findElement(myBookingDropDown).click();
    }
    public void selectBecomeRanger(){
        driver.findElement(avatarDropDownMenu).click();
        driver.findElement(By.id("become-ranger-dropdown")).click();
        wait(2000);
    }
    public void selectLogOutDropDown(){
        driver.findElement(logOutDropDown).click();
    }

    public String getHeaderProduct(){
        return driver.findElement(headerProduct).getText();
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
//        WebElement element = driver.findElement(googleMap);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();

//        driver.findElement(googleMap).sendKeys(Keys.CONTROL, Keys.END);
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();


//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0, 2000);");
//        wait(2000);
        driver.findElement(googleMap).click();
    }
    public void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 2000);");
        wait(2000);
    }
    public String messageLoginSuccess(){
        return driver.findElement(messageSuccessLogin).getText();
    }
    public String messagePrompPopUp(){
        return driver.switchTo().alert().getText();
    }
    public void clickOKPromptPopUpButton(){
        driver.switchTo().alert().accept();
        wait(5000);
    }
    public void clickDropDown(){
        driver.findElement(avatarDropDownMenu);
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
        wait(3500);
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
        wait(5000);
    }
    public void clickImageToRedirectDetailPage2(){
        driver.findElement(imageDetailProduct2).click();
        wait(5000);
    }
    public void clickImageToRedirectDetailPage3(){
        driver.findElement(imageDetailProduct3).click();
    }
    public void clickButtonBookNowProduct(){
        driver.findElement(buttonBookNowProduct1).click();
    }
    public void clickButtonBookNowProduct2(){
        driver.findElement(buttonBookNowProduct2).click();
    }
    public void clickButtonBookNowProduct3(){
        driver.findElement(buttonBookNowProduct3).click();
    }
    public void clickJoinCommunityButton(){
        driver.findElement(joinCommunityButton).click();
        wait(5000);
    }

    public void clickDropDownMenu(){
        wait(5000);
        driver.findElement(avatarDropDownMenu).click();
    }
    public void clickMyBooking(){
        driver.findElement(myBooking).click();
    }
    public String getSuccessAddProduct(){
        return driver.findElement(popUpSuccessAddProduct).getText();
    }
}
