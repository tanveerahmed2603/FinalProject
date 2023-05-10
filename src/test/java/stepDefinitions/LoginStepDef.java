package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testdata.TestData;

public class LoginStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @When("When user hover over on My account and click on Login menu")
    public void whenUserHoverOverOnMyAccountAndClickOnLoginMenu() {
        homePage.clickOnLogin();

    }
    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        loginPage.enterEmailAddress(TestData.email);

    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        loginPage.enterPassword(TestData.password);
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be successfully login")
    public void userShouldBeSuccessfullyLogin() {
        loginPage.verifySuccessfulLogin();
    }


}
