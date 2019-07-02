package stepdefinition;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Sample4cucumber {
	WebDriver driver;
	
	   
	
	@Test(priority=1)
	@Given("username and password")
	public void username_and_password() {
		//System.out.println("user entered username and password");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys("Lalitha");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("password123");
	
	}
    @Test(priority=2)
	@Given("click signin")
	public void click_signin() {
    	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
    	WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys("Lalitha");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("password123");
		//System.out.println("clicks on signin ");
		WebElement login = driver.findElement(By.name("Login"));
		login.click();
	  
	}
    @Test(priority=3)
	@When("user searches for iphone")
	public void user_searches_for_iphone() {
		//System.out.println("searches for iphone");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement find=driver.findElement(By.id("myInput")) ;
		find.sendKeys("summer wear");
		WebElement findbutton=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		findbutton.click();
    	WebElement addcart=driver.findElement(By.linkText("Add to cart"));
		addcart.click();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchSubCat.htm?val=search");
		WebElement addtocart=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]"));
		addtocart.click();
		WebElement checkout=driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a"));
		checkout.click();
		
	}
   
@Test(priority=5)
	@When("user proceeds to pay")
	public void user_proceeds_to_pay() {
		//System.out.println("proceeds to pay");
	driver.get("http://10.232.237.143:443/TestMeApp/checkout.htm");
	WebElement proc = driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
	proc.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement bank = driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	bank.click();
	WebElement con = driver.findElement(By.xpath("//*[@id='btn']"));
	con.click();
	WebElement usenam = driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[1]"));
	usenam.sendKeys("123456");
	WebElement passwrd = driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[2]"));
	passwrd.sendKeys("Pass@456");
	WebElement logina=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input "));
	logina.click();		
	WebElement transid = driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input"));
	transid.sendKeys("Trans@456");
	WebElement lastone = driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input"));
	lastone.click();
	}
     @Test(priority=6)
	@When("user singsout from the shopping")
	public void user_singsout_from_the_shopping() {
		//System.out.println("clcikson signout button");
    	 WebElement signout=driver.findElement(By.linkText("SignOut"));
    	 signout.click();
	}

     @BeforeTest
 	public void configureBrowser()
 	{
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
 	driver = new ChromeDriver();
 	}
 	@AfterTest
 	public void closeapp()
 	{
 		driver.close();
 	}

}
