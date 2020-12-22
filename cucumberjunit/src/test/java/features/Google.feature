Feature: Google Homepage
  Verify user is able to navigate to google homepage

  Scenario: Navigate to google dot com
    Given shuold navigate to google login page
    When google website open user should wait for two seconds
    And  Write some output on console for google test
    Then close webdriver for google test