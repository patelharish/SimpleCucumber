Feature: Google Search

  Scenario: Perform a basic search
    Given I am on the Google homepage
    When I enter "TajMahel" into the search bar
    And I click the search button
    Then I should see search results for "TajMahel"
