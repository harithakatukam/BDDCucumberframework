package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage( WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="//input[@id='user-name']") WebElement txtusername;
	@FindBy(xpath="//input[@id='password']") WebElement txtPassword;
	@FindBy(xpath="//input[@id='login-button']") WebElement btnLogin;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") WebElement btnLogout;
	@FindBy(xpath="//button[normalize-space()='Open Menu']") WebElement openMenu;
	
	public void setUserName(String email) 
	{
		
		txtusername.sendKeys(email);
    }
	
	public void setPassword(String pwd) 
	{
		
		txtPassword.sendKeys(pwd);
    }
	
	public void clickLoginbtn() 
	{
		
		btnLogin.click();
    }
	public void clickLogoutbtn() throws InterruptedException
	{
		openMenu.click();
		Thread.sleep(3000);
		btnLogout.click();
	}
}
