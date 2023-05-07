package pageobjects;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;

public class HomePage extends Config {

    public HomePage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'My account')]")
    WebElement myaccountMenu;

    @FindBy(xpath= "//span[contains(text(),'Register')]")
    WebElement registerMenu;

    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Your Store");
    }

    public void clickOnRegister(){
        Actions action = new Actions(driver);
        action.moveToElement(myaccountMenu).build().perform();
        action.moveToElement(registerMenu).click().build().perform();
    }

}
