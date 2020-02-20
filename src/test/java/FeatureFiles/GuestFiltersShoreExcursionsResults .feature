# new feature
# Tags: optional

Feature: A description


  @Regression
  Scenario 3: Guest filters shore excursions results using price range

    Given a Guest
    And I am on Homepage
    And I navigated to “Shore Excursion” page
    And I click Find Excursions
    And Shore Excursions page is present
   When  Price range is filtered to
    Then Only shore excursions within range are displayed