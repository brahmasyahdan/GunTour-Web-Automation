package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://guntour.vercel.app/booking")
public class BookingPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();
    private final By fromDate = By.xpath("/html/body/div/div/div/main/article[1]/section/input");
    private final By toDate = By.xpath("/html/body/div/div/div/main/article[2]/section/input");
    private final By dropDownEntrance = By.id("category");
    private final By dropDownRangers = By.id("categoryRanger");
    private final By dropDownPerson = By.id("categoryPerson");
    private final By imageBookingPage= By.xpath("/html/body/div/div/div/header/img");
    private final By minusButtonProduct1 = By.xpath("/html/body/div/div/div/section/div/section/div/div[2]/div[1]/div/button[1]/svg/path");
    private final By plusButtonProduct1 = By.xpath("/html/body/div/div/div/section/div/section/div/div[2]/div[1]/div/button[2]/svg/path");
    private final By removeProduct1 = By.xpath("/html/body/div/div/div/section/div/section/div/div[2]/div[2]/button");
    private final By numberProduct = By.xpath("/html/body/div/div/div/section/div/section/div/div[2]/div[1]/div/p");
    private final By thisProductHereAreOptional= By.xpath("/html/body/div/div/div/p");
    private final By bookedNowButton =By.id("booked-now");

    public void inputFromDate(String date){
        driver.findElement(fromDate).sendKeys(date);
    }
    public void inputToDate(String date){
        driver.findElement(toDate).sendKeys(date);
    }
    public void clickDropDownEntrance(){
        driver.findElement(dropDownEntrance).click();
    }
    public void clickDropDownRangers(){
        driver.findElement(dropDownRangers).click();
    }
    public void clickDropDownPerson(){
        driver.findElement(dropDownPerson).click();
    }
    public void selectDropDownEntrance(String menu){
        WebElement selectElement = driver.findElement(dropDownEntrance);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(menu);
    }
    public void selectDropDownPerson(String menu){
        WebElement selectElement = driver.findElement(dropDownPerson);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(menu);
    }
    public void selectDropDownRangers(String menu){
        WebElement selectElement = driver.findElement(dropDownRangers);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(menu);
    }
    public boolean isImageBookingPageVisible(){
        return driver.findElement(imageBookingPage).isDisplayed();
    }
    public boolean isThisProductHereAreOptionalVisible(){
        return driver.findElement(thisProductHereAreOptional).isDisplayed();
    }
    public void clickMinusButtonProduct(){
        driver.findElement(minusButtonProduct1).click();
    }
    public void clickPlusButtonProduct(){
        driver.findElement(plusButtonProduct1).click();
    }
    public String numberOfProduct(String number){
        return driver.findElement(numberProduct).getText();
    }
    public void clickRemoveProductButton(){
        driver.findElement(removeProduct1).click();
    }
    public void clickBookedNowButton(){
        driver.findElement(bookedNowButton).click();
    }

}
