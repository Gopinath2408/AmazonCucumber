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
	         dr.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/div/div[4]/div/div//div[@class='s-image-padding']//a")).click();
		else if(s.equals("Laptop"))
		      dr.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div//a")).click();

		else
		      dr.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/div[1]/div[3]/div/div/div/div/span/div/div/div[1]//a")).click();
		                        
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
//		System.out.println("Title :" + title);
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
		
//		System.out.println("Element : "+str);
		
		String a[] = str.split("\\s+");
		
		System.out.print(a[0]);
		
		return a[0];
	}

	
	
	
	
	
}
