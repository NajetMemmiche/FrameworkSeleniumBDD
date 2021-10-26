package com.e2eTests.automation.boulet.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BouletPage {

	/* Locators */
	final static String ALEATOIRE_LINK = "//*/div[@id='centered_nav']/a[3]";
	final static String SOCIAL_NETWORK_ID = "social_network";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = ALEATOIRE_LINK)
	public static WebElement aleatoryLink;
	@FindBy(how = How.ID, using = SOCIAL_NETWORK_ID)
	public static WebElement socialNetwork;
	
	/* Methods */
	
	public void clickAleatoire() {
		aleatoryLink.click();
	}

}
