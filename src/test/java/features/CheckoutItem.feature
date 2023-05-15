Feature: Checkout item
  @checkout
  Scenario: Checkout item from the cart
    Given user in Lambdatest Homepage
    When user select All categories
    And user search for product "iPhone"
    And user find the product and click on Add to cart Icon
    And user click on View cart button
    And user click on Checkout button
    And user click on Register Account button
    And user enter First name "<First name>"
    And user enter Last name "<Last name>"
    And user enter Email "<Email>"
    And user enter Telephone "<Telephone>"
    And user enter Password
    And user enter Password Confirm
    And user enter company
    And user enter first Address
    And user enter second Address
    And user enter City
    And user enter Postcode
    And user select Country
    And user select Region State
    And user enter coupon code and click on Apply Coupon
    And user enter Gift certificate and click on Apply Gift certificate
    And user enter Comments about the order
    And user tick Privacy policy checkbox
    And user tick Terms & Conditions checkbox
    And user click on Continue button from checkout page
    And user click on Confirm Order button
    Then user verify success message "Your order has been placed"


