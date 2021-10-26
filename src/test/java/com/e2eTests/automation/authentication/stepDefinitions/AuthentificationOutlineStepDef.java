package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pagesObjects.AuthenticationPage;
import com.e2eTests.automation.authentication.pagesObjects.AuthentificationOutline;

import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDef {
	public WebDriver driver;
	private AuthenticationPage authentificationPage= new AuthenticationPage ();
	private CommonMethods commonMethods= new CommonMethods ();
	
	public AuthentificationOutlineStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationOutline.class);
	}
	
	
	@When("^je saisis le nom utilisateur \"([^\"]*)\"$")
	public void jeSaisisLeNomUtilisateur(String username) throws Throwable {
		authentificationPage.fillUsername(username);
	}

	@When("^je saisis le mot de passe \"([^\"]*)\"$")
	public void jeSaisisLeMotDePasse(String password) throws Throwable {
		authentificationPage.fillPassword(password);
	}
}
