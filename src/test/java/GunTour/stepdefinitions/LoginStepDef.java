package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import GunTour.pages.HomePageUser;
import GunTour.pages.LoginPage;
import GunTour.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDef {

    LoginPage loginPage;
    HomePageUser homePageUser;

    RegisterPage registerPage;


    AdminProductPage adminProductPage;

    @Given("I already on log in page")
    public void iAlreadyOnLoginPage() {
        loginPage.open();
    }

    @When("I input email {string}")
    public void iInputEmail(String email) {
        loginPage.InputEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        loginPage.InputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLoginButton();
    }

    @Then("Should be directed to Home Page")
    public void shouldBeDirectedToHomePage() {
        assertTrue(homePageUser.isPopUpVisible());
        homePageUser.clickPopUpLoginSuccess();
        assertEquals("https://guntour.vercel.app/home", homePageUser.getUrl());
        assertEquals("POPULAR", homePageUser.getHeaderProduct());
        assertTrue(homePageUser.isBookedNowNavbarVisible());
    }

    @Then("directed to admin page")
    public void DirectedtoAdminPage() {
        adminProductPage.clickOk();
        assertEquals("https://guntour.vercel.app/admin", adminProductPage.getUrl());
    }

    @Given("user already login")
    public void userAlreadyLogin() {
        loginPage.open();
        loginPage.InputEmail("nyusdjaja30@gmail.com");
        loginPage.InputPassword("Araa1989");
        loginPage.ClickLoginButton();
        homePageUser.clickPopUpLoginSuccess();
    }


    @Given("ranger already login")
    public void rangerAlreadyLogin() {
        loginPage.open();
        loginPage.InputEmail("nyusdjaja@gmail.com");
        loginPage.InputPassword("Araa1989");
        loginPage.ClickLoginButton();
        homePageUser.clickPopUpLoginSuccess();
    }

    @Given("admin already login")
    public void adminAlreadyLogin() {
        loginPage.open();
        loginPage.InputEmail("admin@gmail.com");
        loginPage.InputPassword("Kunti123");
        loginPage.ClickLoginButton();
        homePageUser.clickPopUpLoginSuccess();
    }
    @Then("Should be directed to Admin Page")
    public void shouldBeDirectedToAdminPage() {
        adminProductPage.clickOk();
        assertEquals("https://guntour.vercel.app/admin", adminProductPage.getUrl());
    }

    @Then("Should be pop-up Please fill in the data correctly display")
    public void shouldBePopUpPleaseFillInTheDataCorrectlyDisplay() {
        assertTrue(loginPage.IsPopUpLoginNotSuccessVisible());
    }

    @Then("Should be pop-up Data cannot be empty display")
    public void shouldBePopUpDataCannotBeEmptyDisplay() {
        assertTrue(loginPage.IsPopUpLoginWithoutField());
    }

    @And("I click on Register text link")
    public void iClickOnRegisterTextlink() {
        loginPage.goRegisterPageClick();
    }

    @Then("I go to register page")
    public void iGoToRegisterPage() {
        assertEquals("https://guntour.vercel.app/register", registerPage.getUrlRegister());
        assertEquals("Register your account", registerPage.getRegisterTittle());

    }
}
