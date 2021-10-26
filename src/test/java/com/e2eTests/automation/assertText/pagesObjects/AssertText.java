package com.e2eTests.automation.assertText.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.Setup;

public class AssertText {

public WebDriver driver;
public WebElement element;
	public AssertText() { 
		driver = Setup.driver;
	}

	/* Locators */
	
	final static String BTN_DYNAMIC ="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button";
	final static String BTN_DOUBLE ="doubleClickBtn";
	final static String BTN_RIGHT ="rightClickBtn";
	final static String TXT_DOUBLE ="doubleClickMessage";
	final static String TXT_RIGHT ="rightClickMessage";
	final static String TXT_DYNAMIC="dynamicClickMessage";
	/* @FindBy */
	
	//@FindBy(how = How.ID, using =BTN_DYNAMIC)
	//public static WebElement btnDynamic;
	@FindBy(how = How.ID, using =BTN_DOUBLE)
	public static WebElement btnDouble;
	@FindBy(how = How.ID, using = BTN_RIGHT)
	public static WebElement btnRight;
	
	@FindBy(how = How.ID, using =TXT_DYNAMIC)
	public static WebElement txtDynamic;
	@FindBy(how = How.ID, using =TXT_DOUBLE )
	public static WebElement txtDouble;
	@FindBy(how = How.ID, using = TXT_RIGHT)
	public static WebElement txtRight;
	
	public void clickButton(String id ) {

		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id(id));
		if(id.equals("doubleClickBtn"))
		{actions.doubleClick(elementLocator).perform();
		System.out.println("double click ok");}
		else if (id.equals("rightClickBtn"))
		{actions.contextClick(elementLocator).perform();
		System.out.println("right click ok");}
		else
		{actions.click(elementLocator).perform();
		System.out.println(" click ok");}
	
	
		//btnDynamic.click();
	}
}
