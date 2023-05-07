package pageobjects;

import base.Config;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Config {

    public RegisterPage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "firstname")
    WebElement firstname;

    @FindBy(name = "lastname")
    WebElement lastname;

    @FindBy(name= "email")
    WebElement email;

    @FindBy(name= "telephone")
    WebElement telephone;

    @FindBy(name= "password")
    WebElement password;

    @FindBy(name= "confirm")
    WebElement confirmPassword;

    @FindBy(xpath = "//label[contains(@for,'input-agree')]")
    WebElement termsCheckbox;

    @FindBy(xpath= "//input[@value='Continue']")
    WebElement continueButton;

    @FindBy(xpath= "//h1[contains(text(),'Your Account Has Been Created')]")
    WebElement successMessage;


    public void enterFirstName(String firstName){
        firstname.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        lastname.sendKeys(lastName);
    }

    public void enterEmail(String mailId){
        email.sendKeys(mailId);
    }

    public void enterTelephone(String phonenumber){
        telephone.sendKeys(phonenumber);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void enterConfirmPassword(String confirmPwd){
        confirmPassword.sendKeys(confirmPwd);
    }

    public void tickTermsCheckbox(){
        termsCheckbox.click();
    }
    public void clcikContinueButton(){
        continueButton.click();
    }

    public  void verifySuccessMessage(String message){
        Assert.isTrue(successMessage.isDisplayed(),"Signup failed!");
    }

}
