package com.Ebanking.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Roleng extends Base{
  @Test(dataProvider="Rdata")
  public void newRole(String rname,String rtype) throws InterruptedException {
	  
	  lbn.newRole(rname,rtype);
	  
  }
  
  
  
  @DataProvider

  public Object[][] Rdata(){
	  
	  Object[][] obj=new Object[3][2];
		obj[0][0]="jdsgkjhf";
		obj[0][1]="E";

		obj[1][0]="jdfkjhf";
		obj[1][1]="E";
		
		obj[2][0]="jdsrrrgkjhf";
		obj[2][1]="E";
		
		
		
		
		return obj;
	  
  }

  
}
