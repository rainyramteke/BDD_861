package com.cg.presentation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java//com/cg/features/adm.feature"},
		glue = {"stepdefinition"})

public class UI {

}
