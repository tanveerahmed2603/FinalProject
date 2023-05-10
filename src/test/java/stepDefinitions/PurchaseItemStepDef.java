package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.ShoppingCartPage;

public class PurchaseItemStepDef {
    HomePage homePage=new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    String product;
    @When("user select All categories")
    public void userSelectAllCategories() {
        homePage.selectAllCategories();
    }

    @And("user search for product {string}")
    public void userSearchForProduct(String productName) {
        homePage.searchForProduct(productName);
        product = productName;
    }

    @And("user find the product and click on Add to cart Icon")
    public void userFindTheProductAndClickOnAddToCartIcon() {
        homePage.findProductAndAddToCart(product);
    }

    @And("user click on View cart button")
    public void userClickOnViewCartButton() {
        homePage.clickViewCartButton();
    }

    @Then("user able to see the product {string} added to the cart successfully")
    public void userAbleToSeeTheProductAddedToTheCartSuccessfully(String productName) {
        shoppingCartPage.checkProductAddedToCart(productName);
    }
}
