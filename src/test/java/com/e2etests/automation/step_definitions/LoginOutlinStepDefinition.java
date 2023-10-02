package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginOutlinStepDefinition {
	private LoginPage loginPage;

	public LoginOutlinStepDefinition() {
		this.loginPage = new LoginPage();
	}
	@Given("Je me connecte sur l application Swag Labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginPage.loginOutline();
		}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String usernameText) {
		loginPage.fillUsername(usernameText);
	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String passwordText) {
		loginPage.fillPassword(passwordText);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickLogin();
	}

}
