@Booking
Feature: Uber Booking feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber app
    When user select car "Sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 INR

  @Smoke @Regression
  Scenario: Booking Cab SUV
    Given User wants to select a car type "Suv" from uber app
    When user select car "Sedan" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 INR

  @Prod
  Scenario: Booking Cab Mini
    Given User wants to select a car type "Mini" from uber app
    When user select car "Sedan" and pick up point "Pune" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 INR

