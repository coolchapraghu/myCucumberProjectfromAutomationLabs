Feature: User Registration
  Scenario: user registration with different data
    Given User is on registration page
    When User enters following user details
        |  raghu | reddy | reddy.tw@gmail.com | 23059 | Bangalore |
        |  tom   | peter | peter.tw@yahoo.com | 23233 | Henrico |
        | anitha | kotla | anithareddy0902@gmail.com | 23059 | Richmond |
    Then User registration shall be successful