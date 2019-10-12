package com.orangehrm.test;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.page.AddUserPage;
import com.orangehrm.page.AdminPage;
import com.orangehrm.page.HomePage;
import com.orangehrm.page.LoginPage;

public class AddUserTest extends BaseSelenium {
@Test
public void addUser() {
	LoginPage LP=new LoginPage();
	LP.login().navigateToAdminPage().naviateToAddUserPage().addUser();

	
}
}