Feature: Login

  @login
  Scenario: User should be able to login with valid credentials
    Given user in Lambdatest Homepage
    When When user hover over on My account and click on Login menu
    And user enter valid email address
    And user enter valid password
    And user click on login button
    Then user should be successfully login
