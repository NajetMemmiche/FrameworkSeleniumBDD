package com.e2eTests.automation.insertTextAndImage.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsertText {

		
	//	private WaitsMethods waitsMethods = new WaitsMethods();

		/* BuzzStatus */

		/* Locators */
		final static String BUZZ_MENU = "//b[contains(text(),'Buzz')]";
		final static String UPDATESTATE_TAB = "status-tab-label";
		final static String POSTHOLDER_ID = "createPost_content";
		final static String POSTSUBMIT_ID = "postSubmitBtn";
		final static String POSTPUBLISHED_ATTRIBUTE = "/html/body/div[1]/div[3]/div/div[6]/ul/li[1]/div[1]/div[5]";

		/* @FindBy */
		@FindBy(how = How.XPATH, using = BUZZ_MENU)
		public static WebElement buzzMenu;
		@FindBy(how = How.ID, using = UPDATESTATE_TAB)
		public static WebElement updateTab;
		@FindBy(how = How.ID, using = POSTHOLDER_ID)
		public static WebElement postHolder;
		@FindBy(how = How.ID, using = POSTSUBMIT_ID)
		public static WebElement btnSubmit;
		@FindBy(how = How.XPATH, using = POSTPUBLISHED_ATTRIBUTE)
		public static WebElement postPublished;
		//
		/* Methods */

		public void clickBuzzMenu() {
			buzzMenu.click();
		}

		public void clickUpdateStateTab() {
			updateTab.click();
		}

		public void fillThePostHolder(String post) {
			postHolder.sendKeys(post);
		}

		public void clickPostSubmitButton() {
			btnSubmit.click();
		}

		//////////////////////////////////
		/* BuzzPhoto */

		/* Locators */
		final static String UPLOADPHOTO_TAB = "tabLink2";
		final static String POSTHOLDERAREA_ID = "//textarea[@id='phototext']";
		final static String UPLOADIMAGESBTN_ID = "image-upload-button";
		final static String POSTBTN_ID = "imageUploadBtn";
		final static String MESSAGEPUBLISHED_XPATH = "/html/body/div[1]/div[3]/div/div[6]/ul/li[1]/div[1]/div[5]";
		final static String IMAGE_XPATH = "/html/body/div[1]/div[3]/div/div[6]/ul/li[1]/div[1]/div[6]/div";

		/* @FindBy */
		@FindBy(how = How.ID, using = UPLOADPHOTO_TAB)
		public static WebElement uploadPhotoTab;
		@FindBy(how = How.XPATH, using = POSTHOLDERAREA_ID)
		public static WebElement postArea;
		@FindBy(how = How.ID, using = UPLOADIMAGESBTN_ID)
		public static WebElement btnUploadImage;
		@FindBy(how = How.ID, using = POSTBTN_ID)
		public static WebElement btnPost;
		@FindBy(how = How.XPATH, using = MESSAGEPUBLISHED_XPATH)
		public static WebElement messagePublished;
		@FindBy(how = How.XPATH, using = IMAGE_XPATH)
		public static WebElement imagePublished;
		//
		/* Methods */

		public void clickUploadPhotoTab() {
			uploadPhotoTab.click();
		}

		public void fillPostArea(String post) {
			postArea.sendKeys(post);
		}

		/**
		 * 
		 */
		public void uploadImages(String imagePath) {
			btnUploadImage.click();
			StringSelection stringSelection = new StringSelection(imagePath);
			Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipBoard.setContents(stringSelection, null);
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		public void submitImage() {
			btnPost.click();
		}
	}
