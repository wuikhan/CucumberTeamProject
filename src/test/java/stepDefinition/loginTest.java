package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginTest {

@Given("^Open firefox browser and start application$")
public void open_firefox_browser_and_start_application()  {
   System.out.println("Open firefox browser and start application");
}

@When("^I enter \"(.*?)\" and \"(.*?)\"$")
public void i_enter_and(String arg1, String arg2)  {
	 System.out.println("enter username and password");
}

@When("^I click the login button$")
public void i_click_the_login_button()  {
	 System.out.println("I click the login button");
}
}
