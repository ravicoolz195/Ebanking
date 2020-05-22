package com.Ebanking.Master;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	
	
	Libraryng lbn=new Libraryng();
	//Library lbn=new Library();
	
  @BeforeTest
  public void beforeTest() {

	  lbn.adminlogin();

	  //lb.adminlogin("Admin", "M1ndq");
  }

  @AfterTest
  public void afterTest() {
	  lbn.logout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {

	lbn.openApp();

  //lb.openApp("http://183.82.100.55/ranford2/");
  }

  @AfterSuite
  public void afterSuite() {
	  lbn.closeWindow();
  }

}
