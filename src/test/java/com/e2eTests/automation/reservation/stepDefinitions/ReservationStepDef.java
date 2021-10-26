package com.e2eTests.automation.reservation.stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.authentication.pagesObjects.AuthenticationPage;
import com.e2eTests.automation.reservation.pagesObjects.ReservationPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReservationStepDef extends CommonMethods {

	public WebDriver driver;
	private ReservationPage reservationPage= new ReservationPage ();
	private CommonMethods commonMethods= new CommonMethods ();
	
	public ReservationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ReservationPage.class);
		
		//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src,'https://www.google.com/recaptcha/api2/anchor?ar=1&k=6LcSzk8bAAAAAOTkPCjprgWDMPzo_kgGC3E5Vn-T&co=aHR0cHM6Ly9nZW8uY2FwdGNoYS1kZWxpdmVyeS5jb206NDQz&hl=fr&v=qljbK_DTcvY1PzbR7IG69z1r&size=normal&cb=wl00jbjff241')]")));

		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='recaptcha-anchor']/div[1]"))).click();
		
	}
	
	@Given("^je me connecte sur l'application oui\\.sncf$")
	public void jeMeConnecteSurLApplicationOuiSncf() throws Throwable {
		commonMethods.openURLWithConfigFile("url3");
	}

	@When("^je saisie la ville de départ \"([^\"]*)\"$")
	public void jeSaisieLaVilleDeDépart(String arg1) throws Throwable {
	   
	}

	@When("^je saisie la ville d'arrivée \"([^\"]*)\"$")
	public void jeSaisieLaVilleDArrivée(String arg1) throws Throwable {
	
	}

	@When("^je choisis la date$")
	public void jeChoisisLaDate() throws Throwable {
	 
	}

	@When("^je choisis l'heure$")
	public void jeChoisisLHeure() throws Throwable {

	}

	@When("^je click sur le bouton search$")
	public void jeClickSurLeBoutonSearch() throws Throwable {

	}

	@Then("^je me redirige vers la page home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String arg1) throws Throwable {
	 
	}
	
}




	
	