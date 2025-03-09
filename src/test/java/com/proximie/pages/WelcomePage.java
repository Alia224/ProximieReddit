package com.proximie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proximie.testbase.BaseClass;

public class WelcomePage {
	@FindBy(xpath = "//div//span[@class='user']/a[@class='login-required login-link']")
	public WebElement LoginButtn;

	public WelcomePage() {

		PageFactory.initElements(BaseClass.driver, this);

	}
}