Feature: User Registration with Map
  Scenario: user registration with different data with columns
    Given User is on registration page
    When User enters following user details with columns
      | firstname | lastname | email |  zipcode | city |
      |  raghu | reddy | reddy.tw@gmail.com | 23059 | Bangalore |
      |  tom   | peter | peter.tw@yahoo.com | 23233 | Henrico |
      | anitha | kotla | anithareddy0902@gmail.com | 23059 | Richmond |
    Then User registration shall be successful