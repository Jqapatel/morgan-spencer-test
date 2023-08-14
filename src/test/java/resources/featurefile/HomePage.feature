Feature: Home Page functionality
  @regression
  Scenario: Verifying age of a person
    Given I am on the Home Page
    When I verify the text on the Home page
    And  I enter User Name
    And  I enter the Date of Birth
    Then I click on Submit