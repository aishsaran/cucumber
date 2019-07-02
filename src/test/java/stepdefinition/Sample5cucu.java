package stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Sample5cucu {
	@When("user searches for products")
	public void user_searches_for_products(DataTable prodname) {
	    
		List<String> p1=prodname.asList();
		for(String products:p1)
		{
			System.out.println(products);
		}
		
		
	}

	@When("verify the product displayed")
	public void verify_the_product_displayed() {
	}

	@Then("close the application")
	public void close_the_application() {
	    
	}



}
