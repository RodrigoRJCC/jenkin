package steps;

import net.serenitybdd.annotations.Step;

import pages.HomePage;

public class HomePageSteps {
	
	
	
	HomePage home;
	
	@Step("Performing Login")
	public void doLogin() {
		
		
		home.navigate();
		home.enterUsername();
		
	}
	
	
	@Step("Entering Password")
	public void doEnterPassword() {
		
		
		
		home.clickNextBtn();
		home.enterPassword();
	}
	

}
