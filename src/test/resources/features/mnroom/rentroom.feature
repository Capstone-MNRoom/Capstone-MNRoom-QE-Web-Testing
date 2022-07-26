Feature: Rent Room

  Scenario: Success rent a room
    Given user already login
    And user already on homepage
    When user select category
    And user select a room
    Then detail room page should be appear
    When user click on order button
    Then rent form page should be appear
    When user select valid start date
    And user select valid end date
    And user select payment method
    When user click on confirm button
    Then confirmation payment page should be appear
    When user click on confirm button
    Then history page should be appear


