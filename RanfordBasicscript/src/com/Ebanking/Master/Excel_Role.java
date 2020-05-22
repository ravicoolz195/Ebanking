package com.Ebanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Role {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		Library lb=new Library();
		lb.openApp("http://183.82.100.55/ranford2/");
		lb.adminlogin("Admin", "M1ndq");
		//lb.newRole(role, roletype);
		
		
		
	
		
		FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\Role.xlsx");
		
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
			XSSFCell wc3=wr.createCell(2);
	
			
			

			//get cell values
			String Rname = wc1.getStringCellValue();
			String Rtype = wc2.getStringCellValue();
			
			String result = lb.newRole(Rname, Rtype);
		
			System.out.println(result);

			wc3.setCellValue(result);
			
		//	wb.close();
		
		}
			
		
		FileOutputStream fos=new FileOutputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Results\\res_Role.xlsx");
		wb.write(fos);
		wb.close();
		
		
		lb.closeWindow();
		
		
	}
	
	
	

}
