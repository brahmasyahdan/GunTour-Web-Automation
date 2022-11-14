package GunTour.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Thread.sleep;

@DefaultUrl("https://guntour.vercel.app/adminranger")
public class AdminProductPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR+"/src/test/resources/images";
    By clickOk = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    By productMenuButton = By.id("product-sidebar");
    By usersMenuButton = By.id("users-sidebar");
    By tableTitle = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/table/thead/tr/th[3]");
    By addProductButton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/label");
    By closeButton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/label/div");
    By closeButtonEditModal = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/table/tbody[1]/tr/td[4]/div/button[1]/div/div/div/label/div");
    By productPhotoElement = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[2]/div/input");
    By fieldProductName = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[3]/input");
    By fieldRentPrice = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[4]/input");
    By fieldDesc = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[5]/textarea");
    By fieldWarning = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[6]/textarea");
    By saveDataModal = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[8]");
    By alertTitlePopup = By.id("swal2-title");
    By editProductButton = By.xpath("//*[@id=\"button-edit-1\"]");
    By fieldEditProductPhoto = By.xpath("//*[@id=\"input-photo-product\"]");
    By fieldEditProductName = By.id("input-name-product");
    By fieldEditRentPrice = By.id("input-rent-product");
    By fieldEditDesc = By.id("input-desc-product");
    By fieldEditWarning = By.id("input-note-product");
    By editProductButtonModal = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/table/tbody[1]/tr/td[4]/div/button[1]/div/div/div/div[8]");
    By nextPageButton = By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div/button[2]");
    By logoutButton = By.id("button-logout-sidebar");
//   By deleteProductButton = By.id("168");

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

    public void clickProductMenu(){
        driver.findElement(productMenuButton);
        wait(1000);
    }
    public void clickUsersMenu() {
        driver.findElement(usersMenuButton).click();
        wait(1000);
    }
    public void clickOk(){
        driver.findElement(clickOk).click();
        wait(1000);
    }
    public boolean getTableTitle(){
        return driver.findElement(tableTitle).isDisplayed();
    }
    public void clickAddProductButton(){
        driver.findElement(addProductButton).click();
        wait(1000);
    }
//    public void ClickProductButton(){
//        driver.findElement(productButton).click();
//    }
    public void scrollToCloseButton() {
//        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div"));
//// Select last child of content div
//        WebElement element = driver.findElement();
//// Scroll to last child node
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div")).sendKeys(Keys.CONTROL, Keys.END);
//        wait(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait(1000);
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
    public void clickCloseButton(){
        driver.findElement(closeButton).click();
        wait(1000);
    }
    public void clickCloseButtonEditModal(){
        driver.findElement(closeButtonEditModal).click();
        wait(1000);
    }
    public void inputAddProductPhoto(){
        WebElement element= getDriver().switchTo().activeElement().findElement(productPhotoElement);
        element.sendKeys(IMAGE_FOLDER+"/Tenda Big Size.jpg");
        wait(1000);
    }
    public void inputProductName(String productName) {
        driver.findElement(fieldProductName).sendKeys(productName);
        wait(1000);
    }
    public void inputRentPrice(String rentPrice) {
        driver.findElement(fieldRentPrice).sendKeys(rentPrice);
        wait(1000);
    }
    public void inputDesc(String desc) {
        driver.findElement(fieldDesc).sendKeys(desc);
        wait(1000);
    }
    public void inputWarning(String warning) {
        driver.findElement(fieldWarning).sendKeys(warning);
        wait(1000);
    }
    public void clickSaveDataButton(){
        driver.findElement(saveDataModal).click();
        wait(1000);
    }
    public String getAlertProductPopup() {
        return driver.findElement(alertTitlePopup).getText();
    }
    public void clickEditProductButton() {
        driver.findElement(editProductButton).click();
        wait(1000);
    }
    public void editProductPhoto(){
        WebElement element= getDriver().switchTo().activeElement().findElement(fieldEditProductPhoto);
        element.sendKeys(IMAGE_FOLDER+"/Tenda Update.jpeg");
        wait(1000);
    }
//    public void clickDeleteButton() {
//        driver.findElement(loadMoreButton).click();
//        wait(1000);
//        driver.findElement(loadMoreButton).click();
//        wait(1000);
//        driver.findElement(loadMoreButton).click();
//        wait(1000);
//        driver.findElement(deleteProductButton).click();
//        wait(1000);
//    }
    public void editProductName(String productName) {
        driver.findElement(fieldEditProductName).sendKeys(productName);
        wait(1000);
    }
    public void editRentPrice(String rentPrice) {
        driver.findElement(fieldEditRentPrice).sendKeys(rentPrice);
        wait(1000);
    }
    public void editDesc(String desc) {
        driver.findElement(fieldEditDesc).sendKeys(desc);
        wait(1000);
    }
    public void editWarning(String warning) {
        driver.findElement(fieldEditWarning).sendKeys(warning);
        wait(1000);
    }
    public void clickEditProductButtonModal() {
        driver.findElement(editProductButtonModal).click();
        wait(1000);
    }
    public String getSuccessEditPopup() {
        return driver.findElement(alertTitlePopup).getText();
    }
    public void clickNextPageButton(){
        driver.findElement(nextPageButton).click();
        wait(1000);
        driver.findElement(nextPageButton).click();
        wait(1000);
    }
    public void clickLogout() {
        wait(1000);
        driver.findElement(logoutButton).click();
        wait(1000);
    }
}
