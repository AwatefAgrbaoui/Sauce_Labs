package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	 private LogoutPage logoutPage;

	    public LogoutStepDefinition() {
	        this.logoutPage = new LogoutPage();
	    }

	@When("Je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() throws InterruptedException {
		logoutPage.clickOnBurgerMenu();
	}
	@When("Je clique sur logout")
	public void jeCliqueSurLogout() throws InterruptedException {
		logoutPage.clickOnLogoutButton();
	}
	@Then("Je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String pageTitle){
		String title = Setup.driver.getCurrentUrl();
	  Assert.assertEquals(title, pageTitle);
	}



}
