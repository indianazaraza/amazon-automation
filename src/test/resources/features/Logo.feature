Feature: Logo
  As a user,
  I want to return to the home page
  so that I can explore more sections

  Scenario: Return to the home page
    Given I am in the cart page
    When I click the logo
    Then I should return to the home page