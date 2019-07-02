package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample2cucucmber
{
	@Given("open newtours app")
	public void open_newtours_app() {
	    System.out.println("open app");
	}

	@When("user enters un as {string} and pass as {string}")
	public void user_enters_un_as_and_pass_as(String string, String string2) {
		 System.out.println("un is"+string+" pass is"+string2);
	}

	@When("submit login form")
	public void submit_login_form() {
		 System.out.println("submit login button");
	}

	@Then("verify pass")
	public void verify_pass() {
		 System.out.println("pass");
	    
	}

	@Then("verify failure")
	public void verify_failure() {
		 System.out.println("fail");
	  
	}


}
