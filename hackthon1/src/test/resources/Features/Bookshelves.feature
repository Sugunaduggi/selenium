Feature: Bookshelves Search and Filter
  As a user
  I want to search and filter bookshelves
  So that I can find the right product

  Scenario: Search for bookshelves within price range
    Given I have launched the website
    When I scroll and click on bookshelves
    Then I set the price range using the slider
    
    And I extract the bookshelf information
    And I retrieve submenu items
    And I capture any error messages