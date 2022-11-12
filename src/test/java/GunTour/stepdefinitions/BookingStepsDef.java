package GunTour.stepdefinitions;

import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class BookingStepsDef {
    HomePageUser homePage;
    @And("I click pop up success message login button")
    public void iClickPopUpSuccesLoginButton() {
        Assert.assertEquals("You're logged in !",homePage.messageLoginSuccess());
        homePage.clickPopUpLoginSuccess();
    }
}
