package com.e2eTests.automation.alert.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.Setup;




public class ClicAlert {
	
	public WebDriver driver;
	
	public ClicAlert() { 
		driver = Setup.driver;
	}

	/* Locators */
	final static String BTN_ALERT ="alertButton";
	
	/* @FindBy */
	@FindBy(how = How.ID, using = BTN_ALERT)
	public static WebElement btnAlert;

	public void clickAlertButton() {

		btnAlert.click();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

}
