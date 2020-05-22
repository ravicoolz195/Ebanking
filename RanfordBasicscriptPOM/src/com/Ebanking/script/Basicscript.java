package com.Ebanking.script;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2/");
		
		String expValue="Ranford Bank";
		
		String actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if (actValue.equals(expValue)) {
			
			System.out.println("ranford home page login pass");
			
		}
		
		else {
			System.out.println("ranford home page login fail");

		}
				
		
		//driver.findElement(By.id("txtuId")).sendKeys();		
		
		
		//Admin login
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.id("login")).click();
		
		

		expValue="Welcome to Admin";
		
		actValue=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		if (actValue.equals(expValue)) {
			
			System.out.println("Admin page login pass");
			
		}
		
		else {
			System.out.println("Admin home page login fail");

		}
				

		
		
		
		
		
		//click on Branches
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		
		
		expValue="Branch Details";
		actValue=driver.findElement(By.id("lab19")).getText();


		if (actValue.contains(expValue)) {
			
			System.out.println("branch details page success");
			
		}
		
		else {
			System.out.println("branch details page fail");

		}

		
		
		//new branch creation
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		driver.findElement(By.id("txtbName")).sendKeys("ikkkar");
		driver.findElement(By.id("txtAdd1")).sendKeys("Address");
		driver.findElement(By.id("txtZip")).sendKeys("22222");
		
		Select s1=new Select(driver.findElement(By.id("lst_counrtyU")));
		s1.selectByVisibleText("INDIA");

		Select s2=new Select(driver.findElement(By.id("lst_stateI")));
		s2.selectByVisibleText("GOA");
  
		Select s3=new Select(driver.findElement(By.id("lst_cityI")));
		s3.selectByVisibleText("GOA");
  
		
		driver.findElement(By.id("btn_insert")).click();
		
		
		
Thread.sleep(3000);

		
		    expValue="Sucessfully";

			actValue=driver.switchTo().alert().getText();

			driver.switchTo().alert().accept();
	    // actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if (actValue.contains(expValue)) {
			
			System.out.println("branch creation success");
			
		}
		
		else {
			System.out.println("branch already exists");

		}
		
		//driver.switchTo().alert().accept();

		
		
		
		
		
		
		//click on home
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		
	//	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		
		
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();

	//	driver.findElement(By.cssSelector("a[href='Admin_Roles_details.aspx']"));
		
		//click on new roles
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		
		//new roles
		driver.findElement(By.id("btnRoles")).click();
		driver.findElement(By.id("txtRname")).sendKeys("ddnnddd");
		
		Select rtype=new Select(driver.findElement(By.id("lstRtypeN")));
		rtype.selectByVisibleText("E");
		
		driver.findElement(By.id("btninsert")).click();

		
		
		Thread.sleep(3000);
		
		    expValue="Successfully";

			actValue=driver.switchTo().alert().getText();

			driver.switchTo().alert().accept();
	    // actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if (actValue.contains(expValue)) {
			
			System.out.println("Role creation success");
			
		}
		
		else {
			System.out.println("Role already exists");

		}

		
		
		
		
		
		
		//click on home
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();


		
		
		
		
		//driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();

		//new employee
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys(RandomStringUtils.randomAlphabetic(7));
		driver.findElement(By.id("txtLpwd")).sendKeys("pasnnss");;

		Select srole=new Select(driver.findElement(By.id("lst_Roles")));
		srole.selectByVisibleText("kamal");
		
		Select srole1=new Select(driver.findElement(By.id("lst_Branch")));
		srole1.selectByVisibleText("123456789");
		
		
		
		driver.findElement(By.id("BtnSubmit")).click();
//		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		    expValue="Successfully";

			actValue=driver.switchTo().alert().getText();

			driver.switchTo().alert().accept();
	    // actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if (actValue.contains(expValue)) {
			
			System.out.println("Employee creation success");
			
		}
		
		else {
			System.out.println("Employee already exists");

		}
		
		
		//click on home
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		
		//click on logout
		driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
		

		

	
		
		
		//driver.close();
		
		
		
		
		
		
		
		
	}

}
