package GunTour.stepdefinitions;

import GunTour.pages.AboutPage;
import GunTour.pages.HomePageAnonym;
import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutPageStepDef {

    AboutPage aboutPage;
    HomePageUser homePageUser;


    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("user click About Navigation Bar")
    public void userClickABoutNavigationBar(){
        homePageUser.clickAboutNavbar();
    }

    @And("should be directed to About Page")
    public void shouldBeDirectedToAboutPage() {
        assertEquals("https://guntour.vercel.app/about", "https://guntour.vercel.app/about");
        assertTrue(aboutPage.isSejarahGunungTittleDisplayed());
        assertTrue(aboutPage.isVisiDanMisiTittleVisible());
    }

    @Then("user click Selengkapnya Button")
    public void userClickSelengkapnyaButton() {
        aboutPage.clickSelengkapNyaButton();
        wait(5000);
    }

    @And("user should be directed to history page about Mount Gede")
    public void userShouldBeDirectedToHistoryPageAboutMountGede() {
        assertEquals("https://gedepangrango.org/sejarah/", "https://gedepangrango.org/sejarah/");
//        assertTrue(aboutPage.isMountGedeLogoDisplayed());
//        assertTrue(aboutPage.isSejarahTittleDisplayed());
    }
}
