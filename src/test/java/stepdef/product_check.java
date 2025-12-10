package stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BrowserStart;
import Utility.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.Product_Page;

public class product_check extends Browser {

	Product_Page pp;

	@Given("Open the browser and launch the website.")
	public void open_the_browser_and_launch_the_website() {
		pp = new Product_Page(dr);
	}

	@Then("Check the Url and Title is correct.")
	public void check_the_url_and_title_is_correct() {

		assertEquals(pp.GetUrl(), "https://www.amazon.in/");
		assertEquals(pp.GetTitile(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@When("user click on the Todays deal.")
	public void user_click_on_the_todays_deal() {
		pp.click_the_deals();
	}

	@Then("Get the title and check whether it is Todays Deals.")
	public void get_the_title_and_check_whether_it_is_todays_deals() {
		assertEquals(pp.GetTitile(),"Amazon.in - Deals");
	}

	@When("User click on the first item of Todays Deals.")
	public void user_click_on_the_first_item_of_todays_deals() {
		pp.click_item();
	}

	@Then("Check the producr name.")
	public void check_the_producr_name() {
		
		boolean val =pp.GetTitile().contains(pp.get_name_product());
		assertTrue(val);
  
	}

	@Then("Go back to the Deals page and click on the second item.")
	public void go_back_to_the_deals_page_and_click_on_the_second_item() {
       dr.navigate().back();
       pp.click_the_deals2();
       
	}

	@Then("Check the second product is also present.")
	public void check_the_second_product_is_also_present() {
		boolean val =pp.GetTitile().contains(pp.get_name_product());
		assertTrue(val);
	}

}
