package com.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orangehrm.common.WebDriverFactory;
public class LoginPage {
	@FindBy (id="txtUsername") WebElement elmUserName;
	@FindBy (id="txtPassword") WebElement elmPassword;
	@FindBy (id="btnLogin") WebElement elmLogin;
	@FindBy (xpath="//img[@alt='LinkedIn OrangeHRM group']") WebElement elmLinkin;
	@FindBy (xpath="//img[@alt='OrangeHRM on Facebook']") WebElement elmFacebook;
	@FindBy (xpath="//img[@alt='OrangeHRM on twitter']") WebElement elmTwitter;
	@FindBy (xpath="//img[@alt='OrangeHRM on youtube']") WebElement elmYouTube;
	public LoginPage() {
PageFactory.initElements(WebDriverFactory.DR, this); //PageFactory.initElements method is use to initialize elements of the page.

}
	public HomePage login1() {
		elmUserName.sendKeys();
		elmPassword.sendKeys();
		elmLogin.click();
		return new HomePage().isPageLoaded().verifywelcomelink();
	}
	public HomePage login() {
		/*elmLinkin.click();
		elmFacebook.click();
		elmTwitter.click();
		elmYouTube.click();*/
		elmUserName.sendKeys("kiran");
		elmPassword.sendKeys("kiran");
		elmLogin.click();		
		return new HomePage().isPageLoaded().verifywelcomelink();
	}
	
	public HomePage loginArg(String strUserName, String strPassword) {
		elmUserName.sendKeys(strUserName);
		elmPassword.sendKeys(strPassword);
		elmLogin.click();		
		return new HomePage().verifywelcomelink();
	}

}
