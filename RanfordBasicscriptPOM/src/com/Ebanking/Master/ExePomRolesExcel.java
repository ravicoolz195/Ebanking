package com.Ebanking.Master;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExePomRolesExcel {

	
	

	WebDriver driver;
	
	
	@BeforeTest
	public void rndHPLogin() {
		driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
	}
		
	
	
	
	@Test()
	
	public void roleExcel() throws IOException {
	
	FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\TestData\\Role.xlsx");
	
	//workbook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	//worksheet
	XSSFSheet ws=wb.getSheet("Rdata");
	
	//row
	
	int rc=ws.getLastRowNum();
	System.out.println(rc);
	
	
	for (int i = 1; i <=rc; i++) {
		
		//get row
		XSSFRow wr=ws.getRow(i);

		
		//getcell
		XSSFCell wc1=wr.getCell(0);
		XSSFCell wc2=wr.getCell(1);
		//XSSFCell wc3=wr.createCell(2);

		
		

		//get cell values
		String Rname = wc1.getStringCellValue();
		String Rtype = wc2.getStringCellValue();
		
	//	String result = lb.newRole(Rname, Rtype);
	
		//System.out.println(result);

	//	wc3.setCellValue(result);
		
	//	wb.close();
	
	
		
	
	
	//lb.closeWindow();


	
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPRoles();
		
		RdetailsPage rp=PageFactory.initElements(driver, RdetailsPage.class);
		rp.newRolecreationButton();

		Role_creation rc1=PageFactory.initElements(driver, Role_creation.class);
		rc1.rcreation(Rname, Rtype);
		rc1.roleSubmit();
	
		
		driver.switchTo().alert().accept();
	
		rp.roleHome();
		
}
		//driver.close();
		wb.close();
		
	}
		
	
	
}