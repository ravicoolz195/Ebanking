package com.Ebanking.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePomEmployee {

	@Test(dataProvider="Edata")
	public void rndHPLogin(String ename,String epass,String erole,String ebranch) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPEmployee();
	

		EdetailsPage EP=PageFactory.initElements(driver, EdetailsPage.class);
		EP.newEmployeeButton();
		
		

		Empcreation EC=PageFactory.initElements(driver, Empcreation.class);
		EC.empcreation(ename, epass, erole,ebranch);
		EC.empSubmit();
		
		driver.switchTo().alert().accept();
		
		
		driver.close();
		
		
	}
	
	 @DataProvider
	  public Object[][] Edata(){
		  
		  Object[][] obj=new Object[3][4];
			obj[0][0]="jdsgkjhf";
			obj[0][1]="kjhdfkj";
			obj[0][2]="pandu";
			obj[0][3]="1";
			
			obj[1][0]="jdsgkvfjhf";
			obj[1][1]="kjhdfkj";
			obj[1][2]="pandu";
			obj[1][3]="abc";
			
			
			obj[2][0]="jdrrsgkjhf";
			obj[2][1]="kjhdfkj";
			obj[2][2]="pandu";
			obj[2][3]="123456789";
			
			
			return obj;
		  
	  }
		
	
	
	
	
	
	
	
	
	
	
	
	

}
