Feature: Logo
  As a user,
  I want to go to the home page from the cart page
  so that I can explore more sections

  Scenario: Go to the home page
    Given I am in the cart page
    When I click on the logo
    Then I should return to the home page