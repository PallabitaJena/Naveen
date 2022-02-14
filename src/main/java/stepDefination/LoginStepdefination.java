package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


//import io.cucumber.java.en.Given;


public class LoginStepdefination {
	
	
	 WebDriver  driver;
	
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Printing *************************************");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002QDA744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com");
	    
	}
 
	@When("^title of logi page is Free CRM$")
	public void title_of_logi_page_is_Free_CRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	
	/*

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

*/
}
