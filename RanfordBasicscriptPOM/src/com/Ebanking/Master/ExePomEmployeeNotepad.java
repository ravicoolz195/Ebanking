package com.Ebanking.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePomEmployeeNotepad {


	WebDriver driver;

	@BeforeTest
	public void rndHPLogin() {
		driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();


		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
	}





/**

	@Test
	public void rndEmpNote(String ename,String epass,String erole,String ebranch) throws IOException {



		String Fpath="E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\TestData\\employeenote.txt";

		String Rpath="E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\Results\\Res_employeenote.txt";

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

			String ename1=sr[0];

			String epass1=sr[1];

			String erole1=sr[2];

			String ebranch1=sr[3];





			
			String res=	lb.newEmployee(ename1, epass1, erole1, ebranch1);
			 
			
		//	String emp=EC.empcreation(ename, epass, erole,ebranch);





			
			System.out.println(res);


			bw.write(sd+"@@@"+res);
			bw.newLine();


		}
	


		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPEmployee();


		EdetailsPage EP=PageFactory.initElements(driver, EdetailsPage.class);
		EP.newEmployeeButton();



		Empcreation EC=PageFactory.initElements(driver, Empcreation.class);
		EC.empcreation(ename, epass, erole,ebranch);
		EC.empSubmit();

		driver.switchTo().alert().accept();


		EP.empHome();

		driver.close();


	}


}


**/

}






