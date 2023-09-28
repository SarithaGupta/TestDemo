package testRunner;

//import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;



//@RunWith(Cucumber.class)
@CucumberOptions
//(features="src\\test\\resources\\Features\\accountsOverview.feature",
(features="src\\test\\resources\\Features",
 glue= {"stepDefinitions"},
 monochrome=true,
 plugin={"pretty"}
		// ,"html:target/HtmlReports/reports.html"}
		 //"junit:target/JunitReports/report.junit", 
		 //"json:target/JsonReports/reports.json"}
 
 
 //tags="@test1"
 )

public class TestRunner extends AbstractTestNGCucumberTests{
	TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());


}
