package test_Script;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Login_Page;

public class Login_Test extends Base {
  @Test
  public void verifyUserIsAbleToLoginValidCredenstial() {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameAndPassword("admin@clinic.com","123456");
	  login.loginIntoApp();
	  boolean isHomePageisDisplayed=login.isDashBoardLoaded();
	  assertTrue(isHomePageisDisplayed,"Home page is not loaded when entering valid credentials");
	  
	  
	  
  }
  @Test
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToLoginWithValidCredentials(String uname,String paswrd)
  {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameAndPassword(uname,paswrd);
	  login.loginIntoApp();
	  boolean isHomePageisDisplayed=login.isDashBoardLoaded();
	  assertTrue(isHomePageisDisplayed,"Home page is not loaded when entering valid credentials");
	    
	  
  }
}
