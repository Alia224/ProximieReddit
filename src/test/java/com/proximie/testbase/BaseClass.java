package com.proximie.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.proximie.utils.ConfigsReader;
import com.proximie.utils.Constants;

public class BaseClass {
	public static WebDriver driver;

	public static void SetUp() {
		ConfigsReader.readPorperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getproperty("browser");

		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Using Chrome as default browser");
			driver = new ChromeDriver();
			break;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		String url = ConfigsReader.getproperty("url");
		driver.get(url);
		PageInitializer.initialize();

	}
	
	public static void TearDown() {
		
		if (driver != null) {
			driver.quit();
		}

		
	}
}
