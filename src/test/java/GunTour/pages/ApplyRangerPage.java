package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

import static java.lang.Thread.sleep;

public class ApplyRangerPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    By fillDataTittle = By.xpath("//*[@id=\"root\"]/div/div/main/section/h5");
    By fullNameField = By.xpath("//*[@id=\"root\"]/div/div/main/section/input[1]");
    By phoneNumberField = By.xpath("//*[@id=\"root\"]/div/div/main/section/input[2]");
    By placeAndBirthField = By.xpath("//*[@id=\"root\"]/div/div/main/section/input[3]");
    By genderField = By.xpath("//*[@id=\"root\"]/div/div/main/section/input[4]");
    By addressField = By.xpath("//*[@id=\"root\"]/div/div/main/section/input[5]");
    By uploadDocument = By.id("chooseFile");
    By sumbitDataButton = By.id("submit-Ranger");
    By cancelButton = By.id("cancel-Ranger");
    By errorPopUpApplyRanger = By.xpath("/html/body/div[2]/div");
    By errorPopUpTextApplyRanger = By.xpath("//*[@id=\"swal2-title\"]");
    By errorPopUpButton = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    By successPopUpTextApplyRanger = By.xpath("//*[@id=\"swal2-title\"]");
    By successPopUpButton = By.xpath("/html/body/div[2]/div/div[6]/button[1]");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickSuccessPopUpButton(){
        driver.findElement(successPopUpButton).click();
        wait(5000);
    }
    public String isSuccessPopUpTextVisible(){
        return driver.findElement(successPopUpTextApplyRanger).getText();

    }
    public void clickErrorPopUpButton(){
        driver.findElement(errorPopUpButton).click();
        wait(5000);
    }
    public String isErrorPopUpTextApplyRangerVisible(){
        return driver.findElement(errorPopUpTextApplyRanger).getText();
    }

    public boolean isErrorPopUpApplyRangerVisible(){
        return driver.findElement(errorPopUpApplyRanger).isDisplayed();
    }

    public String isFillDataTittleVisible(){
        return driver.findElement(fillDataTittle).getText();
    }

    public void setFullNameField(String fullname){
        driver.findElement(fullNameField).sendKeys(fullname);
        wait(1000);
    }
    public void setPhoneNumberField(String phone){
        driver.findElement(phoneNumberField).sendKeys(phone);
        wait(1000);
    }
    public void setPlaceAndBirthField(String placebirth){
        driver.findElement(placeAndBirthField).sendKeys(placebirth);
        wait(1000);
    }
    public void setGenderField(String gender){
        driver.findElement(genderField).sendKeys(gender);
        wait(1000);
    }
    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
        wait(1000);
    }
    public void setUploadDocument(){
        driver.findElement(uploadDocument).sendKeys(System.getProperty("user.dir")+ File.separator+"src/test/resources/documentToUpload/apply_form_ranger.pdf");
        wait(1000);
    }
    public void selectSumbitDataButton(){
        driver.findElement(sumbitDataButton).click();
        wait(1000);
    }
    public void selectCancelButton(){
        driver.findElement(cancelButton).click();
    }
}
