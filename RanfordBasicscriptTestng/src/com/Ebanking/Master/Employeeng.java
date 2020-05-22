package com.Ebanking.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employeeng extends Base {
  @Test(dataProvider="Edata")
  public void newemp(String ename,String epass,String erole,String ebranch) throws InterruptedException {
	  
	  lbn.newEmployee(ename,epass,erole,ebranch);
  }

  @DataProvider
  public Object[][] Edata(){
	  
	  Object[][] obj=new Object[3][4];
		obj[0][0]="jdsgkjhf";
		obj[0][1]="kjhdfkj";
		obj[0][2]="kamal";
		obj[0][3]="1";
		
		obj[1][0]="jdsgkvfjhf";
		obj[1][1]="kjhdfkj";
		obj[1][2]="kamal";
		obj[1][3]="abc";
		
		
		obj[2][0]="jdrrsgkjhf";
		obj[2][1]="kjhdfkj";
		obj[2][2]="kamal";
		obj[2][3]="123456789";
		
		
		return obj;
	  
  }
  
  
  
  
  
}
