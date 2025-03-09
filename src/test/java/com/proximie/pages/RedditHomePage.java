package com.proximie.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.proximie.testbase.BaseClass;

public class RedditHomePage {

	@FindBy(xpath = "//ul[@id='sr-bar']//li")
	public List<WebElement> subreddits;

	@FindBy(xpath= "(//div[@class='content']/div/div[5]//div[@class='entry unvoted']//div//p[@class='title']")
	public WebElement SecondRow;

	@FindBy(xpath = "//div[@class='content']/div/div[5]/div[@class='midcol unvoted']//div[@class='arrow up login-required access-required']")
	public WebElement ThumbsUp;

	@FindBy(xpath = "//div[@class='content']/div/div[5]/div[@class='midcol unvoted']//div[@class='arrow down login-required access-required']")
	public WebElement Thumbsdown;

	@FindBy(xpath = "//faceplate-text-input[@name='username']")
	public WebElement Username;

	@FindBy(xpath = "//faceplate-text-input[@name='password']")
	public WebElement Password;

	@FindBy(xpath = "//a[normalize-space()='logout']")
	public WebElement LogoutBtn;

	public RedditHomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
