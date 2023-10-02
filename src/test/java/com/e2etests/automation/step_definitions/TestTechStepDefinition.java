package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.TestTechPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTechStepDefinition {
	private TestTechPage testTechPage;

	public TestTechStepDefinition() {
		this.testTechPage = new TestTechPage();
	}

	@Given("Je me connecte a l application Bouletcorp")
	public void jeMeConnecteALApplicationBouletcorp() {
		testTechPage.goToUrl();
	}
	@When("Je clique sur le bouton aleatoire")
	public void jeCliqueSurLeBoutonAleatoire() {
		testTechPage.clickOnAleatoirBtn();
	}
	@Then("Je me redirige vers une page d une autre histroire {string} {string} {string} s affiche")
	public void jeMeRedirigeVersUnePageDUneAutreHistroireSAffiche(String facebookText, String twitterText, String tumblrText) {
	  String facebook = TestTechPage.widgetFacebook.getAttribute("title");
	  Assert.assertEquals(facebookText, facebook);
	  String twitter = TestTechPage.widgetTwitter.getAttribute("title");
	  Assert.assertEquals(twitterText, twitter);
	  String tumblr = TestTechPage.widgetTumblr.getText();
	  Assert.assertEquals(tumblrText, tumblr);
	}



}
