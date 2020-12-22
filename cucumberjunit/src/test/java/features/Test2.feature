Feature: Category Feature
  Verify if user is able navigate to different Categories

  Scenario: Check T-Shirts category
    Given should navigate to homepage
    When User selects t-shirt category
    Then T-shirt Banner should be shown