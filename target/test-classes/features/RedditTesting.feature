Feature: Login functionality

  Background: 
    Given I am on the Reddit homepage
    Then I click on the Login feature
    When I enter a valid email and a valid password
    And I click the login button

  Scenario: Search and open the gaming subreddit
    When I search and click on the gaming subreddit
    Then I verify in the second post for the title if contains “Nintendo” Thumbs up or if the title does not contain “Nintendo” Thumbs down
    Then I logout
