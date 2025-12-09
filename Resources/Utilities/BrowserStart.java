package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserStart {
	
	public WebDriver dr;
	
	public WebDriver chrome(String url) {
		dr = new ChromeDriver();
		dr.get(url);

		dr.manage().window().maximize();
		
		return dr;

	}

	public WebDriver launch_edge(String url) {
		dr = new EdgeDriver();
		dr.get("https://www.flipkart.com");
		dr.manage().window().maximize();
		
		return dr;

	}

	public WebDriver launch_firefox(String url) {
		dr = new FirefoxDriver();
		dr.get(url);
		dr.manage().window().maximize();
		return dr;

	}

}
