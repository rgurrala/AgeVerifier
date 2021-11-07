Feature: API test

  Scenario Outline: post an age and check if its legal for alcohol consumption
    Given I check if the "<age>" is legal
    Then I should get a "<response>"
    Examples:
      | age |response|
      | 10 |false|
      | 20 |true|
