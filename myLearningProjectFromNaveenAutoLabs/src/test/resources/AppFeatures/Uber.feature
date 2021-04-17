Feature: Uber Booking feature
  Scenario: Booking Cab
    Given User wants to select a car type "Sedan" from uber app
    When user select car "Sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 INR

