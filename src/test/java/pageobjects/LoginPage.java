package pageobjects;

import base.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Config {

    public LoginPage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="email")
    WebElement emailAddress;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickLogin;

    public void enterEmailAddress(String email){
        emailAddress.sendKeys(email);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        clickLogin.click();
    }

    public void verifySuccessfulLogin() {
        Assert.assertEquals(driver.getTitle(),"My Account");
    }
}
