package com.e2eTests.automation.alert.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.admin.pagesObjects.RechercheCondidatPage;
import com.e2eTests.automation.alert.pagesObjects.ClicAlert;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClicAlertDef {
	public WebDriver driver;
	private ClicAlert clicAlert= new ClicAlert ();
	private CommonMethods commonMethods= new CommonMethods ();
	
	public ClicAlertDef ()
	{
		driver = Setup.driver;
		PageFactory.initElements(driver, ClicAlert.class);
	}
	
	@Given("^je me connecte sur le site$")
	public void jeMeConnecteSur() throws Throwable {
		commonMethods.openURLWithConfigFile("url4");
	}

	@When("^je clique sur bouton alert$")
	public void jeCliqueSurBoutonAlert() throws Throwable {
		clicAlert.clickAlertButton();
	
	}

	@Then("^alerte se ferme en cliquant sur OK$")
	public void alerteSeFerme() throws Throwable {
	  clicAlert.acceptAlert();
	}

	
	
	
}
