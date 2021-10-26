package com.e2eTests.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;
	
	public CommonMethods ()
	{
		driver = Setup.driver;
		
	}
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	public void openURLWithConfigFile(String url) throws IOException {
		prop= new Properties ();
		FileInputStream fis = new FileInputStream("src\\test\\resources\\configs\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
}
