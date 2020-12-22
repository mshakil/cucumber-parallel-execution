Feature: Facebook Homepage
  Verify user is able to navigate to facebook homepage

  Scenario: Navigate to facebook dot com
    Given shuold navigate to facebook login page
    When facebook website open user should wait for two seconds
    And  Write some output on console for facebook test
    Then close webdriver for facebook test