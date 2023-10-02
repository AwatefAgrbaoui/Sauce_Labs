package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AboutPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutStepDefinition {
	private AboutPage aboutPage;
	public AboutStepDefinition () {
		this.aboutPage= new AboutPage();
	}

	@When("Je clique sur le bouton about")
	public void jeCliqueSurLeBoutonAbout() throws InterruptedException {
		aboutPage.clickOnAboutButton();
	}
	@Then("Je me redirige vers le page about")
	public void jeMeRedirigeVersLePageAbout() {
		
	 
	}



}
