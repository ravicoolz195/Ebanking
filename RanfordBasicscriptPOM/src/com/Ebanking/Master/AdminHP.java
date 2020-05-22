package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP {
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement abranchbutton;

	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement arolesbutton;

	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement aemployeebutton;
	

	@FindBy(xpath="//*[@id=\"Table_02\"]/tbody/tr/td[1]/a/img")
	WebElement ahomebutton;
	
	@FindBy(xpath="//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")
	WebElement alogoutbutton;
	
	
	
	
	
	
	public void adminHPBranch() {
		
		abranchbutton.click();
	}
	
	public void adminHPRoles() {
		
		arolesbutton.click();
	}
	
	public void adminHPEmployee() {
		
		aemployeebutton.click();
	}
	
	public void adminHPHome() {
		
		ahomebutton.click();
	}
	
	

	public void adminHPLogout() {
		
		alogoutbutton.click();
	}
	
	}
	
