Feature: Scenario and Scenario Outline Combination

  Scenario: Scenario 4
    And this is "FIRST" step
    And this is "SECOND" step

  Scenario Outline: Scenario Outline 4
    Given this is "<num>" step
    When this is "<num>" step

    Examples: 
      | num    |
      | FIRST  |
      | SECOND |
