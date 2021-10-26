package com.e2eTests.automation.reservation.pagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReservationPage {

	
	/*Locators*/
	final static String FROM_ID = "vsb-origin-train-launch";
	final static String TO_ID = "vsb-destination-train-launch";
	final static String BUTTON_SEARCH = "vsb-booking-train-launch-submit";
	final static String OUTWARD_DATE = "vsb-dates-dialog-train-launch-aller-retour-1";
	final static String INWARD_DATE = "vsb-dates-dialog-train-launch-aller-retour-2";

	/*@FindBy*/
	@FindBy(how=How.ID, using=FROM_ID)
	public static WebElement origin;
	@FindBy(how=How.ID, using=TO_ID)
	public static WebElement destination ;
	@FindBy(how=How.ID, using= BUTTON_SEARCH)
	public static WebElement btnsearch ;
	@FindBy(how=How.ID, using=OUTWARD_DATE)
	public static WebElement outward;
	@FindBy(how=How.ID, using=INWARD_DATE)
	public static WebElement inward;

	/* Methods*/
	public void fillOrigin (String origine) {

		origin.sendKeys(origine);
	}
	public void fillDestination(String dest) {

		destination.sendKeys(dest);
	}
	public void clickSearchButton() {

		btnsearch.click();
	}
	
	public void fillOutward (String origine) {

		outward.sendKeys(origine);
	}
	public void fillInward (String origine) {

		inward.sendKeys(origine);
	}
}
