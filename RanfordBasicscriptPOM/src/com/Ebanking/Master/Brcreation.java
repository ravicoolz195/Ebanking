package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Brcreation {
	
	/**
	newbrclick=BtnNewBR
			brnamee=txtbName
			addr=txtAdd1
			zip=txtZip
			ctry=lst_counrtyU
			sta=lst_stateI
			cit=lst_cityI
			btn1=btn_insert
	**/
	
	
	@FindBy(id="txtbName")
	WebElement brname;

	@FindBy(id="txtAdd1")
	WebElement braddress;
	
	@FindBy(id="txtZip")
	WebElement brzip;
	
	@FindBy(id="lst_counrtyU")
	WebElement brcountry;
	
	@FindBy(id="lst_stateI")
	WebElement brstate;
	
	@FindBy(id="lst_cityI")
	WebElement brcity;
	
	@FindBy(id="btn_insert")
	WebElement brsubmit;
	
	
	
	
	public void brcreation(String bname,String baddress,String bzip,String bcountry,String bstate,String bcity) {
		
		
		brname.sendKeys(bname);
		braddress.sendKeys(baddress);
		brzip.sendKeys(bzip);
		
		Select sctry=new Select(brcountry);
		sctry.selectByVisibleText(bcountry);

		Select sstate=new Select(brstate);
		sstate.selectByVisibleText(bstate);
		
		Select scity=new Select(brcity);
		scity.selectByVisibleText(bcity);
		
		
		
	}
	
	
	
	public void branchSubmit() {
		
		brsubmit.click();
		
	}
	
	
	
	

	
	
}
