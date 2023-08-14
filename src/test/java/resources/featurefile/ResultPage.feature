Feature: Result Page Functionality

  As a user I want to check if it print the correct entered name and print the age of the person
  @regression
  Scenario: I want to verify the the name and age
    Given I am on the Result Page
    And I verify the text Hello name!
    Then I verify the age of the person