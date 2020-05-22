package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EdetailsPage {


	/**

	  clickenew=BtnNew
      ename=txtUname
      epass=txtLpwd
      erole=lst_Roles
      ebranch=lst_Branch
      esubmit=BtnSubmit
	 **/





	@FindBy(id="BtnNew")
	WebElement newecreation;



	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
	WebElement ehome;
	
	

	public void newEmployeeButton() {

		newecreation.click();


	}

	public void empHome() {
		
		ehome.click();
		
		
	}




}
