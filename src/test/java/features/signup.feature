Feature: Signup

  @signup
  Scenario Outline: User should be able to create one Lambdatest account
    Given user in Lambdatest Homepage
    When user hover over on My account and click on Register menu
    And user enter First name "<First name>"
    And user enter Last name "<Last name>"
    And user enter Email "<Email>"
    And user enter Telephone "<Telephone>"
    And user enter Password
    And user enter Password Confirm
    And user click on Policy checkbox
    And user click on Continue button
    Then user able to sign up and verify success message "Your Account Has Been Created"

    Examples:
    |First name|Last name|Email|Telephone|
    |Treesa      |shetty    |Treesa.shetty89540@gmail.com|9876543223|
