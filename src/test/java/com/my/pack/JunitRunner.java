package com.my.pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\Eclipse-workspace\\Cucumber_Test\\src\\test\\resources\\com\\my\\pack\\CucumberFeature.Feature"},
                            plugin={"pretty","html:target"},
                            monochrome=true)
public class JunitRunner {

}

