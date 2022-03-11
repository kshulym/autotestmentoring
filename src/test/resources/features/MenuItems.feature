Feature: As a user I want to get ability to read Documentation section

  @smoke
  Scenario: Documentation section should contain appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    Then there are 7 child menu items displayed

  @smoke
  Scenario Outline: Verify Docs section items
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "<title>" item
    Then the page with title "<title>" is displayed
    Examples:
      | title          |
      | Gherkin Syntax |
      | Installation   |