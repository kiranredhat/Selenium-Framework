package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.page.LoginPage;
import com.orangehrm.page.LoginPage;
import com.orangehrm.page.AddUserPage;
import com.orangehrm.page.AdminPage;
import com.orangehrm.page.HomePage;
import com.orangehrm.page.LeaveListPage;
import com.orangehrm.page.LeavePage;
@Test
public class LeaveListTest extends BaseSelenium {

	public void verifyLeaveListSearchc() {
	LoginPage LP= new LoginPage(); 
		//LP.login().verifywelcomelink();
		LP.login().navigateToLeavePage().navigateToViewLeaveListPage().verifyLeaveListSearch();
	

	
	}
			
}
