package GunTour.stepdefinitions;

import GunTour.pages.ApplyRangerPage;
import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.sleep;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplyRangerPageStepDef {

    ApplyRangerPage applyRangerPage;
    HomePageUser homePageUser;

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user should be directed to apply form ranger page")
    public void userShouldBeDirectedToApplyFormRangerPage() {
        assertEquals("https://guntour.vercel.app/ranger", "https://guntour.vercel.app/ranger");
    }

    @And("user fill the field with valid data {string} {string} {string} {string} {string}")
    public void userFillTheFieldWithValidData(String fullname, String phone, String placebirth, String gender, String address) {
        applyRangerPage.setFullNameField(fullname);
        applyRangerPage.setPhoneNumberField(phone);
        applyRangerPage.setPlaceAndBirthField(placebirth);
        applyRangerPage.setGenderField(gender);
        applyRangerPage.setAddressField(address);
    }
        @And("user upload document")
        public void userUploadDocument() {
            applyRangerPage.setUploadDocument();
        }

        @And("user submit the data")
        public void userSumbitTheData() {
            applyRangerPage.selectSumbitDataButton();
        }

    @And("user fill the field without fullname {string} {string} {string} {string}")
    public void userFillTheFieldWithValidData(String phone, String placebirth, String gender, String address) {
        applyRangerPage.setPhoneNumberField(phone);
        applyRangerPage.setPlaceAndBirthField(placebirth);
        applyRangerPage.setGenderField(gender);
        applyRangerPage.setAddressField(address);
    }

    @And("user should see error pop up")
    public void userShouldSeeErrorPopUp() {
        assertTrue(applyRangerPage.isErrorPopUpApplyRangerVisible());
        assertEquals("There is an error please check again", applyRangerPage.isErrorPopUpTextApplyRangerVisible());
        applyRangerPage.clickErrorPopUpButton();
    }

    @And("user should see success pop up")
    public void userShouldSeeSuccessPopUp() {
        assertEquals("Data added successfully", applyRangerPage.isSuccessPopUpTextVisible());
        applyRangerPage.clickSuccessPopUpButton();
    }

    @And("user fill the field without phone {string} {string} {string} {string}")
    public void userFillTheFieldWithoutPhone(String fullname, String placebirth, String gender, String address) {
        applyRangerPage.setFullNameField(fullname);
        applyRangerPage.setPlaceAndBirthField(placebirth);
        applyRangerPage.setGenderField(gender);
        applyRangerPage.setAddressField(address);
    }

    @And("user fill the field without place birth {string} {string} {string} {string}")
    public void userFillTheFieldWithoutPlaceBirth(String fullname, String phone, String gender, String address) {
        applyRangerPage.setFullNameField(fullname);
        applyRangerPage.setPhoneNumberField(phone);
        applyRangerPage.setGenderField(gender);
        applyRangerPage.setAddressField(address);
    }

    @And("user fill the field without gender {string} {string} {string} {string}")
    public void userFillTheFieldWithoutGender(String fullname, String phone, String placebirth, String address) {
        applyRangerPage.setFullNameField(fullname);
        applyRangerPage.setPhoneNumberField(phone);
        applyRangerPage.setPlaceAndBirthField(placebirth);
        applyRangerPage.setAddressField(address);
    }

    @And("user fill the field with without address {string} {string} {string} {string}")
    public void userFillTheFieldWithWithoutAddress(String fullname, String phone, String placebirth, String gender) {
        applyRangerPage.setFullNameField(fullname);
        applyRangerPage.setPhoneNumberField(phone);
        applyRangerPage.setPlaceAndBirthField(placebirth);
        applyRangerPage.setGenderField(gender);
    }
}
