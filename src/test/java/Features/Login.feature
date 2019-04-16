Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
      |username |password     |
      |SuperUser    |sitracels1|
    And  I click Login button
    Then I should see the userform pages