package com.e2eTests.automation.boulet.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.boulet.pageObjects.BouletPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BouletStefDef {

	public WebDriver driver;
	private BouletPage bouletPage= new BouletPage ();
	private CommonMethods commonMethods= new CommonMethods ();
	public int titleLength;
	
	public BouletStefDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, BouletPage.class);
	}
	
	@Given("^je me connecte sur bouletcorp$")
	public void jeMeConnecteSurBouletcorp() throws Throwable {
		commonMethods.openURLWithConfigFile("url2");
		String title = driver.getTitle();
		System.out.println(title);
		titleLength = title.length();

	 
	}

	@When("^je clique sur Aléatoire$")
	public void jeCliqueSurAléatoire() throws Throwable {
		bouletPage.clickAleatoire();
	}

	@Then("^la page a changé$")
	public void laPageAChangé() throws Throwable {
		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);
		int currenttitleLength = currenttitle.length();
		if (currenttitleLength!= titleLength) {
			System.out.println("la page change");
		}

	}

	@Then("^les widgets facebook, twitter et tumblr sont bien affichés$")
	public void lesWidgetsFacebookTwitterEtTumblrSontBienAffichés() throws Throwable {
		String messageString = BouletPage.socialNetwork.getAttribute("id");
		 Assert.assertEquals("social_network", messageString);
		 System.out.println(messageString);


	}
	
}
