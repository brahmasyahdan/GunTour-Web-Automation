package GunTour.stepdefinitions;

import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BookingStepsDef {
    HomePageUser homePage;
    @And("I click pop up success message login button")
    public void iClickPopUpSuccesLoginButton() {
        Assert.assertEquals("You're logged in !",homePage.messageLoginSuccess());
        homePage.clickPopUpLoginSuccess();
    }

    @When("I click on book now button on selected product")
    public void iClickOnBookNowButtonOnSelectedProduct() {
        homePage.clickButtonBookNowProduct();
    }

    @Then("Product added to booking now with message {string}")
    public void productAddedToBookingNow(String message) {
        Assert.assertEquals(message,homePage.getSuccessAddProduct());
    }

    @When("I click on avatar menu")
    public void iClickOnAvatarMenu() {
        homePage.clickDropDownMenu();
    }

    @And("I click on my booking")
    public void iClickOnMyBooking() {
        homePage.clickMyBooking();
    }

    @Then("I redirected to booking history page")
    public void iRedirectedToBookingHistoryPage() {
    }
}
