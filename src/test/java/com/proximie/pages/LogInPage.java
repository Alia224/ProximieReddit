package com.proximie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proximie.testbase.BaseClass;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class LogInPage {
	@FindBy(xpath = "//fieldset//faceplate-text-input//span[contains(text(),'Email')]")
	public WebElement Username;

	@FindBy(xpath = "//fieldset//faceplate-text-input//span[contains(text(), 'Password')]")
	public WebElement Password;
	
	@FindBy(xpath="//auth-flow-modal[@class='shadow-sm']//div//faceplate-tracker/button//span[@class='flex items-center justify-center']//span[contains(text(),'Log In')]")
	public WebElement Logbtn;
	
	@FindBy(id="login-username")
	public WebElement Shadow;

	public LogInPage() {

		PageFactory.initElements(BaseClass.driver, this);

	}

}
