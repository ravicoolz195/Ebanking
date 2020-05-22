package com.Ebanking.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class N_Employee {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Library lb=new Library();
		
		lb.openApp("http://183.82.100.55/ranford2/");
		
		lb.adminlogin("Admin", "M1ndq");
		
		
		
		String Fpath="E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\employeenote.txt";
		
		String Rpath="E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Results\\Res_employeenote.txt";
		
		String sd;
		
		FileReader fr=new FileReader(Fpath);
		BufferedReader br=new BufferedReader(fr);
		String sread=br.readLine();
		System.out.println(sread);
		
		
		FileWriter fw=new FileWriter(Rpath);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		
		while ((sd=br.readLine())!=null) {
			
			System.out.println(sd);
			
			String sr[]=sd.split("###");
			
			String ename=sr[0];
			
			String epass=sr[1];
			
			String erole=sr[2];
			
			String ebranch=sr[3];
			
		
			
			
			
			String res=	lb.newEmployee(ename, epass, erole, ebranch);
			
			System.out.println(res);
			
			
			bw.write(sd+"@@@"+res);
			bw.newLine();
			
			
		}
		
		
		
		
		br.close();
		bw.close();
		
		lb.closeWindow();
		
		
		
		
	}

		
	}


