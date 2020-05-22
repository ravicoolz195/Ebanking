package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BdetailsPage {

	@FindBy(id="BtnNewBR")
	WebElement newbrcreation;


	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
	WebElement brhome;
	
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[3]/a/img")
	WebElement brlogout;

public void newBrcreation() {
	
	newbrcreation.click();	
}


public void branchHome() {
	
	brhome.click();
	
	
}


public void branchLogout() {
	
	brlogout.click();
	
	
}





}
