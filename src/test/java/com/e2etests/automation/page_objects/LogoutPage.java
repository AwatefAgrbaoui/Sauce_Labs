package com.e2etests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;


public class LogoutPage {

	/* @FindBy */
	@FindBy(how = How.CSS, using = "#react-burger-menu-btn")
	public static WebElement burgerMenu;
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutBtn;
	@FindBy(how = How.CLASS_NAME, using = "login_logo")
	public static WebElement loginLogo;

	public LogoutPage() {
		PageFactory.initElements(Setup.driver, this);
	}
		
	/* Create Method */
	public void clickOnBurgerMenu() throws InterruptedException {
		Thread.sleep(4000);
		burgerMenu.click();
	}

	public void clickOnLogoutButton() throws InterruptedException{
		Thread.sleep(3000);
		logoutBtn.click();
	}
}
