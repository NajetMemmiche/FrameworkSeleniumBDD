package com.e2eTests.automation.assertText.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.alert.pagesObjects.ClicAlert;
import com.e2eTests.automation.assertText.pagesObjects.AssertText;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssertTextDef {

	public WebDriver driver;
	public String idBtn;
	
	private AssertText assertText= new AssertText ();
	private CommonMethods commonMethods= new CommonMethods ();
	
	public AssertTextDef ()
	{
		driver = Setup.driver;
		PageFactory.initElements(driver, AssertText.class);
	}
	
	@Given("^je me connecte sur le site demoqa$")
	public void jeMeConnecteSur() throws Throwable {
		commonMethods.openURLWithConfigFile("url5");
	}
	@When("^je clique sur bouton \"([^\"]*)\"$")
	public void jeCliqueSurBouton(String id) throws Throwable {
	
		assertText.clickButton(id);
		idBtn=id;
	}

	
	@Then("^message \"([^\"]*)\" s'affiche$")
	public void messageSAffiche(String msg) throws Throwable {
		if(idBtn.equals("doubleClickBtn"))
		{
		String clickMeMessage = assertText.txtDouble.getText();
		Assert.assertTrue(clickMeMessage.contains(msg));
		}
		else if (idBtn.equals("rightClickBtn"))
		{
		String clickMeMessage = assertText.txtRight.getText();
		Assert.assertTrue(clickMeMessage.contains(msg));
		}
		else
		{
		String clickMeMessage = assertText.txtDynamic.getText();
		Assert.assertTrue(clickMeMessage.contains(msg));
		}
		
	}
}
