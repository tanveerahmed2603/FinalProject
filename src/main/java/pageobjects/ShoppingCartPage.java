package pageobjects;

import base.Config;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Config {

    public ShoppingCartPage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//table[contains(@class,'table-bordered')]//tr//td[2]//a")
    WebElement cartItem;

    public void checkProductAddedToCart(String productName){
        cartItem.isDisplayed();
        if(!cartItem.getText().equals(productName)){
            Assert.fail("Product not added to Cart");
        }
    }
}
