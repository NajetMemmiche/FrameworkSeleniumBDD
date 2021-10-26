package com.e2eTests.automation.admin.pagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheCondidatPage {

	/*Locators*/
	final static String MENU_RECRUITMENT ="//b[contains(text(),'Recruitment')]";
	final static String MENU_CONDIDAT = "menu_recruitment_viewCandidates";
	final static String NOM_CONDIDAT = "candidateSearch_candidateName";
	final static String BTN_SEARCH = "btnSrch";

	/*@FindBy*/
	@FindBy(how = How.XPATH, using = MENU_RECRUITMENT)
	public static WebElement menuRecruitment;
	@FindBy(how=How.ID, using=MENU_CONDIDAT)
	public static WebElement menuCondidat ;
	@FindBy(how=How.ID, using= NOM_CONDIDAT)
	public static WebElement nomCondidat ;
	@FindBy(how=How.ID, using=BTN_SEARCH)
	public static WebElement btnSearh;
	
	
	/* Methods*/
	public void fillCondidatname (String username) {

		nomCondidat.sendKeys(username);
	}
	
	public void clickSearchButton() {

		btnSearh.click();
	}
	
	public void clickMenuCondidat() {

		menuCondidat.click();
	}
	
	public void clickMenuRecruitment() {

		menuRecruitment.click();
	}

}


