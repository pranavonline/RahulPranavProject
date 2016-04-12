Feature: My First feature

  Scenario: Search functionality
    Given I am on "https://www.google.com" page
     When I search for "Testing" keyword
     Then I landed to search result page for "Testing" keyword
