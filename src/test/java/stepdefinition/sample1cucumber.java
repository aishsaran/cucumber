package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample1cucumber {
	WebDriver driver;
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() 
	{
	   // System.out.println("user opened newtours login application");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	}
	

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	   // System.out.println("user entered username and password");
	    PageObject log =PageFactory.initElements(driver,PageObject.class);
	    log.un.sendKeys("mercury");
	    log.pass.sendKeys("mercury");
	}

	@When("click on Submit button")
	public void click_on_Submit_button() {
		//System.out.println("submit button is clicked")	;
		//driver.findElement(By.name("login")).click();
		PageObject login =PageFactory.initElements(driver,PageObject.class);
		login.log.click();
	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("login is verified");
	   
	}



}
