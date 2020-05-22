package com.Ebanking.Master;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Branches {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Library lb=new Library();
		
		lb.openApp("http://183.82.100.55/ranford2/");
		
		lb.adminlogin("Admin", "M1ndq");
		lb.clickOnBranches();
		
		FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\Branch.xlsx");
		
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


			
			lb.newBranchCreation(brname, braddress, brzip, brcountry, brstate, brcity);
	
	
		}
		
		
		wb.close();
	
		lb.closeWindow();
		
	
	}
	
	
}
