package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;

@Given("User launch chrome Browser")
public void user_launch_chrome_browser() {
	driver=new ChromeDriver();
    lp=new LoginPage(driver);
}

@When("User Opens Url {string}")
public void user_opens_url(String url) {
       driver.get(url);
}

@When("User Enters Username as {string} and Password as {string}")
public void user_enters_username_as_and_password_as(String username, String pwd) {
	lp.setUserName(username);
	lp.setPassword(pwd);
   
}

@When("clicks the login button")
public void clicks_the_login_button() throws InterruptedException {
  lp.clickLoginbtn();
  Thread.sleep(3000);
}

@Then("Page title should be {string}")
public void page_title_should_be(String title) {
    if(driver.getPageSource().contains("Username and password do not match"))
    {
    	driver.close();
    	Assert.assertTrue(true);
    }
    else
    {
    	    	Assert.assertEquals(title, driver.getTitle());
    }
}

@When("User Click on Log out Link")
public void user_click_on_log_out_link() throws InterruptedException {
lp.clickLogoutbtn();
Thread.sleep(3000);
}


@Then("Close Browser")
public void close_browser() {
    driver.quit();
}



}
