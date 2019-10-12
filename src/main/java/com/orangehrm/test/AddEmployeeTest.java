package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;
import com.orangehrm.page.AddEmployeePage;
import com.orangehrm.page.HomePage;
import com.orangehrm.page.AddEmployeePage;
import com.orangehrm.page.LoginPage;
import com.orangehrm.page.PIMPage;

public class AddEmployeeTest extends BaseSelenium {
@Test
public void addEmployee() {
	LoginPage LP=new LoginPage();
	LP.login().navigateToPIMPage().navigateToAddEmployeePage().addEmployee();
	
}
} 
