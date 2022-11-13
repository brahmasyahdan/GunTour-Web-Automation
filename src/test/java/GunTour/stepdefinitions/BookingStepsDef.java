package GunTour.stepdefinitions;

import GunTour.pages.BookingHistoryPage;
import GunTour.pages.BookingPage;
import GunTour.pages.ConfirmationPage;
import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class BookingStepsDef {
    HomePageUser homePage;
    BookingPage bookingPage;
    BookingHistoryPage bookingHistory;
    ConfirmationPage confirmationPage;
    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @And("I click pop up success message login button")
    public void iClickPopUpSuccesLoginButton() {
        Assert.assertEquals("You're logged in !",homePage.messageLoginSuccess());
        homePage.clickPopUpLoginSuccess();
    }

    @Then("I redirected to booking history page")
    public void iRedirectedToBookingHistoryPage() {
        wait(4000);
        Assert.assertEquals("https://guntour.vercel.app/history",bookingHistory.getUrl());
    }

    @When("I click on booking now button")
    public void iClickOnBookingNowButton() {
        homePage.clickBookedNowNavabr();
    }

    @And("I input from date {string}")
    public void iInputFromDate(String date) {
        bookingPage.inputFromDate(date);
    }

    @And("I input to date {string}")
    public void iInputToDate(String date) {
        wait(1000);
        bookingPage.inputToDate(date);
    }

    @And("I select entrance {string}")
    public void iSelectEntrance(String entrance) {
        bookingPage.clickDropDownEntrance();
        bookingPage.selectDropDownEntrance(entrance);
    }

    @And("I select number of person {string}")
    public void iSelectNumberOfPerson(String ticket) {
        bookingPage.clickDropDownPerson();
        bookingPage.selectDropDownPerson(ticket);
    }

    @And("I select ranger {string}")
    public void iSelectRanger(String rangers) {
        bookingPage.clickDropDownRangers();
        bookingPage.selectDropDownRangers(rangers);
    }

    @And("I click booked now button")
    public void iClickBookedNowButton() {
        bookingPage.clickBookedNowButton();
    }

    @Then("I redirected to confirmation page")
    public void iRedirectedToConfirmationPage() {
        Assert.assertEquals("https://guntour.vercel.app/confirm",confirmationPage.getUrl());
        confirmationPage.isPaymentDescriptionVisible();
    }

    @And("I see pop up confirmation {string}")
    public void iSeePopUpConfirmation(String alert) {
        Assert.assertEquals(alert,bookingPage.sweetAlertAppear());
    }

    @And("I click yes sure on alert pop up")
    public void iClickYesSureOnAlertPopUp() {
        bookingPage.clickYesSureAlert();
    }

    @When("I click on confirm button")
    public void iClickOnConfirmButton() {
        confirmationPage.clickConfirmButton();
    }

    @Then("I see pop up message {string}")
    public void iSeePopUpMessage(String alert) {
        Assert.assertEquals(alert,confirmationPage.getConfirmationSuccessfulMessage());
    }

    @When("I click on cancel button")
    public void iClickOnCancelButton() {
        confirmationPage.clickCancelButton();
    }

    @Then("I redirected to booking page")
    public void iRedirectedToBookingPage() {
        Assert.assertEquals("https://guntour.vercel.app/booking",bookingPage.getUrl());
        bookingPage.isThisProductHereAreOptionalVisible();
        wait (3500);
        bookingPage.isImageBookingPageVisible();
    }

    @And("I click cancel on alert pop up")
    public void iClickCancelOnAlertPopUp() {
        bookingPage.clickCancelOnConfirmAlert();
    }

    @And("I click remove product on booking page")
    public void iClickRemoveProductOnBookingPage() {
        bookingPage.clickRemoveProductButton();
    }

    @Then("I see alert message {string}")
    public void iSeeAlertMessage(String alert) {
        Assert.assertEquals(alert,bookingPage.removeProductSuccess());
        bookingPage.clickRemoveProductSuccess();
    }

    @And("I empty rangers")
    public void iEmptyRangers() {
    }

    @And("I add quantity on selected product")
    public void iAddQuantitySelectedProduct() {
        bookingPage.clickPlusButtonProduct();
    }

    @Then("The quantity products is {string}")
    public void theQuantityProductsIs(String product) {
        Assert.assertEquals(product,bookingPage.numberOfProduct());
    }

    @When("I click minus icon on selected product")
    public void iClickMinusIconOnSelectedProduct() {
        bookingPage.clickMinusButtonProduct();
    }

    @And("I do scroll down")
    public void iDoScrollDown() {
        bookingPage.scrollSmooth();
    }

    @And("I empty from date")
    public void iEmptyFromDate() {
    }

    @When("I click OK on alert pop up")
    public void iClickOKOnAlertPopUp() {
        bookingPage.clickYesSureAlert();
    }

    @And("I empty to date")
    public void iEmptyToDate() {

    }

    @And("I empty entrance")
    public void iEmptyEntrance() {

    }

    @And("I empty tickets")
    public void iEmptyTickets() {

    }


}
