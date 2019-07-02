package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample3cucumber {

	@Given("user opens sign up page")
	public void user_opens_sign_up_page() {
	   System.out.println("user opened signup page"); 
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String f) {
		System.out.println("first name is:"+f);
	   
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String l) {
		System.out.println("last name is:"+l);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String d) {
		System.out.println("dob is:"+d);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pas) {
		System.out.println("pasword is:"+pas);
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("user click ok button");
	}

	@Then("verify the login successful")
	public void verify_the_login_successful() {
		System.out.println("signup verified");


	}


}
