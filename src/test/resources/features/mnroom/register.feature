Feature: register account in mnroom

  @register
  Scenario: Success register account
    Given user already on homepage
    When user click register button
    Then register page appear
    When user input username with "yasin"
    And user input email with "yasin@mail.com"
    And user input password with with "yasin123"
    And user input phone number with "082455455455"
    And user input address with "Jl.Merpati no.12"
    And user click signup button
    Then login page appear

