Feature: Purchase item

  @purchaseItem
  Scenario: Purchase an item and Add to cart
    Given user in Lambdatest Homepage
    When user select All categories
    And user search for product "iPhone"
    And user find the product and click on Add to cart Icon
    And user click on View cart button
    Then user able to see the product "iPhone" added to the cart successfully