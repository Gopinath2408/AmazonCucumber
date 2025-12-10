package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver dr;
	
	
	public void launch() {
		dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
	}
	
	public void close() {
		dr.quit();
	}
}
