Feature: Quora Homepage
  Verify user is able to navigate to Quora homepage

  Scenario: Navigate to Quora dot com
    Given shuold navigate to Quora login page
    When quora website open user should wait for two seconds
    And  Write some output on console for quora test
    Then close webdriver for quora test