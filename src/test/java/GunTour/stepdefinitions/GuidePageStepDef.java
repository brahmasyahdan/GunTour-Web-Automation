package GunTour.stepdefinitions;

import GunTour.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuidePageStepDef {

    GuidePage guidePage;
    HomePageUser homePageUser;

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("user click Guide navigation bar")
    public void userClickGuideNavigationBar(){
        homePageUser.clickGuideNavbar();
        wait(5000);
    }

    @And("shoud be directed to Guide Page")
    public void shoudBeDirectedToGuidePage() {
        assertEquals("https://guntour.vercel.app/guide", "https://guntour.vercel.app/guide");
        assertTrue(guidePage.isMustDoClimberTittleVisible());
        assertTrue(guidePage.isImportantFileTittleVisible());
    }

    @Then("user click Download File button for Climber Declaration Letter")
    public void userClickDownloadFileButtonForClimberDeclarationLetter() {
        guidePage.clickDeclarationLetterButton();
    }

    @And("user click Download File button for Parent's Statement Letter")
    public void userClickDownloadFileButtonForParentSStatementLetter() {
        guidePage.clickParentStatementLetterButton();
    }

    @And("user click Download File button for Health Declaration Letter")
    public void userClickDownloadFileButtonForHealthDeclarationLetter() {
        guidePage.clickHealthDeclarationLetterButton();
    }

    @And("user click Download File button for Garbage Form")
    public void userClickDownloadFileButtonForGarbageForm() {
        guidePage.clickGarbageFormButton();
    }
}
