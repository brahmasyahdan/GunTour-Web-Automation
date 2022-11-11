package GunTour.stepdefinitions;

import GunTour.pages.AdminClimbersPage;
import GunTour.pages.AdminProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpdateClimbersStep {
    AdminClimbersPage adminClimbersPage;
    AdminProductPage adminProductPage;
    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("click users menu")
    public void clickUsersMenu(){
        adminProductPage.clickUsersMenu();
    }
    @Then("directed to users page")
    public void directedToUsersPage() {
        assertEquals("https://guntour.vercel.app/users", "https://guntour.vercel.app/users");
        wait(2000);
    }
    @Given("click edit data button")
    public void clickEditDataButton() {
        adminClimbersPage.clickEditClimbers();
    }
    @When("click close button")
    public void clickCloseButton() {
        adminClimbersPage.clickCloseButton();
    }
    @Then("edit climbers data modal should closed")
    public void editClimbersDataModalShouldClosed() {
        assertTrue("Climbers", adminClimbersPage.getClimbersTitle());
    }
}
