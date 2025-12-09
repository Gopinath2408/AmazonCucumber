package stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void start() {
         
		System.out.println("Launching the website............");
		
	}
	
	
	@After
	public void end() {
		System.out.println("Closing the browser.......");
	}

}
