package com.proximie.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.proximie.pages.RedditHomePage;
import com.proximie.utils.CommonMethods;
import com.proximie.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedditGamingsteps extends CommonMethods {
	@Given("I am on the Reddit homepage")
	public void i_am_on_the_reddit_homepage() {

	}

	@Then("I click on the Login feature")
	public void i_click_on_the_login_feature() {
		click(Welcomepage.LoginButtn);

	}

	@When("I enter a valid email and a valid password")
	public void i_enter_a_valid_email_and_a_valid_password() {

		WebElement shadow = Reddithomepage.Username.getShadowRoot()
				.findElement(By.cssSelector("div.label-container.interior-label span.input-boundary-box "));
		click(shadow);
		wait(1);

		WebElement inputfieldusername = Reddithomepage.Username.getShadowRoot()
				.findElement(By.cssSelector("span input[name='username']"));

		sendText(inputfieldusername, ConfigsReader.getproperty("username"));

		wait(1);

		WebElement inputfieldpassword = Reddithomepage.Password.getShadowRoot()
				.findElement(By.cssSelector("span input[name='password']"));

		sendText(inputfieldpassword, ConfigsReader.getproperty("password"));
		wait(2);

	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		click(Loginpage.Logbtn);
		wait(1);
	}

	@When("I search and click on the gaming subreddit")
	public void i_search_and_click_on_the_gaming_subreddit() {
		for (WebElement element : Reddithomepage.subreddits) {
			String el = element.getText();

			if (el.equalsIgnoreCase("-gaming")) {
				waitForClickability(element);
				element.click();
				break;
			}

		}
		wait(3);

	}

	@Then("I verify in the second post for the title if contains “Nintendo” Thumbs up or if the title does not contain “Nintendo” Thumbs down")
	public void i_verify_in_the_second_post_for_the_title_if_contains_nintendo_thumbs_up_or_if_the_title_does_not_contain_nintendo_thumbs_down() {
		waitForVisibility(
				By.xpath("//div[@class='content']/div/div[5]//div[@class='entry unvoted']//div//p[@class='title']"));
		String Title = driver
				.findElement(By.xpath(
						"//div[@class='content']/div/div[5]//div[@class='entry unvoted']//div//p[@class='title']"))
				.getText();
		System.out.println("This is the Title-->" + Title);
		if (Title.contains("Nintendo")) {
			Reddithomepage.ThumbsUp.click();
			System.out.println("The Title contains Nintendo");
		} else {
			Reddithomepage.Thumbsdown.click();
			System.out.println("The Title does not contain Nintendo");
		}
		wait(3);
	}

	@Then("I logout")
	public void i_logout() {
		click(Reddithomepage.LogoutBtn);
		wait(3);

	}

}