package stepDefinitions;

import Utils.DatabaseUtil;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;
import testdata.TestData;

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
        TestData.company= faker.name().name();
        checkout.enterCompany(TestData.company);
    }

    @And("user enter first Address")
    public void userEnterFirstAddress() throws InterruptedException {
        TestData.address1= faker.address().streetAddress();
        checkout.enterAddress1(TestData.address1);
    }

    @And("user enter second Address")
    public void userEnterSecondAddress() throws InterruptedException {
        TestData.address2 = faker.address().secondaryAddress();
        checkout.enterAddress2(TestData.address2);
    }

    @And("user enter City")
    public void userEnterCity() {
        TestData.city = faker.address().city();
        checkout.enterCity(TestData.city);
    }

    @And("user enter Postcode")
    public void userEnterPostcode() {
        TestData.postcode = faker.address().zipCode();
        checkout.enterPostCode(TestData.postcode);
    }

    @And("user select Country")
    public void userSelectCountry() {
        TestData.country = faker.country().name();
        checkout.selectCountry(TestData.country);
    }

    @And("user select Region State")
    public void userSelectRegionState() {
        TestData.state=faker.address().state();
        checkout.selectRegion(TestData.state);
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

//    @And("user enter Gift certificate and click on Apply Gift certificate")
//    public void userEnterGiftCertificateAndClickOnApplyGiftCertificate() {
//        String certificate = faker.number().toString();
//        checkout.applyGiftCertificate(certificate);
//    }

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
    public void userClickOnContinueButtonFromCheckoutPage() throws InterruptedException {
        checkout.clickContinueButton();
    }

    @And("user update new user details in to the database table CustomerCheckoutRegistration")
    public void userUpdateNewUserDetailsInToTheDatabaseTableCustomerCheckoutRegistration() {
        String query = "INSERT INTO CustomerCheckoutRegistration(firstName,lastName,email,customerPassword,confirmPassword,company,address1,address2,city,zipcode,country,state) VALUES ('"+ TestData.firstName+"','"+TestData.lastName+"','"+TestData.email+"','"+TestData.password+"'" +
                ",'"+TestData.password+"','"+TestData.company+"','"+TestData.address1+"','"+TestData.address2+"','"+TestData.city+"','"+TestData.postcode+"','"+TestData.country+"','"+TestData.state+"')";
        System.out.println("QUERY:"+query);
        DatabaseUtil.executeQuery(query);
    }
}
