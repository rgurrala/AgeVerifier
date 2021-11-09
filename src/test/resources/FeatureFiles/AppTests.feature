Feature: app test

Scenario Outline: test age limits
  Given I launch the app and provide "<Age>"
  And click verify button
  Then I will know the "<status>"
  Examples:
    | Age | status |
    | 20 | You can drink |
    | 10 | You can't drink yet |

  Scenario: negative input
    Given I launch the app and provide "-9"
    And click verify button
    Then I get an error


