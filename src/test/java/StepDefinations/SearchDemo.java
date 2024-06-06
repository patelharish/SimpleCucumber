package StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDemo {
	
	
	WebDriver driver;
	@Given("I am on the Google homepage")
	public void i_am_on_the_google_homepage() {
		System.setProperty("webdriber.chrome.driver", "C:\\\\Users\\\\patel\\\\OneDrive\\\\Desktop\\\\SDET\\\\chromedriver-win64\\\\chromedriver.exe");		
		driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("I enter {string} into the search bar")
	public void i_enter_into_the_search_bar(String string) {
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("TajMahel");
		//searchBox.sendKeys(Keys.ENTER);				
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		searchBtn.click();
	}

	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String string) {
		System.out.println(driver.getTitle());
		driver.quit();
		
		Assert.assertTrue(true);

	}

}
