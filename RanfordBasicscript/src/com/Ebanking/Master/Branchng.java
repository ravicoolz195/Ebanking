package com.Ebanking.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Branchng extends Base {
	@Test(dataProvider="Bdata")
	public void newBranch(String brname,String braddress,String brzip,String brcountry,String brstate,String brcity) throws InterruptedException {

		lb.newBranchCreation();
		
	}
		// lb.newBranchCreation("dddddd", "kjh1aek", "55555", "INDIA", "GOA", "GOA"); 

@DataProvider
public Object[][] Bdata(){
	
	Object[][] obj=new Object[3][6];
	obj[0][0]="jdsgkjhf";
	obj[0][1]="kjhdfkj";
	obj[0][2]="12345";
	obj[0][3]="INDIA";
	obj[0][4]="GOA";
	obj[0][5]="GOA";
	
	obj[0][0]="jdsgkfjhf";
	obj[1][1]="kjhdfkj";
	obj[1][2]="12345";
	obj[2][3]="INDIA";
	obj[3][4]="GOA";
	obj[4][5]="GOA";	
	
	obj[2][0]="jdrrsgkjhf";
	obj[2][1]="kjhdfkj";
	obj[2][2]="12345";
	obj[2][3]="INDIA";
	obj[2][4]="GOA";
	obj[2][5]="GOA";
	
	return obj;
	

	}
}

