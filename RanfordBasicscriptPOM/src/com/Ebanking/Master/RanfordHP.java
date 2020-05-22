package com.Ebanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {

	@FindBy(id="txtuId")
	WebElement usname;

	@FindBy(id="txtPword")
	WebElement pass;

	@FindBy(id="login")
	WebElement lgn;

public void login() {
	
	usname.sendKeys("Admin");
	pass.sendKeys("M1ndq");
	lgn.click();
}

}
