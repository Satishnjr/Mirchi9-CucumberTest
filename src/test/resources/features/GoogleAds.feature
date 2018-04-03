Feature: Mirchi Site Ads

  Scenario: Check for Google Ads
    When I open mirchi website
    And I check for Ads
    Then GoogleAds Should display

  Scenario: Check for Google Ads in mobile
    When I open mirchi website in Nexus
    And I check for Ads
    Then GoogleAds Should display
