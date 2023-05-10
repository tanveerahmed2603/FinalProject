package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.RegisterPage;
import testdata.TestData;

public class SignupStepDef {
    HomePage homePage=new HomePage();
    Faker faker = new Faker();
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
        TestData.firstName = faker.name().firstName();
        registerPage.enterFirstName(TestData.firstName);
    }

    @And("user enter Last name {string}")
    public void userEnterLastName(String lastname) {
        TestData.lastName = faker.name().lastName();
        registerPage.enterLastName(TestData.lastName);
    }

    @And("user enter Email {string}")
    public void userEnterEmail(String email) {
        registerPage.enterEmail(TestData.email);
    }

    @And("user enter Telephone {string}")
    public void userEnterTelephone(String telephone) {
        TestData.telephone =faker.phoneNumber().cellPhone();
        registerPage.enterTelephone(TestData.telephone);
    }
}
