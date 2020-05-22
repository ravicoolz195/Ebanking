package com.Ebanking.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePomRoles {

	@Test(dataProvider="Rdata")
	public void rndHPLogin(String rolename,String roletype) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPRoles();
		
		RdetailsPage rp=PageFactory.initElements(driver, RdetailsPage.class);
		rp.newRolecreationButton();

		Role_creation rc=PageFactory.initElements(driver, Role_creation.class);
		rc.rcreation(rolename, roletype);
		rc.roleSubmit();
	
		
		driver.switchTo().alert().accept();
		driver.close();
		
		
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
