package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage extends PageObject{

	

	public void navigate() {
        WebDriverManager.chromedriver().setup(); //solo se necesita esto para instalar el driver
        getDriver().get("https://gmail.com");
		//open();
	}
	
	public void enterUsername() {
		
		$("//*[@id=\"identifierId\"]").sendKeys("trainer@way2automation.com");
		
	}
	
	
	public void clickNextBtn() {
		
		

		$("//*[@id=\"identifierNext\"]/div/button/span").click();
		Serenity.takeScreenshot();
	}
	
	
	public void enterPassword() {
		
		$("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys("23sdfsfds");
		
		
	}
	
}
