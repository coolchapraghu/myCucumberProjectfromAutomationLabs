Feature: My First Search Feature from Naveen Automation Labs
  Scenario: Search a Product
    Given I have a search field on the Amazon page
    When I search for a product with name "apple macbook" and price 1000
    Then Product with name "apple macbook" shall be displayed
