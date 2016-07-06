package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddBasketPage extends utilities {

	public AddBasketPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[id^='gift_message']")
	public WebElement GiftMsg;
	
	@FindBy(css="[id^='desired_delivery_date_monday']")
	public WebElement DeliveryDate;
	
	@FindBy(css="[id^='delivery_instructions_e_g_try_a_neighbour_leave_round_back_of_house_']")
	public WebElement Instructions;
	
	@FindBy(css="#line_item_options_attributes_4_product_option_value_id_currency_GBP")
	public WebElement Extras;
	
	@FindBy(xpath="//*[contains(@id,'personalisation_for_slate_label_additional_cost_applies')]")
	public WebElement Personalization; 
	
	@FindBy(css="#qty")
	public WebElement Quantity;
	
	@FindBy(css=".product_buttons #add_to_cart") 
	public WebElement AddToBasketButton; 
	
	@FindBy(css="#basket_title h2")
	public WebElement AddedToBasketMsg;
	

	public void FillAddtoBasketForm(
			String message, String deliverydate,String instructions, 
			String extras, String personalization,int quantity 
			){
		InputEntry(GiftMsg,message);
		InputEntry(DeliveryDate,deliverydate);
		InputEntry(Instructions,instructions);		
		SelectFromDropdown(Extras,extras);
		InputEntry(Personalization,personalization);
		InputEntry(Quantity,Integer.toString(quantity));
	}
	
	
	
}
