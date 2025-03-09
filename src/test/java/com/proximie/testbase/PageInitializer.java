package com.proximie.testbase;

import com.proximie.pages.LogInPage;
import com.proximie.pages.RedditHomePage;
import com.proximie.pages.WelcomePage;

public class PageInitializer extends BaseClass {
	public static LogInPage Loginpage;
	public static WelcomePage Welcomepage;
	public static RedditHomePage Reddithomepage;

	public static void initialize() {
		Loginpage = new LogInPage();
		Welcomepage = new WelcomePage();

		Reddithomepage = new RedditHomePage();
	}
}
