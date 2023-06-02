package pageobjects;

import base.Config;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckoutPage extends Config {
    public CheckoutPage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath =  "//a[contains(text(),'Checkout')]")
    WebElement checkoutButton;

    @FindBy(xpath = "//label[@for='input-account-register']")
    WebElement registerAccount;

    @FindBy(name = "company")
    WebElement company;

    @FindBy(name = "address_1")
    WebElement address1;

    @FindBy(name = "address_2")
    WebElement address2;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "postcode")
    WebElement postcode;

    @FindBy(name ="country_id")
    WebElement country;

    @FindBy(name ="zone_id")
    WebElement region;

    @FindBy(name = "coupon")
    WebElement coupon;

    @FindBy(id = "button-coupon")
    WebElement applyCoupon;

    @FindBy(xpath = "//h5[contains(text(),'Use Gift Certificate')]")
    WebElement useGiftCertificate;

    @FindBy(name = "voucher")
    WebElement giftCertificateCode;

    @FindBy(id = "button-voucher")
    WebElement applyGiftCertificate;

    @FindBy(name = "comment")
    WebElement comment;

    @FindBy(xpath = "//label[@for = 'input-account-agree']")
    WebElement privacyPolicy;

    @FindBy(xpath = "//label[@for = 'input-agree']")
    WebElement termsAndConditions;

    @FindBy(id = "button-save")
    WebElement continueButton;

    @FindBy(id = "button-confirm")
    WebElement confirmButton;

    @FindBy(xpath = "//h1[contains(text(),'Your order has been placed')]")
    WebElement orderSuccessMessage;

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public  void clickRegisterAccount(){
        registerAccount.click();
    }

    public void enterCompany(String companyName) throws InterruptedException {
        company.sendKeys(companyName);
        Thread.sleep(1000);
    }

    public void enterAddress1(String address) throws InterruptedException {
        address1.sendKeys(address);
        Thread.sleep(1000);
    }

    public void enterAddress2(String address) throws InterruptedException {
        address2.sendKeys(address);
        Thread.sleep(1000);
    }

    public void enterCity(String cityName){
        city.sendKeys(cityName);
    }

    public void enterPostCode(String code){
        postcode.sendKeys(code);
    }

    public void selectCountry(String countryName){
        Select select= new Select(country);
        select.selectByVisibleText(countryName);
    }

    public void selectRegion(String regionName){
        Select select= new Select(region);
        select.selectByIndex(1);
    }

    public void applyCoupon(String couponCode){
        coupon.sendKeys(couponCode);
        applyCoupon.click();
    }

//    public void applyGiftCertificate(String certificate){
//        useGiftCertificate.click();
//        giftCertificateCode.sendKeys(certificate);
//        applyGiftCertificate.click();
//    }

    public  void enterComments(String commentText) throws InterruptedException {
        comment.sendKeys(commentText);
        Thread.sleep(1000);
    }

    public void tickPrivacyPolicyCheckbox() throws InterruptedException {
       privacyPolicy.click();
       Thread.sleep(1000);
    }

    public  void tickTermsAndConditions() throws InterruptedException {
        termsAndConditions.click();
        Thread.sleep(1000);
    }

    public void clickContinueButton() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        continueButton.click();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }

    public void verifyOrderSuccessMessage(){
        Assert.assertTrue(orderSuccessMessage.isDisplayed());
    }



}
