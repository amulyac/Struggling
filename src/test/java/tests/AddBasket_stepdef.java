package tests;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AddBasketPage;

public class AddBasket_stepdef extends Base {

	AddBasketPage addbasket = new AddBasketPage(driver); 
	
	@Given("^User is in Add to Basket page$")
	public void user_is_in_Add_to_Basket_page() throws Throwable {
	   driver.get("http://www.notonthehighstreet.com/thegluttonousgardener/product/mini-vineyard");
	}

	@When("^User filled form with below details$")
	public void user_filled_form_with_below_details(DataTable table) throws Throwable {
	    List<List<String>> data = table.raw();
	    String  message = data.get(1).get(0);
	    String  deliverydate = data.get(1).get(1);
	    String  instructions = data.get(1).get(2);
	    String  extras = data.get(1).get(3);
	    String  parsonalization = data.get(1).get(4);
	    String  quantity = data.get(1).get(5);
	    
	    addbasket.FillAddtoBasketForm(message, deliverydate, instructions, extras, parsonalization,Integer.parseInt(quantity));
	}

	@When("^click on ADD TO BASKET button$")
	public void click_on_ADD_TO_BASKET_button() throws Throwable {
	    addbasket.AddToBasketButton.click();
	    WaitForElement(addbasket.AddedToBasketMsg);
	}

	@Then("^Item should be successfully added to basket$")
	public void item_should_be_successfully_added_to_basket() throws Throwable {
	    Assert.assertEquals("item added to basket", addbasket.AddedToBasketMsg.getText());
	}
	
	
}
