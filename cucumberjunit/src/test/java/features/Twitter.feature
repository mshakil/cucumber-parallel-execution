Feature: Twitter Homepage
  Verify user is able to navigate to twitter homepage

  Scenario: Navigate to Twitter dot com
    Given shuold navigate to twitter login page
    When twitter website open user should wait for two seconds
    And Write some output on console for twitter test
    Then close webdriver for twitter test 