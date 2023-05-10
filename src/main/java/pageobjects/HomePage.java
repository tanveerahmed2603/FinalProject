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

    @FindBy(xpath= "//span[contains(text(),'Login')]")
    WebElement loginMenu;

    @FindBy(xpath= "//div[contains(@class,'search-category')]")
    WebElement categoriesDropDown;

    @FindBy(xpath="//a[contains(text(),'All Categories')]")
    WebElement allCategories;

    @FindBy(name="search")
    WebElement searchTextField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchTButton;

    @FindBy(xpath="//h4[@class='title']//a")
    List<WebElement> itemList;

    @FindBy(xpath = "//button[@title='Add to Cart']")
    List<WebElement> addToCartList;

    @FindBy(xpath="//a[contains(text(),'View Cart')]")
    WebElement viewCartButton;

    @FindBy(xpath= "//div[contains(@class,'entry-section')]//button[@title='Add to Cart']")
    WebElement addToCartButton;

    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Your Store");
    }

    public void clickOnRegister(){
        Actions action = new Actions(driver);
        action.moveToElement(myaccountMenu).build().perform();
        action.moveToElement(registerMenu).click().build().perform();
    }

    public void clickOnLogin(){
        Actions action = new Actions(driver);
        action.moveToElement(myaccountMenu).build().perform();
        action.moveToElement(loginMenu).click().build().perform();
    }

    public void selectAllCategories(){
        categoriesDropDown.click();
        allCategories.click();
    }

    public void searchForProduct(String productName){
        searchTextField.sendKeys(productName);
        searchTButton.click();
    }

    public  void findProductAndAddToCart(String productName){
        for(int i=0;i<itemList.size();i++){
           if(itemList.get(i).getText().equals(productName)){
              itemList.get(i).click();
              break;
           }
        }
        addToCartButton.click();
    }

    public  void clickViewCartButton(){
        viewCartButton.click();
    }

}
