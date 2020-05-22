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

public class ExePomBranchExcel {

	
	WebDriver driver;
	
	
	@BeforeTest
	public void rndHPLogin() {
		driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
	}
		
		
		@Test
		public void branchCreationExcel() throws IOException {
			
			
			FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\TestData\\Branch.xlsx");
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			XSSFSheet ws=wb.getSheet("Bdata");
			
			int rc=ws.getLastRowNum();
			System.out.println(rc);
			
			
			for (int i = 1; i <=rc; i++) {
				
				XSSFRow wr=ws.getRow(i);
				
			    XSSFCell wc0=wr.getCell(0);
			    
				XSSFCell wc1=wr.getCell(1);
				XSSFCell wc2=wr.getCell(2);

				XSSFCell wc3=wr.getCell(3);

				XSSFCell wc4=wr.getCell(4);

				XSSFCell wc5=wr.getCell(5);

				
				
				//wc0.getStringCellValue();
				
				String  brname=wc0.getStringCellValue();
				

				String  braddress=wc1.getStringCellValue();

				String  brzip=wc2.getStringCellValue();

				String  brcountry=wc3.getStringCellValue();

				String  brstate=wc4.getStringCellValue();

				String  brcity=wc5.getStringCellValue();


				
			//	lb.newBranchCreation(brname, braddress, brzip, brcountry, brstate, brcity);
	
				
			AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
			AHP.adminHPBranch();
		

			BdetailsPage Bdetails=PageFactory.initElements(driver, BdetailsPage.class);
			Bdetails.newBrcreation();

			
			Brcreation BRC=PageFactory.initElements(driver, Brcreation.class);
			BRC.brcreation(brname, braddress, brzip, brcountry, brstate, brcity);
			BRC.branchSubmit();
			
			
			driver.switchTo().alert().accept();
			
			Bdetails.branchHome();
			
		}
			
			wb.close();
			
		
		}
		

}
		
		/**
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPBranch();
	

		BdetailsPage Bdetails=PageFactory.initElements(driver, BdetailsPage.class);
		Bdetails.newBrcreation();

		
		Brcreation BRC=PageFactory.initElements(driver, Brcreation.class);
		BRC.brcreation(bname, baddress, bzip, bcountry, bstate, bcity);
		BRC.branchSubmit();
		
		
		driver.switchTo().alert().accept();
		
		
		Bdetails.branchHome();
	
		AHP.adminHPLogout();
		
		driver.close();
		
		**/
	

		
	
	
	
		
	



