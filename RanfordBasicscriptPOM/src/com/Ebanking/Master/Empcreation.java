package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Empcreation {
	
	/**
    ename=txtUname
    epass=txtLpwd
    erole=lst_Roles
    ebranch=lst_Branch
    esubmit=BtnSubmit
	 **/

	
	
	@FindBy(id="txtUname")
	WebElement empname;

	@FindBy(id="txtLpwd")
	WebElement emppass;
	
	@FindBy(id="lst_Roles")
	WebElement emprole;
	
	@FindBy(id="lst_Branch")
	WebElement empbranch;
	
	@FindBy(id="BtnSubmit")
	WebElement empsubmit;
	
	
	public void empcreation(String ename,String epass,String erole,String ebranch) {
		
		
		empname.sendKeys(ename);
		
		emppass.sendKeys(epass);
		
		Select er=new Select(emprole);
		er.selectByVisibleText(erole);

		Select eb=new Select(empbranch);
		eb.selectByVisibleText(ebranch);
		
	}
	
	
	
	public void empSubmit() {
		
		empsubmit.click();
		
	}
	
}
