package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	private LoginPage loginPage;

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		loginPage.login();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = LoginPage.titleProducts.getText();
		Assert.assertEquals(text, message);
	}

	@Given("Je me connecte a l application Swag Labs avec coordonnees non correct")
	public void jeMeConnecteALApplicationSwagLabsAvecCoordonneesNonCorrect() {
		loginPage.loginNP();
	}

	@Then("Le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String errorText) {
		String errorMessage = LoginPage.msgError.getText();
		Assert.assertEquals(errorText, errorMessage);
	}

}
