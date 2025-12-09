package pom_pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search_Page {
 
	public WebDriver dr;

	public Search_Page(WebDriver dr) {
		super();
		this.dr = dr;
	}
	
	
	public void search(String s)
	{
	    dr.findElement(By.id("twotabsearchtextbox")).sendKeys(s,Keys.ENTER);
	}
	
	public void select_first_option(String s) {
		
		if(s.equals("Watches"))
	         dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div[2]/div[1]/a/h2/span")).click();
		else if(s.equals("Laptop"))
		      dr.findElement(By.linkText("Apple 2025 MacBook Air (13-inch, Apple M4 chip with 10-core CPU and 8-core GPU, 16GB Unified Memory, 256GB) - Silver")).click();

		else
		      dr.findElement(By.linkText("Men Lace Up Sneaker Shoes")).click();
		                        
	}
	
	public  String getTitile() {
		
		String parenttab = dr.getWindowHandle();
		Set<String> windows = dr.getWindowHandles();
		for(String win:windows) {
			if(!win.equals(parenttab)) {
				dr.switchTo().window(win);
				break;
			}
		}
		String title = dr.getTitle();
		System.out.println("Title :" + title);
	    return title;
		
	}


	public String ExtractName(String s) {
		String str;
		if(s.equals("Watches"))
		      str = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[5]/div[4]/div[1]/div/h1/span")).getText();
			else if(s.equals("Laptop"))
			      str = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[5]/div[4]/div[1]/div/h1/span")).getText();

			else
			      str = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div/h1/span")).getText();
		System.out.println("Element : "+str);
		return str;
	}

	
	
	
	
	
}
