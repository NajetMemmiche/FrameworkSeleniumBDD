package com.e2eTests.automation.insertTextAndImage.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2eTests.automation.insertTextAndImage.pageObjects.InsertText;
import com.e2eTests.automation.utils.AbstractPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InsertImageDef {

	public WebDriver driver;
	private InsertText buzzPage = new InsertText();
	private CommonMethods commonMethods = new CommonMethods();
	
	public  InsertImageDef() {
		driver = Setup.driver;		
	}
	
	@When("^Je clique sur l'onglet upload images$")
	public void jeCliqueSurLOngletUploadImages() throws Throwable {
	    buzzPage.clickUploadPhotoTab();	    
	}

	@When("^Je saisie un message dans la case Photo-Text \"([^\"]*)\"$")
	public void jeSaisieUnMessageDansLaCasePhotoText(String messagePhoto) throws Throwable {
		buzzPage.fillPostArea(messagePhoto);		
	}                

	@When("^Je telecharge l'image en cliquant sur le boutton Upload Images \"([^\"]*)\"$")
	public void jeTelechargeLImageEnCliquantSurLeBouttonUploadImages(String photoPath) throws Throwable {
		buzzPage.uploadImages(photoPath);
		AbstractPage.sleep(500);
	}

	@When("^Je clique sur le bouton Post$")
	public void jeCliqueSurLeBoutonPost() throws Throwable {
		buzzPage.submitImage();
		AbstractPage.sleep(1000);
	}

	@Then("^Je vérifie que l'image est importer et que le message a été soumis \"([^\"]*)\"$")
	public void jeVérifieQueLImageEstImporterEtQueLeMessageAÉtéSoumis(String message) throws Throwable {
		String messagePublished1 = InsertText.messagePublished.getText();
		Assert.assertTrue(messagePublished1.equals(message));
		System.out.println(messagePublished1);	
		boolean photoPublished = commonMethods.isElementDisplayed(InsertText.imagePublished);
		Assert.assertTrue(photoPublished);
		System.out.println("The image is published!");
	}
	
	
	
	
}
