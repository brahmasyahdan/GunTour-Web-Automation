package GunTour.stepdefinitions;

import GunTour.pages.GoogleMapPage;
import GunTour.pages.HomePageUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class HomePageStepDef {

    HomePageUser homePageUser;
    GoogleMapPage googleMapPage;

    @When("user click on google map")
    public void userClickOnGoogleMap(){
        homePageUser.clickMap();
    }

    @Then("user should be directed to mount gede google map")
    public void userShouldBeDirectedToMountGedeGoogleMap() {
        assertTrue(googleMapPage.isMountGedeDisplayed());
        assertTrue(googleMapPage.isMountGedeDescriptionDisplayed());
    }
}
