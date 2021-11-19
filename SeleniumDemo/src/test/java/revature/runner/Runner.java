package revature.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/kwameduodu/ExamplePipeline/SeleniumDemo/Features/ShoppingSpree.feature", glue={"revature.gluecode"})
public class Runner {

}
