package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='email']")WebElement uname;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//button[text()='Login']")WebElement login;
	@FindBy(xpath="//span[text()='Dashboard']")WebElement dashboard;
	
	public void enterUsernameAndPassword(String user,String pas)
	{
	uname.sendKeys(user);	
	password.sendKeys(pas);
	}
	public void loginIntoApp()
	{
		login.click();
		
	}
	public boolean isDashBoardLoaded()
	{
		return dashboard.isDisplayed();
	}


}
