package com.Ebanking.Master;

import org.testng.annotations.Test;

public class allBranchCreations extends Base {

	@Test
	public void newBranch() throws InterruptedException {
		lb.newBranchCreation();    
	}

	@Test
	public void newRole() throws InterruptedException {

		lb.newRole();

	}

	@Test
	public void newemp() throws InterruptedException {

		lb.newEmployee();
	}


}

