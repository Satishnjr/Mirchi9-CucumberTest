Feature: Mirchi Site
  Scenario: Check Footer Links
    When I open mirchi website
    And I Traverse to Footer
    Then I select all links and verify if works and lands on right page