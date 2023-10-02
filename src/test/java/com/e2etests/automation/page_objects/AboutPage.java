package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AboutPage {
	
	/* @FindBy */
	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement aboutBtn;
	
	public AboutPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/* Create Method */
	public void clickOnAboutButton() throws InterruptedException {
		Thread.sleep(3000);
		aboutBtn.click();
	}
	
}
