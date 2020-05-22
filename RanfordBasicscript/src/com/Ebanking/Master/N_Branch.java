package com.Ebanking.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class N_Branch {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		

		Library lb=new Library();
		
		lb.openApp("http://183.82.100.55/ranford2/");
		
		lb.adminlogin("Admin", "M1ndq");
		lb.clickOnBranches();
		
		String Fpath="E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\TestData\\branchnote.txt";
		
		String Rpath="E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Results\\Res_branchnote.txt";
		
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
			
			String brname=sr[0];
			
			String braddress=sr[1];
			
			String brzip=sr[2];
			String brcountry=sr[3];
			String brstate=sr[4];
			String brcity=sr[5];
			
		
			
			
			
			String res=	lb.newBranchCreation(brname, braddress, brzip, brcountry, brstate, brcity);
			
			System.out.println(res);
			
			
			bw.write(sd+"@@@"+res);
			bw.newLine();
			
			
		}
		
		
		
		
		br.close();
		bw.close();
		
		lb.closeWindow();
		
		
		
		
	}

}
