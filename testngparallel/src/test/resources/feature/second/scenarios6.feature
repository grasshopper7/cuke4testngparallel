Feature: Scenario Outline Only

  Scenario Outline: Scenario Outline 6
    Given this is "<num>" step
    When this is "<num>" step

    Examples: 
      | num    |
      | FIRST  |
      | SECOND |