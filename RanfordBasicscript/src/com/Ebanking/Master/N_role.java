package com.Ebanking.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class N_role {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		Library lb=new Library();
		lb.openApp("http://183.82.100.55/ranford2/");
		lb.adminlogin("Admin", "M1ndq");
		
		String Fpath = "E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\rolenote.txt";
		
		String Rpath="E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Results\\Res_rolenote.txt";
			
		String SD;
		
		//file read
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		
		//file write
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		while (( SD=BR.readLine())!=null) {
			
			System.out.println(SD);
			
			String SR[]=SD.split("###");
			
			String Rname=SR[0];
			String Rtype=SR[1];
			
			String Result=lb.newRole(Rname, Rtype);
			
			System.out.println(Result);
			
			//result
			BW.write(SD+"$$$"+Result);
			BW.newLine();
			
		}
		
		BW.close();
		BR.close();
		
		
		
		

	}

}
