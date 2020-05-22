package com.Ebanking.Master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Libraryng {

	public static WebDriver driver;
	public static String expValue,actValue;
	public static FileInputStream fis;
	public static Properties pro;
	
	
	//@Test()
	public void openApp() throws IOException {

	
		fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscriptTestng\\src\\com\\Ebanking\\Properties\\Rep.properties");
		pro=new Properties();
		pro.load(fis);
			
		
		
		
		driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2/");

		expValue="Ranford Bank";

		actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();

		if (actValue.equals(expValue)) {

			System.out.println("ranford home page login pass");

		}

		else {
			System.out.println("ranford home page login fail");

		}

	//	return "pass";	
	}



	//@Test()
	public void adminlogin() {



	//	fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Properties\\Rep.properties");
		//prop=new Properties();
		//prop.load(fis);
			
		
		
		
		driver.findElement(By.id(pro.getProperty("usname"))).sendKeys("Admin");
		driver.findElement(By.id(pro.getProperty("pwd"))).sendKeys("M1ndq");
		driver.findElement(By.id(pro.getProperty("lgn"))).click();



		expValue="Welcome to Admin";

		actValue=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();

		if (actValue.equals(expValue)) {

			System.out.println("Admin page login pass");

		}

		else {
			System.out.println("Admin home page login fail");

		}



	}


/**
	@Test(priority=3)
	public void clickOnBranches() {

		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();



		expValue="Branch Details";
		actValue=driver.findElement(By.id("lab19")).getText();


		if (actValue.contains(expValue)) {

			System.out.println("branch details page success");

		}

		else {
			System.out.println("branch details page fail");

		}		
	}
**/

	
	//@Test()
	public void newBranchCreation(String brname,String braddress,String brzip,String brcountry,String brstate,String brcity) throws InterruptedException {

		

		//click on branch
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();

		
		//clicl on new branch
		driver.findElement(By.id(pro.getProperty("newbrclick"))).click();


		//
		driver.findElement(By.id(pro.getProperty("brnamee"))).sendKeys(brname);
		driver.findElement(By.id(pro.getProperty("addr"))).sendKeys(braddress);
		driver.findElement(By.id(pro.getProperty("zip"))).sendKeys(brzip);

		Select s1=new Select(driver.findElement(By.id(pro.getProperty("ctry"))));
		s1.selectByVisibleText(brcountry);

		Select s2=new Select(driver.findElement(By.id(pro.getProperty("sta"))));
		s2.selectByVisibleText(brstate);

		Select s3=new Select(driver.findElement(By.id(pro.getProperty("cit"))));
		s3.selectByVisibleText(brcity);


		driver.findElement(By.id(pro.getProperty("btn1"))).click();



		
		//Thread.sleep(3000);


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


		//click on home
		driver.findElement(By.xpath(pro.getProperty("hme"))).click();

		//return actValue;
	}

	
	

	//@Test()
	    public void newRole(String rname,String rtypee) throws InterruptedException {


		//click on new roles
		driver.findElement(By.xpath(pro.getProperty("clickonroles"))).click();

		//new roles
		driver.findElement(By.id(pro.getProperty("broles"))).click();
		driver.findElement(By.id(pro.getProperty("rname"))).sendKeys(rname);

		Select rtype=new Select(driver.findElement(By.id(pro.getProperty("rtype"))));
		rtype.selectByVisibleText(rtypee);

		driver.findElement(By.id(pro.getProperty("rclick"))).click();



		Thread.sleep(3000);

		expValue="Sucessfully";

		String actValue=driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();
		// actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();

		if (actValue.contains(expValue)) {

			System.out.println("Role creation success");

		}

		else {
			System.out.println("Role already exists");

		}


		driver.findElement(By.xpath(pro.getProperty("hme"))).click();
		

		//return actValue;


	}



	//@Test()
	public void newEmployee(String ename,String epass,String erole,String ebranch) throws InterruptedException {

		
		//click on home
		//		driver.findElement(By.xpath(pro.getProperty("hme"))).click();

		
        //click on emp
		driver.findElement(By.xpath(pro.getProperty("clickonemp"))).click();
		
		
		driver.findElement(By.id(pro.getProperty("clickenew"))).click();
		driver.findElement(By.id(pro.getProperty("ename"))).sendKeys(ename);
		driver.findElement(By.id(pro.getProperty("epass"))).sendKeys(epass);;

		Select srole=new Select(driver.findElement(By.id(pro.getProperty("erole"))));
		srole.selectByVisibleText(erole);

		Select srole1=new Select(driver.findElement(By.id(pro.getProperty("ebranch"))));
		srole1.selectByVisibleText(ebranch);



		driver.findElement(By.id(pro.getProperty("esubmit"))).click();
		//		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		expValue="Successfully";

		actValue=driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();
		// actValue=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();

		if (actValue.contains(expValue)) {

			System.out.println(actValue);

		}

		else {
			System.out.println("Employee already exists");

		}


		//click on home
		driver.findElement(By.xpath(pro.getProperty("hme"))).click();

        //return actValue;
	}

	
	
	//@Test()
	public void logout() {


		driver.findElement(By.xpath(pro.getProperty("lgt"))).click();

		//driver.findElement(By.xpath(pro.getProperty("blgt"))).click();


	}


	//@Test()
	public void closeWindow() {


		driver.close();


	}

}