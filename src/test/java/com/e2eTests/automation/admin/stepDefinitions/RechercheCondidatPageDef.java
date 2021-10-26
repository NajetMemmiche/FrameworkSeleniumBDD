package com.e2eTests.automation.admin.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.admin.pagesObjects.RechercheCondidatPage;
import com.e2eTests.automation.authentication.pagesObjects.AuthenticationPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RechercheCondidatPageDef {

	
	public WebDriver driver;
	private RechercheCondidatPage rechercheCondidatPage= new RechercheCondidatPage ();

	
	public RechercheCondidatPageDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, RechercheCondidatPage.class);
	}
	

@When("^je clique sur menu Recruitment$")
public void jeCliqueSurMenuRecruitment() throws Throwable {
	Thread.sleep(3000);
	rechercheCondidatPage.clickMenuRecruitment();
	
}

@When("^je clique sur menu Condidates$")
public void jeCliqueSurMenuCondidates() throws Throwable {
	rechercheCondidatPage.clickMenuCondidat();
}

@When("^je saisi nom condidat \"([^\"]*)\"$")
public void jeSaisiNomCondidat(String nomc) throws Throwable {
	rechercheCondidatPage.fillCondidatname(nomc);
}

@When("^Je clique sur le bouton search$")
public void jeCliqueSurLeBoutonSearch() throws Throwable {
	rechercheCondidatPage.clickSearchButton();
}

@Then("^Je trouve un seul condidat \"([^\"]*)\"$")
public void jeTrouveUnSeulCondidat(String nom) throws Throwable {

	//String messageToWelcome = AuthenticationPage.welcome.getText();
	//Assert.assertTrue(messageToWelcome.contains(message));
	String sCellValue = driver.findElement(By.xpath("//*[contains(text(),nom)]")).getText();
	Assert.assertTrue(sCellValue.contains(nom));
	//System.out.println("The table contains last name : "+sCellValue);
}

@Then("^Je me déconnecte du compte$")
public void jeMeDéconnecteDuCompte() throws Throwable {

}
}
