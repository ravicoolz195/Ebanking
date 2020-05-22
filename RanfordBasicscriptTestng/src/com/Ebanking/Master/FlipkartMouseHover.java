package com.Ebanking.Master;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		

	
		//private static final File TakesScreenshot = null;

	WebDriver driver=new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[3]/span"))).build().perform();
		

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[4]/a")).click();

		
		
		
		
		
		
		
		
		//driver.close();
	}

	
	

}
