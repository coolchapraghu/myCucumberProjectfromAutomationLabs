Feature: My First Search Feature from Naveen Automation Labs
  Scenario: Search a Product
    Given I have a search field on the Amazon page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" shall be displayed
    Then Order id is 12345 and username is "Raghu"

  Scenario: Search a Product Iphone
    Given I have a search field on the Amazon page
    When I search for a product with name "Iphone" and price 1200
    Then Product with name "Iphone" shall be displayed
    Then Order id is 5677 and username is "Raghu Cucumber Learning"

