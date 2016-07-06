package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {

	@Before
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
  @After
   public void DisposeDriver(){
	driver.close();
	driver.quit();
}

	
}
