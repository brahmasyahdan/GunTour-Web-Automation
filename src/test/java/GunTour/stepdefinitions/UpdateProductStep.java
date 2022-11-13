package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import GunTour.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpdateProductStep {

    AdminProductPage adminProductPage;
    LoginPage loginPage;
    @Given("click edit product button")
    public void clickEditProductButton(){
        adminProductPage.clickEditProductButton();
    }
    @When("click close button edit modal")
    public void clickCloseButtonEditModal() {
//        adminProductPage.scrollToCloseButton();
        adminProductPage.clickCloseButtonEditModal();
    }
    @Then("edit product modal should closed")
    public void editProductModalShouldClosed() {
        assertTrue("PRICE", adminProductPage.getTableTitle());
    }
    @And("input update product photo data")
    public void editProductPhotoData() {
        adminProductPage.editProductPhoto();
    }
    @And("input update product name {string}")
    public void editProductName(String productName) {
        adminProductPage.editProductName(productName);
    }
    @And("input update rent price {string}")
    public void editRentPrice(String rentPrice) {
        adminProductPage.editRentPrice(rentPrice);
    }
    @And("input update description {string}")
    public void editDescription(String desc) {
        adminProductPage.editDesc(desc);
    }
    @And("input update warning {string}")
    public void editNote(String warning) {
        adminProductPage.editWarning(warning);
    }
    @Then("the product should be edited")
    public void theProductShouldBeEditedToTable() {
        assertEquals("Data changes successfully", adminProductPage.getSuccessEditPopup());
        adminProductPage.clickOk();
//        adminProductPage.clickCloseButton();
        assertTrue("PRICE",adminProductPage.getTableTitle());
    }
//    @When("admin click delete button")
//    public void adminClickDeleteButton() {
//
//        adminProductPage.clickDeleteButton();
//    }
//    @Then("the product should be deleted")
//    public void theProductShouldBeDeleted() {
//        adminProductPage.clickOk();
//    }
    @And("click edit product button modal")
    public void clickEditInfoButtonModal() {
        adminProductPage.clickEditProductButtonModal();
    }
    @When("click logout button in admin page")
    public void clickLogoutButtonInAdminPage() {
        adminProductPage.clickLogout();
    }
    @Then("should return to login page")
    public void shouldReturnToLoginPage() {
        assertEquals("https://guntour.vercel.app/login", loginPage.getUrl());
    }
}
