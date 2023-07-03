package SstepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.POM;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 
public class LoginSteps {
	WebDriver driver = null;
	POM obj1;
  
	
	@Given("user is login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
		String chromepath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",chromepath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://example.testproject.io/web/");
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters(String username,String password) throws InterruptedException {
		System.out.println("Hello");
		obj1 = new POM(driver);
		obj1.USER(username);
		obj1.PASSWORDE(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		 
		Thread.sleep(2000);
	}
	
	@And("clicks on login button")
	public void user_enters_button() {
		//driver.findElement(By.id("login")).click();
		System.out.println("Hello");
		obj1.LOGIN();
	}
	
	@Then("user is navigated to home page")
	public void user_page() {
		System.out.println("Hello");
		obj1.LOGOUT();
		//driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
		
	}
}
