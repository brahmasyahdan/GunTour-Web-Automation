package GunTour.stepdefinitions;

import GunTour.pages.HomePageUser;
import GunTour.pages.LoginPage;
import GunTour.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;

import static org.junit.Assert.assertEquals;


public class RegisterStepDef extends PageObject {
    RegisterPage registerPage;
    LoginPage loginPage;

    @Given("I already register page")
    public void iAlreadyRegisterPage(){
        registerPage.open();
    }

    @And("I input full name {string} on register page" )
    public void iInputFullName(String fullname) {
        registerPage.inputFullNameElement(fullname);
    }

    @And("I input email {string} on register page")
    public void userInputEmail(String email) {
        registerPage.inputEmailElement(email);
    }

    @And("I input password {string} on register page")
    public void userInputPassword(String password) {
        registerPage.inputPassword(password);
    }

    @Then("I click Register Account button")
    public void iClickRegisterAccountButton() {
        registerPage.clickButtonRegisterAccount();
    }

    @And("I see alert register success & click OK")
    public void userSeeAlertRegisterSuccessClickOK() {
        registerPage.clickButtonPopUpSuccesRegister();
    }

    @And("I Should be directed to login page")
    public void iShouldBeDirectedToAdminPage() {
        assertEquals("https://guntour.vercel.app/login", loginPage.getUrl());
    }

    @And("Should be pop up please Please enter full name")
    public void shouldBePopUpPleasePleaseEnterFullName() {
        registerPage.popUpPleaseEnterFullNameElement();
    }

    @And("Should be pop up data cannot be empty")
    public void shouldBePopUpDataCannotBeEmpty() {
        registerPage.popUpDataCantBeEmptyElement();
    }

    @And("I click on login text link")
    public void iClickOnLoginTextLink() {
        registerPage.loginLinkElement();
    }
}
