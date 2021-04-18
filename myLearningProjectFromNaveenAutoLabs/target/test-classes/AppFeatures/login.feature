Feature: Login Feature
  Scenario Outline: Login fail - possible combinations
    Given User is on Application Landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets login failed error message

      Examples:
        | UserName          | Password          |
        | incorrectusername | 123456            |
        | raghureddy        | incorrectpassword |
        | incorrectusername | incorrectpassword |