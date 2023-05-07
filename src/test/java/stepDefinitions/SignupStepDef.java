package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.RegisterPage;
import testdata.TestData;

public class SignupStepDef {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    @Given("user in Lambdatest Homepage")
    public void userInLambdatestHomepage() {
        homePage.checkTitle();
    }

    @When("user hover over on My account and click on Register menu")
    public void userHoverOverOnMyAccountAndClickOnRegisterMenu() {
        homePage.clickOnRegister();
    }

    @And("user enter Password")
    public void userEnterPassword() {
        registerPage.enterPassword(TestData.password);
    }

    @And("user enter Password Confirm")
    public void userEnterPasswordConfirm() {
        registerPage.enterConfirmPassword(TestData.password);
    }

    @And("user click on Policy checkbox")
    public void userClickOnPolicyCheckbox() {
        registerPage.tickTermsCheckbox();
    }

    @And("user click on Continue button")
    public void userClickOnContinueButton() {
        registerPage.clcikContinueButton();
    }

    @Then("user able to sign up and verify success message {string}")
    public void userAbleToSignUpAndVerifySuccessMessage(String message) {
        registerPage.verifySuccessMessage(message);
    }

    @And("user enter First name {string}")
    public void userEnterFirstName(String firstname) {
        registerPage.enterFirstName(firstname);
    }

    @And("user enter Last name {string}")
    public void userEnterLastName(String lastname) {
        registerPage.enterLastName(lastname);
    }

    @And("user enter Email {string}")
    public void userEnterEmail(String email) {
        registerPage.enterEmail(email);
    }

    @And("user enter Telephone {string}")
    public void userEnterTelephone(String telephone) {
        registerPage.enterTelephone(telephone);
    }
}
