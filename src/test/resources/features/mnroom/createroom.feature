Feature: Create Room

  Scenario: Success create room
    Given user already login
    When user click on logo icon
    And user click on create room menu
    Then create menu page should be appear
    When user input valid name room "Anjani Room"
    And user input valid price "750000"
    And user input valid capacity "100"
    And user input valid hotel name "Hanoman"
    And user input valid city "Malang"
    And user input valid address "Jl Dewi Sri No.23"
    And user select ballroom category
    And user select facilities
    And user click create button
    Then room should be created