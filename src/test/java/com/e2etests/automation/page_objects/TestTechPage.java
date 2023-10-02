package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class TestTechPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.CSS, using = "div[id='tabvanilla'] a:nth-child(3)")
	public static WebElement aleatoirBtn;
	@FindBy(how = How.CSS, using = "img[title='Facebook']")
	public static WebElement widgetFacebook ;
	@FindBy(how = How.CSS, using = "img[title='Twitter']")
	public static WebElement widgetTwitter ;
	@FindBy(how = How.CSS, using = "a[title='Share on Tumblr']")
	public static WebElement widgetTumblr ;
	
	public TestTechPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	/* Create Method */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("testTech.url"));
	}
	public void clickOnAleatoirBtn() {
		aleatoirBtn.click();
	}
	
}
