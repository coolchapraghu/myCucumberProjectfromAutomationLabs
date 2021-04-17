Feature: My First Search Feature from Naveen Automation Labs
  Scenario: Search a Product
    Given I have a search field on the Amazon page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" shall be displayed
