package com.Ebanking.KeywordDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {



		Library lb=new Library();

		String Res=null;

		String  kpath="E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\KeywordDriven\\keyword_data.xlsx";

		String  kout="E:\\Ebanking\\RanfordBasicscriptPOM\\src\\com\\Ebanking\\KeywordDriven\\keywordRes_data.xlsx";

		FileInputStream fis=new FileInputStream(kpath);

		//workbook

		XSSFWorkbook wb=new XSSFWorkbook(fis);


		//sheet
		XSSFSheet ws=wb.getSheet("TestCase");
		XSSFSheet ws1=wb.getSheet("TestSteps");


		//testcase row count
		int tcrc=ws.getLastRowNum();
		System.out.println(tcrc);


		//teststeps row count

		int tsrc=ws1.getLastRowNum();
		System.out.println(tsrc);


		for (int i = 1; i <= tcrc; i++) {

			String exe=ws.getRow(i).getCell(2).getStringCellValue();

			if (exe.equalsIgnoreCase("Y")) 
			{

				String tcid=  ws.getRow(i).getCell(0).getStringCellValue();
				System.out.println(tcid);



				for (int j = 1; j <= tsrc; j++) 
				{

					String tstcid= ws1.getRow(j).getCell(0).getStringCellValue();

					//System.out.println(tstcid);


					if (tcid.equalsIgnoreCase(tstcid))

					{

						String key=ws1.getRow(j).getCell(3).getStringCellValue();

						System.out.println(key);

						switch (key) {
						
						
						case "RLanch":
						//Res=lb.OpenApp("http://183.82.100.55/ranford2/");
						Res=lb.OpenApp("http://183.82.100.55/ranford2/");
						break;


						
						case "RLogin":
						lb.adminlogin("Admin", "M1ndq");
						break;
						
						
						
						
						case "RBranch":
						lb.clickOnBranches();
						Res=lb.newBranchCreation("dsrfsarf", "sfsfff", "55555", "INDIA", "GOA", "GOA");
						break;
							
						
						case "RRole":
						lb.newRole("dfdfsf", "E");
						break;
								
						
						case "REmployee":
						Res=lb.newEmployee("dhoniii", "passsword", "pandu", "12");
						break;
						
						
						
						
						case "RLogout":
						lb.logout();;
						break;
						
						

						case "RClose":
						lb.closeWindow();;
						break;	

						
						
						

						default :
						System.out.println("pass valid keyword");
						break;

								
						}

						
						//result updation in test steps sheet
						
						
						ws1.getRow(j).createCell(4).setCellValue(Res);

						//result update in tc sheet
						
						if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail")) {
							
							ws.getRow(i).createCell(3).setCellValue(Res);
							
							ws.getRow(i).createCell(3).setCellValue("Fail");

							

							
						}
					}
				}
	
			}
			
			
			else {

				ws.getRow(i).createCell(3).setCellValue("Blocked");

			}	
			
			}
		
		FileOutputStream fout=new FileOutputStream(kout);
		wb.write(fout);
		wb.close();
		}
	}
