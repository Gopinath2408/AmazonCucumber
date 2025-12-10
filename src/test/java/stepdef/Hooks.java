package stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	Browser bs;
	
	@Before
	public void start() {
         
		bs = new Browser();
		bs.launch();
	
	}
	
	
	@After
	public void end() {
		bs.close();;
	}

}
