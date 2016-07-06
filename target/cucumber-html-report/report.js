$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddToBasket.feature");
formatter.feature({
  "line": 1,
  "name": "Add To Basket",
  "description": "As a Customer\r\nI want to be able to add items to my basket\r\nSo that I can purchase them",
  "id": "add-to-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4007528734,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is in Add to Basket page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddBasket_stepdef.user_is_in_Add_to_Basket_page()"
});
formatter.result({
  "duration": 9993340059,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Add to Basket successfully",
  "description": "",
  "id": "add-to-basket;add-to-basket-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User filled form with below details",
  "rows": [
    {
      "cells": [
        "gift message",
        "delivery date",
        "instructions",
        "extras",
        "parsonalization",
        "quantity"
      ],
      "line": 11
    },
    {
      "cells": [
        "test",
        "test",
        "test",
        "random",
        "test",
        "1"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on ADD TO BASKET button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Item should be successfully added to basket",
  "keyword": "Then "
});
formatter.match({
  "location": "AddBasket_stepdef.user_filled_form_with_below_details(DataTable)"
});
formatter.result({
  "duration": 1354884711,
  "status": "passed"
});
formatter.match({
  "location": "AddBasket_stepdef.click_on_ADD_TO_BASKET_button()"
});
formatter.result({
  "duration": 921779051,
  "status": "passed"
});
formatter.match({
  "location": "AddBasket_stepdef.item_should_be_successfully_added_to_basket()"
});
formatter.result({
  "duration": 88743668,
  "status": "passed"
});
formatter.after({
  "duration": 2722231380,
  "status": "passed"
});
});