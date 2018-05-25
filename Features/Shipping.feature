Feature: Cucumber Hooks

  Scenario: Air Mode
    Given To load the application from the given URL.
    When Tests the cost calculation by giving mode as "air" and weigth in (kg) as "100".
    Then validates results of the test to be "Dear Customer, your total shipping cost is $100".

  Scenario: Ship Mode
    Given To load the application from the given URL.
    When Tests the cost calculation by giving mode as "ship" and weigth in (kg) as "100".
    Then validates results of the test to be "Dear Customer, your total shipping cost is $70".

  Scenario: Road Mode
    Given To load the application from the given URL.
    When Tests the cost calculation by giving mode as "road" and weigth in (kg) as "100".
    Then validates results of the test to be "Dear Customer, your total shipping cost is $50".

  Scenario: Air Mode as premimum customer
    Given To load the application from the given URL.
    When Tests the cost calculation by giving mode as "air" and weigth in (kg) as "100".
    And Set as premium customer.
    Then validates results of the test to be "Dear Customer, your total shipping cost is $88".