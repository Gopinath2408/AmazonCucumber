package stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.Search_Page;

public class Search_product extends Browser{
	Search_Page sp;


	@Given("Launch the amazon website")
	public void launch_the_amazon_website() {
		sp = new Search_Page(dr);
	}
	
	@When("Search the value {string} in search bar")
	public void search_the_value_in_search_bar(String s) {
		sp.search(s);
	}

	@Then("Check the name and select the first one {string}")
	public void check_the_name_and_select_the_first_one(String s) throws InterruptedException {
		sp.select_first_option(s);
//		Thread.sleep(4000);
	}

	@Then("Check the title is same as product name {string}")
	public void check_the_title_is_same_as_product_name(String s) throws InterruptedException {
		Thread.sleep(4000);
		String exp = sp.getTitile();
		String act = sp.ExtractName(s);
		assertTrue(exp.contains(act));

	}

}
