package com.Ebanking.Master;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sgrid {
	
	
	static DesiredCapabilities cap=null;
	
	@Test
	public void gd() throws MalformedURLException {
		
		//Library lb=new Library();

//FileInputStream fis=new FileInputStream("E:\\Ebanking\\RanfordBasicscript\\src\\com\\Ebanking\\Properties\\Rep.properties");

		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAVI TEJA\\Desktop\\geckodriver.exe");
		
		/*
		driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2/");


		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.id("login")).click();
*/
		/**
		cap=new DesiredCapabilities();
	
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		**/
		
		/**

		   if (Br.equalsIgnoreCase("firefox"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("firefox");
			   cap.setPlatform(Platform.WINDOWS);
			    	
	    	}
		   
		   else if (Br.equalsIgnoreCase("chrome"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("chrome");
			   cap.setPlatform(Platform.ANY);
			   
		}
		
		**/
		
		
		
		   cap=new DesiredCapabilities();


			System.setProperty("webdriver.ie.driver", "C:\\Users\\RAVI TEJA\\Desktop\\IEDriverServer.exe");

		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI TEJA\\Desktop\\chromedriver.exe");

		   cap.setBrowserName("Ie");
		   cap.setPlatform(Platform.ANY);
		   
			RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"), cap);

		   
		
		   
		
		

		

		driver.get("http://183.82.100.55/ranford2/");
		

		driver.manage().window().maximize();

	
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.id("login")).click();

		
		driver.close();
		
	}
	
	
	
	
	
	
	

}
