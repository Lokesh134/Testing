package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
 
 WebDriver driver;
 By text_user = By.id("name");
 By text_pass = By.id("password");
 By text_log = By.id("login");
 By text_logout = By.id("logout");
 
 public  POM(WebDriver driver) {
	this.driver = driver; 
	if(!driver.getTitle().equals("TestProject Demo")) {
		throw new IllegalStateException("this is not login page");
	}
 }

public void USER(String username)
{
 driver.findElement(text_user).sendKeys(username);
}
public void PASSWORDE(String password)
{
 driver.findElement(text_pass).sendKeys(password);
}
public void LOGIN()
{
 driver.findElement(text_log).click();
}
public void LOGOUT()
{
 driver.findElement(text_logout).isDisplayed();
}
}