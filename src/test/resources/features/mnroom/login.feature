Feature: Login


  Scenario: Success login
    Given user already on homepage
    When user click on login button
    Then login page should be appear
    When user input email with valid email
    And user input password with valid password
    And user click login button on login page
    Then homepage should be appear