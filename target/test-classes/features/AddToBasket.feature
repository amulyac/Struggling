Feature: Add To Basket
  As a Customer
  I want to be able to add items to my basket
  So that I can purchase them

  Background: 
    Given User is in Add to Basket page

  Scenario: Add to Basket successfully
    When User filled form with below details
      | gift message | delivery date | instructions | extras | parsonalization | quantity |
      | test         | test          | test         | random | test            | 1        |
    And click on ADD TO BASKET button
    Then Item should be successfully added to basket

  Scenario Outline: Add to Basket Field Validations
    When User enters <DeliveryDate>
    And User selects <Extras>
    And click on ADD TO BASKET button
    Then User should see <Validation Message>

    Examples: 
      | DeliveryDate | Extras | Validation Message   |
      | Monday       |        | Please enter a value |
      |              | random | Please enter a value |
      |              |        | Please enter a value |
