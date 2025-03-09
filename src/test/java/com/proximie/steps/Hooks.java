package com.proximie.steps;

import com.proximie.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {

		BaseClass.SetUp();
	}

	@After
	public void end(Scenario scenario) {

		BaseClass.TearDown();
	}

}
