package com.Ebanking.Master;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

public class Exelib {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Library lb=new Library();
		
		
		String rvalue=lb.openApp("http://183.82.100.55/ranford2/");
		System.out.println(rvalue);

		lb.adminlogin("Admin","M1ndq");
		lb.clickOnBranches();
		lb.newBranchCreation("jhonnnnnnnn","adressss","55555","INDIA","GOA","GOA");
		
		String rolevaluee=lb.newRole("ytdddd","E");
		System.out.println(rolevaluee);
		
		lb.newEmployee(RandomStringUtils.randomAlphabetic(7),"password","kamal","123456789");
		lb.logout();
		lb.closeWindow();
	
	
	}

}
