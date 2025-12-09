package Runner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners({ListenersClass.class})
@CucumberOptions(features = {"C:\\Users\\gopinath.s2\\eclipse-workspace\\Amazon_Project\\Resources\\Features"},
                             glue = {"stepdef"},
                             plugin = {"pretty","html:target/htmlreports/report.html"}
                                       
                )


public class loginRunner extends AbstractTestNGCucumberTests {

}