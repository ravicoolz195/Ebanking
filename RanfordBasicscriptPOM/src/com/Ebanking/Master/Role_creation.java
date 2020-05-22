package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Role_creation {
	
	/**
    rname=txtRname
    rtype=lstRtypeN
    rclick=btninsert
	**/
	
	
	@FindBy(id="txtRname")
	WebElement rname;

	@FindBy(id="lstRtypeN")
	WebElement rtype;
	
	@FindBy(id="btninsert")
	WebElement rsubmit;
	
	
	public void rcreation(String rolename,String roletype) {
		
		
		rname.sendKeys(rolename);
		
		Select r=new Select(rtype);
		r.selectByVisibleText(roletype);
		
	}
	
	
	
	public void roleSubmit() {
		
		rsubmit.click();
		
	}
	
	
	
	

	
	
}
