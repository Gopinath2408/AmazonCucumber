package pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Page {

	public WebDriver dr;

	public Product_Page(WebDriver dr) {
		this.dr = dr;
	}

	public String GetUrl() {
		return dr.getCurrentUrl();
	}

	public String GetTitile() {
		return dr.getTitle();
	}

	public void click_the_deals() {
		dr.findElement(By.xpath("//div[@id='nav-xshop-container']//ul//li[6]")).click();
	}

	public void click_item() {
		dr.findElement(By.xpath(
				"//div[contains(@class,\"DesktopDiscountAsinGrid-module__grid_pi4xEmM7RAHNMG9sGVBJ\")]/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[1]/a"))
				.click();
	}

	public String get_name_product() {
		return dr.findElement(By.id("title")).getText();
	}
	
	public void click_the_deals2() {
		dr.findElement(By.xpath("//div[contains(@class,\"DesktopDiscountAsinGrid-module__grid_pi4xEmM7RAHNMG9sGVBJ\")]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div[1]//a")).click();
	}
	
	
	
	

}
