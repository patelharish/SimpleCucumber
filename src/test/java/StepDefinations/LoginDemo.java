package StepDefinations;

import io.cucumber.java.en.*;

public class LoginDemo {

	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Result: browser is open");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Result: user is on login page");
	}

	@When("user enters Raghav and {int}")
	public void user_enters_raghav_and(Integer int1) {
		System.out.println("Result: user enters Raghav and {int}");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Result: user clicks on login");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Result: user is navigated to the home page");
	}

	@When("user enters Ele and {int}")
	public void user_enters_ele_and(Integer int1) {
		System.out.println("Result: user enters Ele and {int}");
	}

}
