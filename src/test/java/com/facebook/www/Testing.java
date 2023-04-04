package com.facebook.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv=new FirefoxDriver();
		Thread.sleep(3000);
        rv.get("https://www.facebook.com/login/");
        rv.findElement(By.id("loginbutton")).click();
       
        
        

	}

}
