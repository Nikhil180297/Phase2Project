@Login
Feature: This feature will be used to test the login functionality of Swaglab application

  Background: 
    Given I have launched the application

  Scenario: Validate the Login success scenario using parameters
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on home page

  Scenario Outline: Validate the Login failure scenario usig examples
    When I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on Login button
    Then I should get the error message "<Error>"

    Examples: 
      | UserName        | Password     | Error                                                                     |
      | standard_user   |        12345 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
