package com.Ebanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Employee {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Library lb=new Library();
		
		lb.openApp("http://183.82.100.55/ranford2/");
		
		lb.adminlogin("Admin", "M1ndq");
		
		FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\Employee.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Edata");
		
		int rc=ws.getLastRowNum();

		System.out.println(rc);
		
		for (int i = 1; i <=rc; i++) 
		{
			
			XSSFRow wr = ws.getRow(i);
			
			XSSFCell wc0=wr.getCell(0);
			

			XSSFCell wc1=wr.getCell(1);

			XSSFCell wc2=wr.getCell(2);

			XSSFCell wc3=wr.getCell(3);

			XSSFCell wc4=wr.createCell(4);
			
			
			String ename = wc0.getStringCellValue();
			String epass=wc1.getStringCellValue();
			String erole=wc2.getStringCellValue();
			String ebranch=wc3.getStringCellValue();
			
			//geti
			
			
			String result=lb.newEmployee(ename, epass, erole, ebranch);
			
			System.out.println(result);
			
			wc4.setCellValue(result);
			
		}
		
		
		FileOutputStream fout=new FileOutputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Results\\R_Employee.xlsx");
		
		wb.write(fout);
		
		wb.close();
	    lb.closeWindow();
		
	}

}
