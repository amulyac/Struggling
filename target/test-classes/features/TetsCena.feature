Feature: Create an application

  Background: 
    Given I am on application management page
    And I have access to the page
    And there is no red flags
    And I close the search dropdown

  Scenario Outline: Update application's info
    Given the application "<app1>" is on the list
    And the "<app1>" is not invalid
    When I change the"<type>"
    Then the "<app1>" contains the same infos before
      | string | XXxxxx |
      | zip    | XXxxxx |
      | double | XXxxxx |
    And the " <type>" is updated

    Examples: 
      | name | type   |
      | app1 | string |
      | app1 | float  |

  Scenario Outline: Update application's info
    Given the application "<name >" is on the list
    And the "<name >" is not valid
    When I change the"<type>"
    Then the "<name>" contains the same infos before
    And the " <type>" is updated

    Examples: 
    
    
      | name | type   |

      | app1 | string |
      | app1 | float  |
