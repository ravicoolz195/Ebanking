package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RdetailsPage {

	@FindBy(id="btnRoles")
	WebElement newrcreation;



	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
	WebElement rhome;

public void newRolecreationButton() {
	
	newrcreation.click();
	
	
}


public void roleHome() {
	
	rhome.click();
	
	
}



}
