package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;

public class CheckoutItemStepDef {
    CheckoutPage checkout=new CheckoutPage();
    Faker faker= new Faker();
    @And("user click on Checkout button")
    public void userClickOnCheckoutButton() {
        checkout.clickCheckoutButton();
    }

    @And("user click on Register Account button")
    public void userClickOnRegisterAccountButton() {
        checkout.clickRegisterAccount();
    }

    @And("user enter company")
    public void userEnterCompany() throws InterruptedException {
        String company= faker.name().name();
        checkout.enterCompany(company);
    }

    @And("user enter first Address")
    public void userEnterFirstAddress() throws InterruptedException {
        String address1= faker.address().streetAddress();
        checkout.enterAddress1(address1);
    }

    @And("user enter second Address")
    public void userEnterSecondAddress() throws InterruptedException {
        String address2 = faker.address().secondaryAddress();
        checkout.enterAddress2(address2);
    }

    @And("user enter City")
    public void userEnterCity() {
        String city = faker.address().city();
        checkout.enterCity(city);
    }

    @And("user enter Postcode")
    public void userEnterPostcode() {
        String postcode = faker.address().zipCode();
        checkout.enterPostCode(postcode);
    }

    @And("user select Country")
    public void userSelectCountry() {
        String country = faker.country().name();
        checkout.selectCountry(country);
    }

    @And("user select Region State")
    public void userSelectRegionState() {
        String state=faker.address().state();
        checkout.selectRegion(state);
    }

    @And("user tick Privacy policy checkbox")
    public void userTickPrivacyPolicyCheckbox() throws InterruptedException {
        checkout.tickPrivacyPolicyCheckbox();
    }

    @And("user tick Terms & Conditions checkbox")
    public void userTickTermsConditionsCheckbox() throws InterruptedException {
        checkout.tickTermsAndConditions();
    }

    @And("user enter coupon code and click on Apply Coupon")
    public void userEnterCouponCodeAndClickOnApplyCoupon() {
        String code = faker.code().toString();
        checkout.applyCoupon(code);
    }

    @And("user enter Gift certificate and click on Apply Gift certificate")
    public void userEnterGiftCertificateAndClickOnApplyGiftCertificate() {
        String certificate = faker.number().toString();
        checkout.applyGiftCertificate(certificate);
    }

    @And("user enter Comments about the order")
    public void userEnterCommentsAboutTheOrder() throws InterruptedException {
        String commentText = faker.random().toString();
        checkout.enterComments(commentText);
    }

    @And("user click on Confirm Order button")
    public void userClickOnConfirmOrderButton() {
        checkout.clickConfirmButton();
    }

    @Then("user verify success message {string}")
    public void userVerifySuccessMessage(String message) {
        checkout.verifyOrderSuccessMessage();
    }

    @And("user click on Continue button from checkout page")
    public void userClickOnContinueButtonFromCheckoutPage() {
        checkout.clickContinueButton();
    }
}
