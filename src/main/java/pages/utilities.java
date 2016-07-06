package pages;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utilities {

	public void InputEntry(WebElement ele,String txt){
		ele.clear();
		ele.sendKeys(txt); 
	}
	
	public int SelectRandom(int max){
		Random rnd = new Random();
		return rnd.nextInt(max);
	}
	
	public void SelectFromDropdown(WebElement ele,String value){		
	Select dropdown = new Select(ele); 	
	if(value.trim().equals("random")){
		int optionCount = dropdown.getOptions().size();
		dropdown.selectByIndex(SelectRandom(optionCount));
	}
	else{
		dropdown.selectByVisibleText(value);	
	}	
	}	
}
