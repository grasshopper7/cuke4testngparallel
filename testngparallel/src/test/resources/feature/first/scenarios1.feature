Feature: Scenario and Scenario Outline Combination

  Scenario: Scenario 1
    And this is "FIRST" step
    And this is "SECOND" step

  Scenario Outline: Scenario Outline 1
    Given this is "<num>" step
    When this is "<num>" step

    Examples: 
      | num    |
      | FIRST  |
      | SECOND |
