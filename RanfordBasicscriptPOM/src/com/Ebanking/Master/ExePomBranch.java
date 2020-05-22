package com.Ebanking.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePomBranch {

	@Test(dataProvider="Bdata")
	public void rndHPLogin(String bname,String baddress,String bzip,String bcountry,String bstate,String bcity) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPBranch();
	

		BdetailsPage Bdetails=PageFactory.initElements(driver, BdetailsPage.class);
		Bdetails.newBrcreation();

		
		Brcreation BRC=PageFactory.initElements(driver, Brcreation.class);
		BRC.brcreation(bname, baddress, bzip, bcountry, bstate, bcity);
		BRC.branchSubmit();
		
		
		driver.switchTo().alert().accept();
		
		
		Bdetails.branchHome();
	
		AHP.adminHPLogout();
		
		driver.close();
		
		
	}
		
	

@DataProvider
public Object[][] Bdata(){
	
	Object[][] obj=new Object[3][6];
	obj[0][0]="jdsgkwjhf";
	obj[0][1]="kjhdfkj";
	obj[0][2]="12345";
	obj[0][3]="INDIA";
	obj[0][4]="GOA";
	obj[0][5]="GOA";
	
	obj[1][0]="jdsgkvwfjhf";
	obj[1][1]="kjhdfkj";
	obj[1][2]="12345";
	obj[1][3]="INDIA";
	obj[1][4]="GOA";
	obj[1][5]="GOA";	
	
	obj[2][0]="jdrrsgkwjhf";
	obj[2][1]="kjhdfkj";
	obj[2][2]="12345";
	obj[2][3]="INDIA";
	obj[2][4]="GOA";
	obj[2][5]="GOA";
	
	return obj;
	

	}
	
	
	

}
