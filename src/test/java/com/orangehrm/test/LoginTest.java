package com.orangehrm.test;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.Testlistner;
import com.orangehrm.common.WebDriverFactory;
import com.orangehrm.page.AddEmployeePage;
import com.orangehrm.page.AddEmployeePage;
import com.orangehrm.page.LoginPage;


public class LoginTest extends BaseSelenium {
	
	/*@Test (dataProvider=("logindataFromCSV"))
	public void verifyLoginSuccessfull(String strUserName, String strPassword) {
		LoginPage LP=new LoginPage();
		LP.loginArg();


		}
	}*/
	
/*	@Test 
	public void verifyLoginSuccessfull() {
		LoginPage LP=new LoginPage();
		LP.login();


		}
	*/
//@Test (dataProvider=("logindataFromCSV"))
public void verifyLoginSuccessfull1(String strUserName, String strPassword) {
	LoginPage LP=new LoginPage();
	LP.loginArg(strUserName,strPassword);

	}




	
//@Test (dataProvider=("excelDataProvider"))
public void verifyLoginSuccessfull(String strUserName, String strPassword) {
	LoginPage lp=new LoginPage();
	lp.loginArg(strUserName, strPassword);
	}

@Test
public void testLoginn() throws MalformedURLException, IOException {
	LoginPage lp=new LoginPage();
	lp.testLogin();
	}
}